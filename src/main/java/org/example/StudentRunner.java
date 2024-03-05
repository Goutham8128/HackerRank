package org.example;

public class StudentRunner {
    public static void main(String[] args){
        System.out.println("");
        //int[] marks={99,2,332,22};
        Student student=new Student("Goutham",99,2,33,22);
        Student student1=new Student("Ravi",992,33,22,2);

        int number=student.getNumberOfMarks();
        System.out.println("number of marks is: "+number);
        int number1=student1.getNumberOfMarks();
        System.out.println("number1 of marks is: "+number1);

        int sum=student.totalSumOfMarks();
        System.out.println("Sum of marks is: "+sum);
        int sum1=student1.totalSumOfMarks();
        System.out.println("Sum1 of marks is: "+sum1);

        int max=student.getMaximumMark();
        System.out.println("Max mark is: "+max);
        int max1=student1.getMaximumMark();
        System.out.println("Max1 mark is: "+max);

        int min=student1.getMinimumMark();
        System.out.println("Min Mark is:"+min);
        int min1=student1.getMinimumMark();
        System.out.println("Min1 Mark is: "+min);



    }
}
