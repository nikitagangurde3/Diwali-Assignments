package com.demo.test;
import java.util.Scanner;

import com.demo.servie.ArrayService;

public class TestArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[3][3];
		int[][] arr1=new int[3][3];
		ArrayService.acceptData(arr);
		ArrayService.displayData(arr);
		int choice;
		do {
			System.out.println("1.Add All Numbers.");
			System.out.println("2.Rotate Matrix Row Wise.");
			System.out.println("3.Display Array..");
			System.out.println("4.Exit.");
			System.out.println("Enter Choice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1: int  sum =ArrayService.addAllElement(arr);
				System.out.println("Addition of all Array Elements is:"+sum);
			break;
			
			
		    
			case 2:System.out.println("Enetr number of Rotation:");
			int n = sc.nextInt();
			int[][] rotateRow = ArrayService.rotateRowWise(arr,n);
			ArrayService.displayData(rotateRow);
			break;
			
			case 3:ArrayService.displayData(arr);
			
			
			case 4:System.out.println("Thank you .");
			break;
			
			default :System.out.println("Wrong Choice.");
			break;
			}
			}while(choice!=14);
		
	}
}