package com.entregas;

import java.util.Scanner;

public class HundirLaFlota {

	public static void main(String[] args) {
		
        char[][] tablero = new char[6][6];
        Scanner scanner = new Scanner(System.in);
        int intentos = 10;
        int barcosRestantes = 3;
        final String RESET = "\u001B[0m";
        final String ROJO = "\u001B[31m";
        final String ROJOCLARO = "\u001B[91m";
        final String AZUL = "\u001B[34m";
        final String FONDOCYAN = "\u001B[46m";
        final String VERDE = "\u001B[92m";
        final String FONDOVERDE = "\u001B[102m";
        final String GRIS = "\u001B[47m";
        final String NEGRO = "\u001B[30m";
        
       
        for (int f = 1; f < 6; f++) {
            for (int c = 1; c < 6; c++) {
                tablero[f][c] = '0';
            }
        }

        tablero[1][2] = '1';
        tablero[3][4] = '1';
        tablero[4][1] = '1';

        System.out.println("\n¡Comienza el juego! Tienes " + ROJOCLARO + intentos + RESET + " intentos para hundir los barcos.");
        while (intentos > 0 && barcosRestantes > 0) {
            System.out.println("\nTABLERO:");
            System.out.printf(" %-2s" + GRIS + NEGRO + " %-2d %-2d %-2d %-2d %-1d %n", " ", 1, 2, 3, 4, 5);
            for (int f = 1; f < 6; f++) {
            	System.out.printf(GRIS + NEGRO + "%2d ", f);
            	System.out.print(RESET);
                for (int c = 1; c < 6; c++) {
                    if (tablero[f][c] == '1') {
                        System.out.print(RESET + " ~ ");
                    } else if (tablero[f][c] == 'X') {
                    	System.out.print(ROJO + " X ");
                    } else if (tablero[f][c] == 'O') {
                    	System.out.print(AZUL + " ~ ");
                	} else {
                        System.out.print(RESET + " ~ ");
                    }
                }
                System.out.println(RESET);
            }

            System.out.println("\nIntroduce tu disparo (fila): ");
            int fila = scanner.nextInt();
            System.out.println("Introduce tu disparo (columna): ");
            int columna = scanner.nextInt();
            System.out.println();
            
            if (fila >= 1 && fila < 6 && columna >= 1 && columna < 6) {
                if (tablero[fila][columna] == '1') {
                    System.out.println(FONDOVERDE + NEGRO +  "¡Tocado y hundido!" + RESET);
                    tablero[fila][columna] = 'X';
                    barcosRestantes--;
                } else if (tablero[fila][columna] == '0') {
                    System.out.println(FONDOCYAN + "¡Agua!" + RESET);
                    tablero[fila][columna] = 'O';
                } else {
                    System.out.println("Ya disparaste en esa posición.");
                }
                intentos--;
                System.out.println(RESET + "Te quedan " + ROJOCLARO + intentos + RESET + " intentos.");
            } else {
                System.out.println("Posición fuera de rango. Inténtalo de nuevo.");
                System.out.println(RESET + "Todavía tienes " + ROJOCLARO + intentos + RESET + " intentos.");
            }
        }

        if (barcosRestantes == 0) {
            System.out.println(FONDOVERDE + "\n¡Felicidades! Hundiste todos los barcos." + RESET);
        } else {
            System.out.println("\nSe acabaron los intentos. Los barcos restantes eran:");
            System.out.printf(GRIS + NEGRO + "%-3s %-2d %-2d %-2d %-2d %-1d %n", " ", 1, 2, 3, 4, 5);
            for (int f = 1; f < 6; f++) {
            	System.out.printf(GRIS + NEGRO + "%2d ", f);
            	System.out.print(RESET);
                for (int c = 1; c < 6; c++) {
                    if (tablero[f][c] == '1') {
                        System.out.print(VERDE + " B ");
                    } else if (tablero[f][c] == 'X') {
                    	System.out.print(ROJO + " X ");
                    } else if (tablero[f][c] == 'O') {
                    	System.out.print(AZUL + " ~ ");
                	} else {
                        System.out.print(RESET + " ~ ");
                    }
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
