package ex_20072024;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
        // Max number in two inputs

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter first number");
        int finput = sc.nextInt();
        System.out.println("pls enter second input");
        int sinput = sc.nextInt();
      //find max number by using math.max
      //  System.out.println("max number is " + Math.max(finput, sinput));
        // find max number by using if condition

        if(finput > sinput) {
            System.out.println("Max number is " + finput);
        }
        else if (sinput > finput){
            System.out.println("Max number is " + sinput);
        }else {
            System.out.println("Equal");
        }

    }
}
