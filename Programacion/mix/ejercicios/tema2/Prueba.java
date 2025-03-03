package com.ejercicios.tema2;

public class Prueba {

	public static void main(String[] args) {
		
		int programador = 3000;
		int banquero = 60000000;
		int actor = 50000;
		int limpiador = 100;
		
		int sueldoMasAlto = actor;
		if (sueldoMasAlto<banquero) {
			sueldoMasAlto=banquero;
		}
		if (sueldoMasAlto<limpiador) {
			sueldoMasAlto=limpiador;
		}
		if (sueldoMasAlto<programador) {
			sueldoMasAlto=programador;
		}
		System.out.println("La profesión con el sueldo más alto es: " + sueldoMasAlto);
	}

}
