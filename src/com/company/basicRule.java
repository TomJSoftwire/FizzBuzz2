package com.company;

public class basicRule implements ruleInterface {
    private int dividesBy;
    private String word;

    public basicRule(int div, String wor) {
        dividesBy = div;
        word = wor;
    }

    @Override
    public String applyRule(int i,String s) {
        if(i % dividesBy == 0){
            return s + word;
        } else {
            return s;
        }
    }
}
