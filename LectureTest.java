package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class LectureTest {
    Lecture biology;
    Student s1;
    Student s2;
    List<Double> grades = new ArrayList<>();

    @BeforeEach
    public void setup(){
        biology = new Lecture();
        s1 = mock(Student.class);
        when(s1.getAverageGrades()).thenReturn(5.0);
        s2 = mock(Student.class);
        when(s1.getAverageGrades()).thenReturn(5.0);
    }

    @Test
    void enter(){
        biology.enter(s1);
        assertEquals(1, biology.getStudentSize());
    }

    @Test
    void getHighestAverageGrade() {
        biology.enter(s1);
        biology.enter(s1);
        double actual = biology.getHighestAverageGrade();
        assertEquals(5.0, actual);
    }
}