package com.company;
//test
public class Main {

    public static void main(String[] args) {
	// write your code here
        fizzBuzz test = new fizzBuzz();
        for(int i = 1 ; i <= 100 ; i++) {
            System.out.println(test.getFizzBuzz(i));
        }
    }
}
