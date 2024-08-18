package ex_12072024;

public class Lab024 {
    public static void main(String[] args) {
        //relational operators
        // > < >= <= != == (!=)
        //result is always true or false

        byte age = 33;
        byte age1 = 33;

        boolean result = age >= age1;
        boolean a = true;
        //OR GATE
        // age > age1 or age = age 1
        // either of the statement is true then ans is true
        System.out.println(result);
        System.out.println(!a);

        //AND GATE
        //age > age 1 and age = age1 both statements should be true else result is false

        System.out.println(10==10);
        System.out.println(10>=10);
        System.out.println(10<=10);
        System.out.println(10<10);
        System.out.println(10>10);


    }
}
