package ex_21072024;

public class Lab115 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {           //when i =5 then i want to close the loop
                break;              //break can be used only with the condition here i==5 is a condition
            }
            System.out.println(i);
        }
    }
}
