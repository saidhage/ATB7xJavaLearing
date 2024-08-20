package ex_20072024;

import java.util.Scanner;

public class Lab102 {
    public static void main(String[] args) {
        //wap to find the largest among three numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int n1 = sc.nextInt();

        System.out.println("enter 2nd number");
        int n2 = sc.nextInt();

        System.out.println("enter 3rd number");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1>n3) {
            System.out.println(n1 + "is max number");             //F & T-->F    F & F --> F    T& T --> T
        } else if (n2> n1 && n2> n3) {
            System.out.println(n2 + "is max number");
        }
        else {
            System.out.println(n3 + "is max number");
        }


    }
}
