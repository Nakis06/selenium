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
		Decimal evalDecimal = new Decimal();
		boolean decimal = evalDecimal.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
		System.out.println("Los 3 primeros decimales son iguales " + decimal);
		decimal = evalDecimal.areEqualByThreeDecimalPlaces(3.175, 3.176);
		System.out.println("Los 3 primeros decimales son iguales " + decimal);
		decimal = evalDecimal.areEqualByThreeDecimalPlaces(3.0, 3.0);
		System.out.println("Los 3 primeros decimales son iguales " + decimal);
		decimal = evalDecimal.areEqualByThreeDecimalPlaces(-3.123, 3.123);
		System.out.println("Los 3 primeros decimales son iguales " + decimal);
				
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
		
		// Leap year
		boolean leapYear;
		leapYear = DaysPerMonth.isLeapYear(1900);
		System.out.println("Es bisciesto "+leapYear);
		leapYear = DaysPerMonth.isLeapYear(2100);
		System.out.println("Es bisciesto "+leapYear);
		leapYear = DaysPerMonth.isLeapYear(1600);
		System.out.println("Es bisciesto "+leapYear);
		leapYear = DaysPerMonth.isLeapYear(-1600);
		System.out.println("Es bisciesto "+leapYear);
		leapYear = DaysPerMonth.isLeapYear(2017);
		System.out.println("Es bisciesto "+leapYear);
		leapYear = DaysPerMonth.isLeapYear(2000);
		System.out.println("Es bisciesto "+leapYear);
		
		//Days per month
		int days;
		days = DaysPerMonth.getDaysInMonth(2, 1900);
		System.out.println("Días del mes "+days);
		days = DaysPerMonth.getDaysInMonth(2, 1600);
		System.out.println("Días del mes "+days);
		days = DaysPerMonth.getDaysInMonth(1, 2020);
		System.out.println("Días del mes "+days);
		days = DaysPerMonth.getDaysInMonth(2, 2020);
		System.out.println("Días del mes "+days);
		days = DaysPerMonth.getDaysInMonth(2, 2018);
		System.out.println("Días del mes "+days);
		days = DaysPerMonth.getDaysInMonth(-1, 2020);
		System.out.println("Días del mes "+days);
		days = DaysPerMonth.getDaysInMonth(1, -2020);
		System.out.println("Días del mes "+days);
		
		//Area calculator
		double area;
		area = AreaCalculator.radius(5.0);
		System.out.println("Radio "+area);
		area = AreaCalculator.radius(-1);
		System.out.println("Radio "+area);
		area = AreaCalculator.radius(5.0, 4.0);
		System.out.println("Radio "+area);
		area = AreaCalculator.radius(-1.0, 4.0);
		System.out.println("Radio "+area);
	}
}
