package org.example;

public class Student {

    private String name;
    private int[] marks;

    public Student(String name, int... marks) {
        this.name=name;
        this.marks=marks;
    }

    public int getNumberOfMarks() {
        return marks.length;
    }

    public int totalSumOfMarks() {
        int sum=0;
        for(int mark:marks){
            sum+=mark;
        }
        return sum;
    }

    public int getMaximumMark() {
        int max=0;
        for(int mark:marks){
            if(mark>max)
                max=mark;
        }
        return max;
    }

    public int getMinimumMark() {
        int min=getMaximumMark();
        for(int mark: marks){
            if(mark<min)
                min=mark;
        }
        return min;
    }
}
