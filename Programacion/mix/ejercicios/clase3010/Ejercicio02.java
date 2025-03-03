package com.ejercicios.clase3010;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Enunciado:
        // Escribe un programa que solicite al usuario elegir una opción de un menú:
        // 1. Saludar
        // 2. Despedirse
        // 3. Decir el día de la semana
        // 4. Salir
        // Dependiendo de la opción seleccionada, el programa debe imprimir el mensaje correspondiente.
		
		System.out.println("Hola usuario, elige una de estas 4 opciones (poniendo el número correspondiente)");
		System.out.println("1. Saludar");
		System.out.println("2. Despedirse");
		System.out.println("3. Decir el día de la semana");
		System.out.println("4. Salir");
		
		Scanner escaner = new Scanner(System.in);
		int opcion = escaner.nextInt();
		
		
		switch (opcion) {
			case 1:
				System.out.println("hola");
				break;
			case 2: 
				System.out.println("Adiós");
				break;
			case 3:
				LocalDate fechaDeHoy = LocalDate.now();
				DayOfWeek diaDeLaSemana = fechaDeHoy.getDayOfWeek();
				String diaCastellano = diaDeLaSemana.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
				System.out.println("Hoy es: " +diaCastellano);
				break;
			case 4:
				System.out.println("Saliendo...");
				break;
			default: 
				System.out.println("Haz el favor y pon un número correcto la próxima vez, que son solo 4 números.");
		}
		/*
		if (opcion==1) {
			System.out.println("hola");
		} else if (opcion==2) {
			System.out.println("Adiós"); 
		} else if (opcion==3) {
			LocalDate fechaDeHoy = LocalDate.now();
			DayOfWeek diaDeLaSemana = fechaDeHoy.getDayOfWeek();
			String diaCastellano = diaDeLaSemana.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
			System.out.println("Hoy es: " +diaCastellano);
		} else if (opcion==4) {
			System.out.println("Saliendo...");
		} else {
			System.out.println("Haz el favor y pon un número correcto la próxima vez, que son solo 4 números.");
		}
		*/
		escaner.close();
	}

}
