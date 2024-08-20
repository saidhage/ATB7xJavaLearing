package ex_20072024;

import java.util.Scanner;

public class Lab097 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a char");
        char input = sc.next().charAt(0);


        switch (input) {
            case  'a', 'e', 'i', 'o', 'u' :
                System.out.println("Its a vowel ");
                break;
            default :
                System.out.println("Its not a vowel");
        }


    }
}
