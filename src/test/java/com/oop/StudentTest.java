package com.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test
    void testUpdateGrade() {
       
        Student student = new Student();

       
        student.updateGrade(85);

       
        assertEquals(85, student.grade);
    }
}
