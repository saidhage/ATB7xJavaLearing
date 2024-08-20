package ex_20072024;

import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {
        // take a user input as a char and tell the user that it is a vowel or not

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a char");
        char c = sc.next().charAt(0);

        switch (c) {
            case 'a' :
                System.out.println("its vowel");
                break;
            case 'e' :
                System.out.println("its vowel");
                break;
            case 'i' :
                System.out.println("its vowel");
                break;

            case 'o' :
                System.out.println("its vowel");
                break;

            case 'u' :
                System.out.println("its vowel");
                break;

            default :
                System.out.println("its not a vowel");
        }




    }
}
