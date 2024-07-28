package ex_27072024;

public class LabArray_SecondMaxElement {

    public static void main (String[] args) {

        int[] salaries = {7, 10, 31, 25, 18, 9, 11};

        // Assuming highest and second highest
        int highest = salaries[0];
        int second_highest = salaries[0];
        int third_highest  = salaries[0];

        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > highest) {
                highest = salaries[i];
            } else if (salaries[i] > second_highest) {
                second_highest = salaries[i];
            } else if (salaries[i] >third_highest) {
                third_highest = salaries[i];
            }

        }
        System.out.println("Highest salary: " + highest);
        System.out.println("Second Highest salary: " + second_highest);
        System.out.println("Third Highest salary: " + third_highest);
        }

    }

