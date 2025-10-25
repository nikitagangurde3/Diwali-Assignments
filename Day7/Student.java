package com.demo.beans;
import java.io.Serializable;
import com.demo.exception.LowAttendanceException;

public class Student implements Serializable {
    private int rollno;
    private String sname;
    private String course;
    private double attendance_percentage;
    private double score;
    private String grade;

 
    public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String sname, String course, double attendance_percentage, double score) {
        this.rollno = rollno;
        this.sname = sname;
        this.course = course;
        this.attendance_percentage = attendance_percentage;
        this.score = score;
    }

    public void calculateGrade() throws LowAttendanceException {
        if (attendance_percentage < 60)
            throw new LowAttendanceException("Attendance less than 60% for ");

        if (score >= 90)
            grade = "A";
        else if (score >= 75)
            grade = "B";
        else if (score >= 50)
            grade = "C";
        else
            grade = "D";
    }

    public double getAttendance() {
        return attendance_percentage;
    }

    @Override
    public String toString() {
        return rollno + "\t" + sname + "\t" + course + "\t" + attendance_percentage + "%\t" + score + "\t" + grade;
    }
}
