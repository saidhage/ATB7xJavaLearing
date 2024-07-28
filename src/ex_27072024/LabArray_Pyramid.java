package ex_27072024;

public class LabArray_Pyramid {
    public static void main (String [] args){


        int i, j, k, n=8;                    //i-rows , j- *   , k- space n = column

        for (i=1; i<=n; i++)
        {
            // Print spaces before the stars on each line
            for (k=1; k<=n-i; k++)
            {
                System.out.print(" ");
            }
            // To Print stars
            for (j=1; j<=i; j++)
            {
                System.out.print("X ");
            }
            // Move to the next line
            System.out.println();

        }
        System.out.println("+++++++++++++++++RIGHT MIRROR TRIANGLE++++++++++++++++");
        System.out.println("+++++++++++++++LEFT TRIANGLE+++++++++++++ ");
        for (int a=1; a<=5; a++){ //for row loop

            for (int b=4; b>=a; b--){ //for space loop
                System.out.print(" ");
            }//end space loop

            for (int c=1; c<=a; c++){ // for column loop
                System.out.print("X");

            } //end column loop
            System.out.println();
        } //end row loop

    }
}
