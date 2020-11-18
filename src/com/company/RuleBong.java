package com.company;

public class RuleBong implements ruleInterface{
    private String WORD = "Bong";

    @Override
    public String applyRule(int i, String s) {
        return WORD;
    }
}
