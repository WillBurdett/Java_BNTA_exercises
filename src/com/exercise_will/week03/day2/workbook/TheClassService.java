package com.exercise_will.week03.day2.workbook;

public class TheClassService {
    public void enrol(Student student, TheClass theClass){
        // check class capacity
        // check if student is in class
        // add student to class
        int counter = 0;
        for (Student s : theClass.getStudents()) {
            if (s == null){
                counter++;
            }
            if (student.equals(s)){
                throw new IllegalStateException("Already enrolled.");
            }
        }
    }
}
