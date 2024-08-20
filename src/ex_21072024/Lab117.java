package ex_21072024;

public class Lab117 {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
            if(i==5){
                continue;
            }
            System.out.println("After");

        }
    }
}

//output -- when i ==5 it will not display/print  text "After"  and for rest it will display text "After" from 0 to 9
