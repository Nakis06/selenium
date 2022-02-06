package com.java;

public class BytesKiloBytes {
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		//1 MB = 1024 Kb
		if(kiloBytes>0) {
			int kBytes = kiloBytes % 1024; //to know the number of kilobytes
			int megaBytes = kiloBytes/1024;
			System.out.println(kiloBytes + " KB = "+ megaBytes + " MB and " + kBytes + " KB");
		}else {
			System.out.println("Invalid value");
		}
	}

}
