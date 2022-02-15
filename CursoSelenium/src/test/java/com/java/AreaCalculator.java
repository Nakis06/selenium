package com.java;

public class AreaCalculator {
	public static double radius(double radius) {
		if(radius < 0) {
			return -1.0;
		}else {
			return radius*radius*Math.PI;
		}
	}
	public static double radius (double sideA, double sideB) {
		if(sideA<0 || sideB<0) {
			return -1;	
		}else {
			return sideA*sideB;
		}
		
	}

}
