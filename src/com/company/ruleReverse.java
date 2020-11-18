package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.Integer.parseInt;

public class ruleReverse implements ruleInterface{
    private int dividesBy;

    public ruleReverse(int div) {
        dividesBy = div;
    }

    @Override
    public String applyRule(int i,String s) {
        if(i % dividesBy == 0){
            boolean isNumber = true;
            try {
                int n = parseInt(s);
            }
            catch(NumberFormatException e){
                isNumber = false;
            }
            if(isNumber){
                return s;
            }else{
                return fizzBuzzReverse(s);
            }
        } else {
            return s;
        }
    }

    public String fizzBuzzReverse(String s){
        String[] separatedWords;
        separatedWords = new String[]{"", "", "", "", "", "", ""};
        for(int i = 0 ; i * 4 < s.length(); i ++){
            separatedWords[i] = s.substring(i*4,i*4+4);
        }
        List<String> reversedWords = Arrays.asList(separatedWords);
        Collections.reverse(reversedWords);
        String result = String.join("",reversedWords);
        //System.out.println(result);
        return result;
    }
}
