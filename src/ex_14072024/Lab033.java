package ex_14072024;

public class Lab033 {
    public static void main(String[] args) {
        int a = 87;
        long b = 91;
        String s1 = "KK";
        String s2 = "VV";
        System.out.println(s1+s2+a+b);
        System.out.println(s1+s2+(a+b)); //BODMAS principal. brackets are solved first


        //KKVV8791 because it starts with a string so it concatenates
        System.out.println(a+b+s1+s2+s1);
        //

    }
}
