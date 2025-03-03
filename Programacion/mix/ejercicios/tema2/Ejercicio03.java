package com.ejercicios.tema2;

public class Ejercicio03 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 3: Conversión de tipos de datos Objetivo: Practicar la conversión
		 * de tipos de datos (casting). Instrucciones: 1. Declara una variable double
		 * llamada precio con el valor 19.99. 2. Convierte precio a un entero (int) y
		 * almacena el resultado en una variable precioEntero. 3. Imprime ambos valores
		 * (el original y el convertido).
		 */

		double precio = 19.99;
		int precioEntero = (int) precio;
		System.out.println("la variable'precio', al mostrarla por pantalla como double, es " + precio
				+ " mientras que al mostrarla como entero es " + precioEntero + " unicamente."); //ctrl-shif-F para saltar abajo
	}

}
