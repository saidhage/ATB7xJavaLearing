package ex_20072024;

import java.util.Locale;
import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter browser name");
        String browser = sc.next();       //for taking string input we use .next
        browser = browser.toLowerCase();

        switch (browser) {
            case "chrome" :
                System.out.println("Staring chrome browser");
                break;
            case "safari" :
                System.out.println("Staring safari browser");
                 break;
            case "edge" :
                System.out.println("Staring edge browser");
                break;
            default :
                System.out.println("Wrong browser");

        }

    }
}
