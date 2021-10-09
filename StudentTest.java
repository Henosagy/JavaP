package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1;
    List<Double> grades = new ArrayList<>();

    @BeforeEach
    public void setup(){
        grades.add(2.0);
        grades.add(4.0);
        grades.add(5.0);
        grades.add(3.0);
        s1 = new Student(grades);

    }

    @Test
    void getAverageGrades() {
        double average = (2.0 + 4.0 +5.0 + 3.0)/4;
        double expected = Math.round(( average * 100.00)/100.00);
        double actual= s1.getAverageGrades();
        assertEquals(expected,actual);

    }
}