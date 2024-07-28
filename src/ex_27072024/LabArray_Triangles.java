package ex_27072024;

public class LabArray_Triangles {

    public static void main (String [] args){
        System.out.println("RIGHT TRIANGLE");
        for (int i=1; i<=5; i++){        //works for row
            for (int j=1; j<=i; j++) {   //works for column
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("+++++++++++++++++++++TRIANGLE+++++++++++++++++++++++++++++++++");


        for (int k=5; k>=1; k--){
            for (int l=1; l<=k; l++){
                System.out.print("* ");
            }
            System.out.println("");
        }




    }
}

