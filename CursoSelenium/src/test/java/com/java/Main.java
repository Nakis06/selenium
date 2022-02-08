package com.java;

public class Main {

	public static void main(String[] args) {
		// -- Barking dog
		boolean wakeUp;
		BarkingDog dog = new BarkingDog();
		wakeUp = dog.shouldWakeUp(true, 1);
		System.out.println("Valor para true hora 1 " + wakeUp);
		wakeUp = dog.shouldWakeUp(false, 2);
		System.out.println("Valor para false hora 2 " + wakeUp);
		wakeUp = dog.shouldWakeUp(true, 8);
		System.out.println("Valor para true hora 8 " + wakeUp);
		wakeUp = dog.shouldWakeUp(true, -1);
		System.out.println("Valor para true hora -1 " + wakeUp);
		
		//--Velocity test
		String velocity;
		VelocityTest car = new VelocityTest();
		velocity=car.validateVelocity("Carretera", 60);
		System.out.println("Carretera - 60kms " + velocity);
		velocity=car.validateVelocity("ZonaEscolar", 60);
		System.out.println("Zona escolar - 60kms " + velocity);
		velocity=car.validateVelocity("CalleNormal", 90);
		System.out.println("Calle normal - 90kms " + velocity);
		
		//--Decimal
		
		//--Cat
		boolean playing;
		Cat cat = new Cat();
		playing = cat.isCatPlaying(true, 10);
		System.out.println("Verano 10 grados " + playing);
		playing = cat.isCatPlaying(false, 36);
		System.out.println("Diferente a verano 36 grados " + playing);
		playing = cat.isCatPlaying(false, 35);
		System.out.println("Diferente a verano 35 grados " + playing);
		
		//--Verify numbers
		VerifyNumbers verNumbers = new VerifyNumbers();
		verNumbers.imprimirVerificadorNumeros(1, 1, 1);
		verNumbers.imprimirVerificadorNumeros(1, 1, 2);
		verNumbers.imprimirVerificadorNumeros(-1, -1, -1);
		verNumbers.imprimirVerificadorNumeros(1, 2, 3);
		
		//KiloBytes to MegaBytes
		BytesKiloBytes.printMegaBytesAndKiloBytes(2500);
		BytesKiloBytes.printMegaBytesAndKiloBytes(-1024);
		BytesKiloBytes.printMegaBytesAndKiloBytes(5000);
		
		// Odd number
		int total;
		SumOdd suma = new SumOdd();
		total = suma.sumOdd(1, 100);
		System.out.println("La suma es " + total);
		total = suma.sumOdd(-1, 100);
		System.out.println("La suma es " + total);
		total = suma.sumOdd(100, 100);
		System.out.println("La suma es " + total);
		total = suma.sumOdd(13, 13);
		System.out.println("La suma es " + total);
		total = suma.sumOdd(100, -100);
		System.out.println("La suma es " + total);
		total = suma.sumOdd(100, 1000);
		System.out.println("La suma es " + total);
		
		//VerifySum
		boolean verifySum;
		VerifySum verify = new VerifySum();
		verifySum= verify.hasEqualSum(1, 1, 1);
		System.out.println("La suma de los dos primeros números es igual al tercero " + verifySum);
		verifySum= verify.hasEqualSum(1, 1, 2);
		System.out.println("La suma de los dos primeros números es igual al tercero " + verifySum);
	}
}
