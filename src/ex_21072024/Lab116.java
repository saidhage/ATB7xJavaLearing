package ex_21072024;

public class Lab116 {
    public static void main(String[] args) {
        //print only even numbers form 0 to 50 by using loop

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
        //2nd program to print all the odd numbers form 0 to 50 by using loop

        for (int j = 0; j <= 50; j++) {
            if (j % 2 != 0) {
                System.out.print( j);
            }
        }
    }
}
