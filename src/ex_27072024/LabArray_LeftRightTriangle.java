package ex_27072024;

public class LabArray_RightTriangle {

    public static  void main (String[] args)

    {
        for (int i=0; i<=5; i++){
            for (int j=0; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");


        for (int l=5; l>=0; l--){
            for (int m=0; m<=l; m++){
                System.out.print(" *");
            }
            System.out.println();
        }


    }
}



