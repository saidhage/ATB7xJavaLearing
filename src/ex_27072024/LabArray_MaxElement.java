package ex_27072024;

public class LabArray_MaxElement {

    public static  void main (String[] args) {

        //find max number form array

        int arr [] = {10,20,30,50,40};

        int max = arr[0]; //stored 0th index value i.e. 10 as a max

        for (int i =0; i< arr.length; i++){
            if (arr[i]> max) {
                max = arr[i];


            }
        }

        System.out.println("max element is " + max);


    }

}
