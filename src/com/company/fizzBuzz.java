package com.company;

public class fizzBuzz {
    basicRule ruleFizz = new basicRule(3,"Fizz");
    basicRule ruleFezz = new basicRule(13,"Fezz");
    basicRule ruleBuzz = new basicRule(5,"Buzz");
    basicRule ruleBang = new basicRule(7,"Bang");
    RuleBong ruleBong = new RuleBong();
    public String getFizzBuzz(int number){
        String result = "";
        result = ruleFizz.applyRule(number,result);
        result = ruleFezz.applyRule(number,result);
        result = ruleBuzz.applyRule(number,result);
        result = ruleBang.applyRule(number,result);
        result = ruleBong.applyRule(number,result);
        return (result.equals("")) ? Integer.toString(number) : result;
    }
}
