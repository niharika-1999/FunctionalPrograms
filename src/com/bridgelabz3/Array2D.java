package com.bridgelabz3;
import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) {
		int row , col;
		int arr[][];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		row=scanner.nextInt();
		System.out.println("Enter the number of coloumn :");
		col=scanner.nextInt();
		arr=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("Enter the element of row =" +(i+1)+"coloumn =" +(j+1)+":");
				arr[i][j]=scanner.nextInt();
				
			}
				
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		
		
		}

	}
}
