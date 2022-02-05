package com.java;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// Ejercicio 1
		double num1 = 23.5;
		double num2 = 21.2;
		double num3 = 11.4;
		double suma = num1+num2+num3;
		double resta = num1-num2-num3;
		double multiplicacion = num1*num2*num3;
		double division = num1/num2/num3;
		System.out.println("Suma "+suma);
		System.out.println("Resta "+resta);
		System.out.println("Multiplicación "+multiplicacion);
		System.out.println("División "+division);
		
		//Ejercicio 2
		String Var1 = "Cool"; 
		String Var2 = "Selenium con Java"; 
		String Var3 = "Curso de"; 
		String Var4 = "Testers";
		System.out.println(Var3+" "+Var2+" "+Var1+" "+Var4);
		
		//Ejercicio 3
		int edad;
		int codigoPostal;
		double altura;
		char genero;
		String nombre;
		int numeroDeHijos;
		double IVA;
		int tallaCamisa;
		double peso;
		double precio;
		String alumnoRepetidor;
		String mensaje;
		char letra;
		int minutos;
		int dias;
		String matriculaCoche;
		int contador;
		boolean mayorEdad;
		String tallaCamiseta;
		
		//Ejercicio 4
		int valor1 = 30;
		int valor2 = 30;
		
		if(valor1>valor2) {
			System.out.println("El valor "+valor1+" es mayor a "+valor2);
		}else if(valor1<valor2){
			System.out.println("El valor "+valor2+" es mayor a "+valor1);
		}else
			System.out.println("Los valores son iguales");
		
		//ejercicio 5
		Scanner leer=new Scanner(System.in);
		System.out.println("Ingrese un número:");
		int n1= leer.nextInt();
		if(n1<0) {
			System.out.println("El número es negativo");
		}else {
			System.out.println("El número es positivo");
		}
		if(n1%2==0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}
		
		
	}
}
