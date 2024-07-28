package ex_27072024;

public class LabArray_SecondMaxElement {

    public static void main (String[] args) {


 int[] sal = {7, 10, 4, 13, 35, 28, 9, 8, 17};

        int highest = sal[0];
        int second_highest = sal[0];

        for (int i = 0; i < sal.length; i++) {

            if(sal[i]>highest){
                highest = sal[i];
            }
            else if(sal[i] > second_highest){
                second_highest = sal[i];
            }

        }
        System.out.println("MAX Salary : " +highest);
        System.out.println("Second Salary : " +second_highest);



    }
}
