package com.bridgelabz3;
//WindChill Program

public class WindChill {
	public static void main(String[] args) {
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		double w =34.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
		System.out.println("Temperature = " +t);
		System.out.println("WindSpeed = " +v);
		System.out.println("WindChill = " +w);
		
	}

}
