package com.demo.test;

import java.util.Scanner;

import com.demo.service.Calculator;

import study.WrongOperatorException;

public class TestCalculator {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        try {
	            System.out.print("Enter first number: ");
	            int n1 = sc.nextInt();

	            System.out.print("Enter second number: ");
	            int n2 = sc.nextInt();

	            System.out.print("Enter operator (+, -, *, /, %): ");
	            String op = sc.next();

	            int result = Calculator.calculate(n1, n2, op);
	            System.out.println("Result: " + result);

	        } catch (WrongOperatorException e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (ArithmeticException e) {
	            System.out.println("Math Error: " + e.getMessage());
	        } finally {
	            sc.close();
	        }
	    }
	

}
