package ex_20072024;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
        // wap to take inputs from user and find even and odd numbers
        // with the help of Scanner class we can take input from user
        // we are using nextInt() function for assigning the input
        Scanner sc  =  new Scanner(System.in);        //creating an object of Scanner class
        System.out.println("please enter a number");
       int input =  sc.nextInt();         // 1. int size is  32 bit; 2. here we are  taking only integer input from user hence we are using nextInt();
        System.out.println("you have entered " + input );
        if(input% 2 == 0){
            System.out.println("input is even ");

        }else {
            System.out.println("input is odd");
        }

    }
}
