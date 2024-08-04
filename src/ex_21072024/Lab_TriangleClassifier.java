package ex_21072024;

import java.util.Scanner;

public class Lab_TriangleClassifier {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Sides of triangle and I will let you know if triangle is equilateral or isosceles or scalene");
        System.out.println("Enter 1st side: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd side: ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd side: ");
        int c = sc.nextInt();

        if(a==b && b==c) {
            System.out.println("All Sides are equal, hence triangle is equilateral ");
        }
        else if (a==b || a==c || b==c) {
            System.out.println("Two sides are equal hence it is a isosceles triangle");
        }
        else {
            System.out.println("It is a scalene");
        }

    }


}
