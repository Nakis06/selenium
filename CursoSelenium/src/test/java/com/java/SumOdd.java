package com.java;

public class SumOdd {
	public boolean isOdd(int number) {
		if(number < 0) {
			return false;
		}else if (number % 2 != 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public int sumOdd(int start, int end) {
		int sum = 0;
		if(start<=end && start>0 && end>0) {
			for (int i=start; i<=end;i++) {
				if(isOdd(i)) {
					sum = sum + i;
				}
			}
			return sum;
		}else {
			return -1;
		}

	}

}
