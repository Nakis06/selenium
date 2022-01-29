package com.java;

public class Operadores {

	public static void main(String[] args) {
		// operadores aritméticos
		int x = 20;
		int y = 5;
		int suma = x + y;
		int resta = y - x;
		int multiplicacion = x * y;
		int division = x / y;
		System.out.println("suma "+suma+" Resta "+resta+" División "+division+" Multiplicación "+multiplicacion);
		double a = 2.23;
		double b = 3.6;
		double multi = a * b;
		System.out.println(multi);
		
		//operador unario
		int unario = 2;
		++unario;
		System.out.println(unario);
		
		/*operadores relacionales
		 *Igual qué ==
		 *Diferente a !=
		 *Mayor qué >
		 *Menor qué <
		 *mayor o igual >=
		 *menor o igual <= 
		 */
		int var1 = 2;
		int var2 = 3;
		if (var1>var2) {
			System.out.println("True");
		}else {
			System.out.println("false");
		}
		
		String msg1="Hola";
		String msg2="HOLA";
		if (msg1 == msg2) {
			System.out.println("Iguales");
		}else {
			System.out.println("Diferentes");
		}
		if(msg1.equalsIgnoreCase(msg2))
			System.out.println("Cadenas iguales");
		
		// Operadores relacionales
		// And &&
		// Or ||
		int oper1 = 2;
		int oper2 = 2;
		int oper3 = 3;
		int oper4 = 3;
		if(oper1==oper2 && oper3==oper4) {
			System.out.println("Valores iguales");
		}else {
			System.out.println("Valores diferentes");
		}
		
			
	}

}
