package com.bridgelabz3;
//Sum of 3 integers adds to 0

public class SumOf3Equals0 {
	public static void main(String[] args) {
		int givenArray[] = {1,2,4,5,6,-3,-1};
		for(int i =0;i<givenArray.length;i++) {
			for(int j =i+1;j<givenArray.length;j++) {
				for(int k =j+1;k<givenArray.length;k++) {
					if(givenArray[i]+givenArray[j]+givenArray[k]==0) {
						System.out.println("Number :"+givenArray[i] +givenArray[j]+ +givenArray[k]);
					}
				}
			}
			
			
		}
	}

}
