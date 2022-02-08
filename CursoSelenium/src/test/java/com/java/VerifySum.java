package com.java;

public class VerifySum {
	public boolean hasEqualSum(int num1, int num2, int num3) {
		int sum = 0;
		sum = num1 + num2;
		if(sum == num3) {
			return true;
		}else {
			return false;
		}
	}
}
