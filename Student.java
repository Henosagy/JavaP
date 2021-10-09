package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student implements Nameable{
    private String name;
    private List<Double> studentGrades = new ArrayList<>();
    public Student() {

    }

    public Student(List<Double> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public double getAverageGrades(){
       /* double sum = 0.0;
        for(Double grade : studentGrades){
            sum += grade;
        }
        double average = sum/this.studentGrades.size();
        return Math.round((average * 100))/100.00;
        */
        //return average;
        //(studentGrades.stream().mapToDouble(Double::doubleValue).reduce(0.0, (a,b) -> a+b))/studentGrades.size();
        //double average = (studentGrades.stream().mapToDouble(value -> value).sum())/studentGrades.size();
        double average = (studentGrades.stream().mapToDouble(value -> value).average()).orElse(0);
        return Math.round(average*100.00)/100.00;

    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
