# Spring Cloud Microservices - version 2 with updated components   
This project will have microservices using the latest spring cloud components


## Ports
| Service | Port |
| ------- | ---- |
| Limits Services | 8080 |
| Spring Config Server | 8888 |
| Currency Exchnage Service | 8000 |
| Currency Conversion Service | 8100 |
| Eureka - Naming server | 8761 |
| API Gateway | 8765 |


## Autoreload in intellij
During development it is good to hvae live reload when any file changes.  It is provided by spring dev tools.  For it to take effect we have to set the following in intellij.  Go to: file->settings->build,execution,deployment. Go to ->compiler->build project automatically.

## URLs
Currency Exchange service - http://localhost:8000/currency-exchange/from/USD/to/INR
Currency Conversion service - http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/10
Eureka Naming server - http://localhost:8761/
API Gateway - http://localhost:8765/




Thru gateway
- http://localhost:8765/CURRENCY-EXCHANGE/currency-exchange/from/USD/to/INR
- http://localhost:8765/CURRENCY-CONVERSION/currency-conversion/from/USD/to/INR/quantity/10
- http://localhost:8765/CURRENCY-CONVERSION/currency-conversion-feign/from/USD/to/INR/quantity/10



Lower Case
- http://localhost:8765/currency-exchange/currency-exchange/from/USD/to/INR
- http://localhost:8765/currency-conversion/currency-conversion/from/USD/to/INR/quantity/10
- http://localhost:8765/currency-conversion/currency-conversion-feign/from/USD/to/INR/quantity/10



Custom Routes
- http://localhost:8765/currency-exchange/from/USD/to/INR
- http://localhost:8765/currency-conversion/from/USD/to/INR/quantity/10
- http://localhost:8765/currency-conversion-feign/from/USD/to/INR/quantity/10
- http://localhost:8765/currency-conversion-new/from/USD/to/INR/quantity/10


## Resiliency
Added CircuitBreakerController with @Retry.  It fails after 3 retries - http://localhost:8001/sample-api


## Distributed tracing using zipkin 
Run zipking in docker using command 'docker run -p 9411:9411 openzipkin/zipkin:2.23'.  The visit page http://localhost:9411/zipkin/

Add spring-cloud-started-sleuth and spring-cloud-sleuth-zipkin to projects so that Sleuth generates the trace id that gets propagated in each spring call.  Add spring.sleuth.sampler.probability to the application properties to specifies amount of logging (1.0 means 100%)


## Build Image
Add configuration entry for image and pullPolicy into maven build plugins in pom.xml. After that run following to build image - 'mvn spring-boot:build-image -DskipTests'.  Run the container using 'docker run -p 8000:8000 in28min/mmv2-currency-exchange-service:0.0.1-SNAPSHOT'.  Note that in28min/mmv2-.. was added as image name.

## Docker compose
go to docker directory and run 'docker-compose up'


