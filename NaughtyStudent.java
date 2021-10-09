package com.company;
import java.util.List;

public class NaughtyStudent extends Student {
    public NaughtyStudent(List<Double> studentGrades) {
        super(studentGrades);
    }

    public double getAverageGrade() {
        double average = super.getAverageGrades();
        return (average * 1.1);
    }
}
