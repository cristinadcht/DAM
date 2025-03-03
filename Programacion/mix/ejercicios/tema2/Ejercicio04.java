package com.ejercicios.tema2;

public class Ejercicio04 {

	public static void main(String[] args) {
		/*
		*	Ejercicio 4: Operadores de incremento y decremento
		*	Objetivo: Practicar los operadores de incremento (++) y decremento (--).
		*	Instrucciones:
		*		1. Declara una variable int llamada contador con el valor 5.
		*		2. Incrementa contador en 1 usando el operador ++.
		*		3. Imprime el valor de contador después del incremento.
		*		4. Decrementa contador en 1 usando el operador --.
		*		5. Imprime el valor de contador después del decremento.
		*/
		int contador = 5;
		contador++;
		System.out.println("Este es el valor del contador después del incremento ++: " + contador);
		contador--;
		System.out.println("Este es el valor del contador después del decremenro --: " + contador);
	}

}
