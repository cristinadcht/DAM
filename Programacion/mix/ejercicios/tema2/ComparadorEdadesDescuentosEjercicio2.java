package com.ejercicios.tema2;

public class ComparadorEdadesDescuentosEjercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		* Declara cuatro variables de tipo int para representar las edades de cuatro personas.
		* Declara una variable double para representar el precio original de un producto, y una variable int para representar el descuento en porcentaje.
		* Usa operadores booleanos para comparar las edades de las personas y establecer quién es la más joven y quién es la mayor. (Asume que no hay edades iguales para simplificarlo.)
		* Aplica el descuento solo si al menos dos personas son mayores de 18 años. En caso contrario, el precio del producto queda sin descuento.
		* Realiza un casting explícito para convertir el descuento de int a double y luego aplica el descuento en el precio original.
		* Imprime el precio final del producto y menciona si el descuento fue aplicado o no.
		*
		*/
		
		 // Paso 1: Declarar variables de edad
        int edad1 = 20;
        int edad2 = 16;
        int edad3 = 25;
        int edad4 = 30;

        // Declarar variables de precio y descuento
        double precioOriginal = 100.0; // Precio del producto
        int descuento = 15; // Descuento en porcentaje

        // Paso 2: Encontrar la persona más joven y la mayor usando operadores booleanos
        int menorEdad;
        int mayorEdad;

        if (edad1 < edad2 && edad1 < edad3 && edad1 < edad4) {
            menorEdad = edad1;
        } else if (edad2 < edad1 && edad2 < edad3 && edad2 < edad4) {
            menorEdad = edad2;
        } else if (edad3 < edad1 && edad3 < edad2 && edad3 < edad4) {
            menorEdad = edad3;
        } else {
            menorEdad = edad4;
        }

        if (edad1 > edad2 && edad1 > edad3 && edad1 > edad4) {
            mayorEdad = edad1;
        } else if (edad2 > edad1 && edad2 > edad3 && edad2 > edad4) {
            mayorEdad = edad2;
        } else if (edad3 > edad1 && edad3 > edad2 && edad3 > edad4) {
            mayorEdad = edad3;
        } else {
            mayorEdad = edad4;
        }

        // Paso 3: Verificar si al menos dos personas son mayores de 18 años
        int mayoresDe18 = 0;

        if (edad1 > 18) mayoresDe18++;
        if (edad2 > 18) mayoresDe18++;
        if (edad3 > 18) mayoresDe18++;
        if (edad4 > 18) mayoresDe18++;

        boolean aplicarDescuento = mayoresDe18 >= 2; // Si hay al menos dos mayores de 18, aplicar descuento

        // Paso 4: Calcular el precio final, aplicando el descuento solo si corresponde
        double precioFinal;

        if (aplicarDescuento) {
            // Casting explícito de descuento de int a double y cálculo del precio con descuento
            double descuentoAplicado = (double) descuento;
            precioFinal = precioOriginal * (1 - (descuentoAplicado / 100));
            System.out.println("Se aplicó un descuento del " + descuento + "%.");
        } else {
            // Si no se cumple la condición, el precio queda sin descuento
            precioFinal = precioOriginal;
            System.out.println("No se aplicó descuento.");
        }

        // Paso 5: Imprimir el precio final del producto
        System.out.println("El precio final del producto es: " + precioFinal);
    }
}