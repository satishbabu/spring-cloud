package com.apnatriangle.microservices.limitsservices.bean;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Limits {
    private int minimum;
    private int maximum;
}
