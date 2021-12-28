package com.test.service;

import com.test.helper.BracketHelper;
import com.test.model.BracketModel;
import com.test.model.PatternModel;

public class BracketService {
    public BracketModel calculateBracketCombinations(int number){
        char[] str = new char[2 * number];
        PatternModel patternModel  = BracketHelper.calculate(str, number);
        return new BracketModel(patternModel.getCounter(), patternModel.getPattern());
    }
}
