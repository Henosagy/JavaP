package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;

class NaughtyStudentTest {
    NaughtyStudent richard;
    ArrayList<Double> reportedGrades = new ArrayList<>();

    @BeforeEach
    void setUp() {
        reportedGrades.add(3.2);
        reportedGrades.add(8.6);
        reportedGrades.add(7.2);
        richard = new NaughtyStudent(reportedGrades);
    }

    @Test
    void testNaughtyInstanceOfStudent(){
        assertTrue(richard instanceof Student);
    }

    @Test
    void testIncreasedReportedGrades() {
        //double expected = (Math.round((3.2 + 8.6 + 7.2) *100.00/ 3) /100.00)*1.1;
        double expected = richard.getAverageGrades();
        double actual = richard.getAverageGrade();
        assertNotEquals(expected,actual);
        //Assertions.assertEquals(expected, actual);
    }

}