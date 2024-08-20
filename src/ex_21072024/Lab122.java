package ex_21072024;

import java.util.Scanner;

public class Lab122 {
    public static void main(String[] args) {
        //factorial prgm
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number and I will print factorial ");
        int a = sc.nextInt();
       int fact =1;
        for (int i = 1; i <=a ; i++) {

            fact = fact*i;
        }
        System.out.println(fact);
        sc.close();
    }
}
