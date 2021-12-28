package com.test.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BracketModel {
    public BracketModel(){}
    public  BracketModel(int numberOfCombinations, String message){
        this.message = message;
        this.numberOfCombinations = numberOfCombinations;
    }
    private int numberOfCombinations;
    private String message;
}
