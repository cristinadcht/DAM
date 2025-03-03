package com.ejercicios.tema2;

public class Ejercicio09 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 9: Intercambio de valores entre dos variables
		 *	Objetivo: Practicar el intercambio de valores entre dos variables sin usar una tercera variable.
		 *	Instrucciones:
		 *	1. Declara dos variables int llamadas a y b con los valores 7 y 9 respectivamente.
		 *	2. Intercambia los valores de a y b sin usar una variable temporal.
		 *	3. Imprime los valores de a y b después del intercambio.
		 */
		int a = 5;
		int b = 100;
		System.out.println("Antes del intercambio: a = " + a + ", b = " + b);
		
		a = a + b; //a = 105
		b = a - b; //b = 5
		a = a - b; //a = 100
		
		System.out.println("Después del intercambio: a = " + a + ", b = " +b);
	}

}
