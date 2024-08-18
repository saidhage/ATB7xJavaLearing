package ex_20072024;

public class Lab096 {
    public static void main(String[] args) {
        //can we have two cases with same name ?
        //2 same conditions can not be in the same switch

        //ex-
        int a =98;
        switch (a) {
            case 98 :
                System.out.println("vali -98");
                break;
            case 98 :
                System.out.println("vai - 98");
        }
    }
}
