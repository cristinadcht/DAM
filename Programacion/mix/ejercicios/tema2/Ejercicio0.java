package com.ejercicios.tema2;

public class Ejercicio0 {

	public static void main(String[] args) {
		/*
		 * Ejercicio: Comparar i++ y ++i
		 * Declara una variable i con valor 10.
		 * Usa i++ y ++i en dos operaciones diferentes 
		 * y muestra los resultados
		 */
		int i = 10;
		System.out.println("Valor de i es de "+i);
		System.out.println("Valor de i++ mientras se hace la operación:"+ i++);
		System.out.println("Valor de i tras haber hecho lo de la línea anterior es de "+i);
		System.out.println();
		i = 10; //no puedo poner lo del int
		System.out.println("Valor de i es de "+i);
		System.out.println("Valor de ++i mientras se hace la operación:"+ ++i);
		System.out.println("Valor de i tras haber hecho lo de la línea anterior es de "+i);
	}

}