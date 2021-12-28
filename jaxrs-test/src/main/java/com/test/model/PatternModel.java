package com.test.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatternModel {
    public PatternModel(String pattern, int counter){
        this.pattern = pattern;
        this.counter = counter;
    }
    private String pattern;
    private int counter;
}
