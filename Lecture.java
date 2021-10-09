package com.company;

import java.util.ArrayList;
import java.util.List;

public class Lecture {
    private List<Student> studentList = new ArrayList<>();

    public int getStudentSize() {
        return studentList.size();
    }

    public void enter(Student students){
        if(!studentList.contains(students)){
            this.studentList.add(students);
        }
        else{
            System.out.println("Student already enrolled in lecture");
        }
    }

    public double getHighestAverageGrade(){
        /*double maxAverageGrade = Double.MIN_VALUE;
        for(Student student: studentList){
            maxAverageGrade = Math.max(maxAverageGrade, student.getAverageGrades());
        }*/
        //return maxAverageGrade;

        return studentList.stream().mapToDouble(Student::getAverageGrades).max().getAsDouble();

        
    }


}

