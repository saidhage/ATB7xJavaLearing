package ex_20072024;

import java.util.Scanner;

public class Lab092 {
    public static void main(String[] args) {
        //switch condition --- whenever we have 2+ condition

        //1. java switch statement executes one statement from multiple conditions
        //2. java switch expressions must be of byte,short,int, long(with wrapper type), enums and String
        //3. case/s values are not allowed
        //4. Variables are not allowed
        //5. breaks cant be used with ifelse conditions

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a day from 1 to 7");
        int day = sc.nextInt();

        switch (day) {
            case 1 :
                System.out.println("Mon");
                break;
            case 2 :
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4 :
                System.out.println("Thur");
                break;
            case 5 :
                System.out.println("Fri");
                break;
            case 6 :
                System.out.println("Sat");
                break;
            case 7 :
                System.out.println("Sun");
                break;

            default:
                System.out.println("-------No idea ---------");
        }




    }
}
