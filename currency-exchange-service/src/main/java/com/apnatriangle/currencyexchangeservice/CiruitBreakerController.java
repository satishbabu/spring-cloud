package com.apnatriangle.currencyexchangeservice;

import io.github.resilience4j.retry.annotation.Retry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class CiruitBreakerController {

    @GetMapping("/sample-api")
    @Retry(name="sample-api", fallbackMethod = "hardcodedResponse")
    public String sampleApi() {
        log.info("In sampleApi()");

        ResponseEntity<String> forEntity = new RestTemplate().getForEntity(
                "http://locahost:8080/some-dummy-url",
                String.class);
        return forEntity.getBody();
    }

    public String hardcodedResponse(Exception ex) {
        return "fallback-response";
    }
}
