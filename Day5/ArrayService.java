package com.demo.servie;

import java.util.Scanner;

public class ArrayService {

	public static int[][] rotateRowWise(int[][] arr, int n) {
int[] temp1 = arr[0];
		
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp1;
		return arr;
	}

	public static int addAllElement(int[][] arr) {
		int sum =0;
		for(int i=0;i <arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum = sum +arr[i][j];
			}
		}
		return sum;
	}

	public static void displayData(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print((arr)[i][j]+"\t");
		}
			System.out.println();
		}
		
	}

	public static void acceptData(int[][] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Element:");
		for(int i=0;i <arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
	}

}
