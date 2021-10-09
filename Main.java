package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student s1;
        Student s2;
        List<Double> grades = new ArrayList<>();
        grades.add(2.0);
        grades.add(4.0);
        grades.add(6.0);
        grades.add(3.0);
        List<Double> grades1 = new ArrayList<>();
        grades1.add(12.0);
        grades1.add(14.0);
        grades1.add(16.0);
        grades1.add(13.0);
        s1 = new Student(grades);
        s2 = new Student(grades1);
        Lecture biology = new Lecture();
        biology.enter(s1);
        biology.enter(s2);
        System.out.println(biology.getHighestAverageGrade());

    }
}
