package com.test.helper;

import com.test.model.PatternModel;

public class BracketHelper
{
    static String pattern = "";
    static int counter = 0;

    private static void calculateBrackets(char str[], int pos, int n, int open, int close)
    {
        if(close == n)
        {
            for(int i=0;i<str.length;i++)
                pattern += (str[i]);
            pattern += "\n"; counter++;
            return;
        }
        else
        {
            if(open > close) {
                str[pos] = ')';
                calculateBrackets(str, pos+1, n, open, close+1);
            }
            if(open < n) {
                str[pos] = '(';
                calculateBrackets(str, pos+1, n, open+1, close);
            }
        }
    }

    public static PatternModel calculate(char str[], int n)
    {
        if(n > 0)
            calculateBrackets(str, 0, n, 0, 0);

        return new PatternModel(pattern, counter);
    }
}