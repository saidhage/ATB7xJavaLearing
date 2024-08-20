package ex_20072024;

public class Lab099 {
    public static void main(String[] args) {
        //switch never return anything but after JDK 13 switch can return something
        char code = 'A';
        int val = switch(code) {
            case 'A' :
                yield 65 ; // yield means return in future
            default:
                throw new IllegalStateException("Unexpected"+ code);

        };
        System.out.println(val);
    }
}
