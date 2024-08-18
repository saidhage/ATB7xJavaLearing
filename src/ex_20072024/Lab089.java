package ex_20072024;

import java.util.Scanner;

public class Lab089 {
    public static void main(String[] args) {
        // wap grade calculator

        Scanner sc = new Scanner(System.in);
        System.out.println("pls enter your percentage");
        float marks = sc.nextFloat();
        if (marks >= 90 && marks <= 100) {
            System.out.println("You are in Grade A");
        } else if (marks >=80 && marks <=89) {
            System.out.println("You are in grade B");
        }else if (marks >= 70 && marks <= 79) {
            System.out.println("You are in Grade C");
        }
        else if (marks <= 0 || marks >= 100) {
            System.out.println("Are you a god? ");
        }
        else {
            System.out.println("fail");
        }
       sc.close();
    }
}
