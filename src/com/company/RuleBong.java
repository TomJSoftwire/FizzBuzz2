package com.company;

import java.util.regex.Pattern;

public class RuleBong implements ruleInterface{
    //private String[] overides = {"Fizz","Buzz","Bang"};

    private int dividesBy;
    private String word;

    public RuleBong(int div, String wor) {
        dividesBy = div;
        word = wor;
    }

    @Override
    public String applyRule(int i, String s) {
        if(i % dividesBy == 0){
            return s.replaceAll("Fizz|Buzz|Bang|[0-9]","") + word;
        }
        return s;
    }
}
