package ex_20072024;

import java.sql.SQLOutput;

public class Lab_FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("-->FizzBuzz");             //maximum condition should always be at the top


            else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Bizz");

            } else {
                System.out.println(i);
            }


        }
    }}
