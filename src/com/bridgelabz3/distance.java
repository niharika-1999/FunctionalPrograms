package com.bridgelabz3;
//Euclidian Distance

public class distance {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[0]);
		double distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		System.out.println("Distance from(0,0) to("+x+","+y+") is "+distance);
		
	}

}
