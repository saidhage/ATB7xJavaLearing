package ex_14072024;

public class Lab040 {
    public static void main(String[] args) {


    String s1 = new String("abc");
    String s2 = new String("abc");
    String s3 = new String("abc");

    //total 3 strings are created and stores separately in heap with their own memories

        System.out.println(s1 == s2);
        System.out.println(s1==s3);
        System.out.println(s2.equals(s3));  //content is same
}
}
