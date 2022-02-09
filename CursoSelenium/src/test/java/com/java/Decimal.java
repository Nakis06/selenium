package com.java;

public class Decimal {
	public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
		if (number1 > 0 && number2 < 0 || number1 < 0 && number2 > 0) {
			return false;
		} else {
			String one = Double.toString(number1);
			String two = Double.toString(number2);
			String[] arr1 = one.split("\\.");
			String[] arr2 = two.split("\\.");
			int longitud = getMaxIndex(arr1[1].length());
			int longitud2 = getMaxIndex(arr1[1].length());
			if(longitud == 3 && longitud2==3) {
				if (arr1[1].substring(0, 3).equals(arr2[1].substring(0, 3))) {
					return true;
				} else {
					return false;
				}
			}else if(longitud==longitud2){
				if (arr1[1].substring(0, longitud).equals(arr2[1].substring(0, longitud))) {
					return true;
				} else {
					return false;
				}
			}
			return false;
		}
	}

	public static int getMaxIndex(int stringSize) {
		if (stringSize >= 3) {
			return 3;
		} else {
			return stringSize;
		}
	}
}
