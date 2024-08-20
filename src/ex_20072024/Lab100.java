package ex_20072024;

import java.util.Scanner;

public class Lab100 {
    public static void main(String[] args) {
        //wap for taking input from user for name age and salary and then print it

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String s = sc.next();
        System.out.println("Please enter your age");
        int  age = sc.nextInt();
        System.out.println("Please enter your salary");
        double  sal = sc.nextDouble();

        System.out.println(s + age + sal);

      sc.close();

    }
}
