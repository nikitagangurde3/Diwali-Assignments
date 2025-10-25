package com.demo.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Student;
import com.demo.exception.LowAttendanceException;

public class TestStudent {
	public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Amit", "Java", 80, 90));
        students.add(new Student(2, "Poonam", "Python", 75, 85));
        students.add(new Student(3, "Raj", "C++", 55, 88));   
        students.add(new Student(4, "Neha", "Java", 92, 95));
        students.add(new Student(5, "Karan", "Python", 63, 60));
        students.add(new Student(6, "Simran", "ML", 70, 78));
        students.add(new Student(7, "Ravi", "Java", 59, 50)); 
        students.add(new Student(8, "Priya", "AI", 85, 67));
        students.add(new Student(9, "Asha", "C", 90, 55));
        students.add(new Student(10, "Nikhil", "DSA", 65, 72));
        for (Student s : students) {
            try {
                s.calculateGrade();
            } catch (LowAttendanceException e) {
                System.out.println("Warning: " + e.getMessage());
            }
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
            oos.writeObject(students);
            System.out.println("Students saved to file successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }

       
        students.sort((s1, s2) -> Double.compare(s2.getAttendance(), s1.getAttendance()));

        System.out.println("Students in decreasing order of attendance:");
        for (Student s : students)
            System.out.println(s);
}
}
