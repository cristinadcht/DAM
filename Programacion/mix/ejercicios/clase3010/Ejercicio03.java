package com.ejercicios.clase3010;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Enunciado:
        // Escribe un programa que solicite al usuario un número entero positivo.
        // Luego, el programa debe imprimir todos los números del 1 hasta ese número.
        // Usa un bucle for para imprimir los números uno por uno en líneas separadas.
		// Estructura de un for: declaración de variable (int i = 1;, condición sobre la variable i<=limite;, modificación de la variable i++)
		Scanner entrada = new Scanner (System.in);
		System.out.println("Dime cuántos números quieres: ");
		int limite = entrada.nextInt();
		
		for (int i = 1; i<=limite; i++) {
			System.out.println(i);
		}
		entrada.close();
	}

}
