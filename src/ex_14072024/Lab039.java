package ex_14072024;

public class Lab039 {
    public static void main(String[] args) {

        String name = "xyz";
        String name1 = "xyz";
        //SCP keeps unique value;

        String name2 = new String("xyz"); //Heap
        String name3 = new String("xyz"); //Heap 2nd string

        System.out.println(name == name2);  //check for reference SCP vs HEAP
        System.out.println(name == name1);  //check for reference
        System.out.println(name.equals(name2)); //check for content

    }
}
