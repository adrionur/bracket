package service;

import helper.BracketHelper;

public class BracketService {
    public int calculateBracketCombinations(int number)
    {
        int n = 3;
        char[] str = new char[2 * n];
        return BracketHelper.calcuateParenthesis(str, n);
    }
}
