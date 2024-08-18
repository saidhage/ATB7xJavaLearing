package ex_14072024;

public class Lab021 {
    public static void main(String[] args) {
        //these are escape characters
        char c = '\n';  //adds new line
        char c2 = '\t'; //add a tab space
        char c3 = '\r';  //deleted previous word
        char c4 = '\b'; //delete previous char

        String name = "Sai";
        String last_name = "Prasad";

        System.out.printf("My name is %s %s \n", name,last_name);
        System.out.println(name + c3 + last_name);
    }
}
