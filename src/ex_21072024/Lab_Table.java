package ex_21072024;

import java.util.Scanner;

public class Lab_Table {
    public static void main(String[] args) {
       //program for table by using for loop
        System.out.println("Table by using for loop");
        int n = 5;
        for (int i = 1; i <= 10; i++) {
           // System.out.printf("%d\t%d\t\n", i +"x" + n +"=",n * i);
          //  System.out.println(n*i);

            System.out.println(n+"*"+i+"="+n*i);
        }
        System.out.println(" ");
        System.out.println(" ");

        //program for table by using while loop
        System.out.println("Table by using while loop");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number for table");
        int a = sc.nextInt();
        int i=1;
        System.out.println("Please enter number for range");
        int range = sc.nextInt();
        while(i<=range) {
            System.out.println(a+"*"+i+"="+a*i);
            i++;
        }

       //program for table by using printf
        System.out.println("Program for table by using printf");

        int n2 = 10;
        for (int j = 1; j <= n2; j++) {
            System.out.printf("%d %d %n", j+'x'+n2+'=', n2*j);
        }

    }
}