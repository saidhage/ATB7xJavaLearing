package ex_20072024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_LeapYear {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a Year");
        int a = sc.nextInt();

        if (a% 4 ==0  || a%400 ==0) {
            System.out.println("Year is a leap year");
        }
        else {
            System.out.println("Year is not a leap year");
        }
    }

}
