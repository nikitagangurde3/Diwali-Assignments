package com.demo.service;
import java.util.Scanner;

public class ArrayService {

    public static void acceptData(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void displayData(int[] arr) {
        for (int num : arr) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }

    public static int[] mergeArray(int[] nums1, int[] nums2) {
    	    int n1 = nums1.length;
    	    int n2 = nums2.length;
    	    int[] merged = new int[n1 + n2];
    	    int i = 0, j = 0, k = 0;
    	   
    	    while (i < n1 && j < n2) {
    	        if (nums1[i] < nums2[j]) {
    	            merged[k] = nums1[i];
    	            i++;
    	        } else {
    	            merged[k] = nums2[j];
    	            j++;
    	        }
    	        k++;
    	    }

    	  
    	    while (i < n1) {
    	        merged[k] = nums1[i];
    	        i++;
    	        k++;
    	    }

    	   
    	    while (j < n2) {
    	        merged[k] = nums2[j];
    	        j++;
    	        k++;
    	    }

    	    return merged;
    	

    }
}
