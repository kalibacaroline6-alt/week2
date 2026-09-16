package com.oop;

public class Student {

    String name;
    int grade;

    public void updateGrade(int newGrade) {
        if (newGrade >= 0 && newGrade <= 100) {
            this.grade = newGrade;
        }
    }
}