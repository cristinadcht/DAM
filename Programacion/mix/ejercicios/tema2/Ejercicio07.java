package com.ejercicios.tema2;

public class Ejercicio07 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 7: Conversión entre String y tipos numéricos
		 *	Objetivo: Practicar la conversión entre tipos de datos numéricos y cadenas (String).
		 *	Instrucciones:
		 *	1. Declara una variable int llamada numero con el valor 42.
		 *	2. Convierte numero a una cadena y almacénalo en una variable numeroCadena.
		 *	3. Declara una variable String llamada texto con el valor "123".
		 *	4. Convierte texto a un número entero y almacénalo en una variable textoEntero.
		 *	5. Imprime ambos resultados.
		 */
		int numero = 42;
		String numeroCadena = String.valueOf(numero);
		System.out.println("Número como cadena: " + numeroCadena);
		
		String texto = "123";
		int textoEntero = Integer.parseInt(texto);
		System.out.println("Cadena convertida en número: " + textoEntero);
	}

}
