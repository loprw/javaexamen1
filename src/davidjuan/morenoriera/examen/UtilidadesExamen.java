package davidjuan.morenoriera.examen;

import java.util.Scanner;

public class UtilidadesExamen {

	public static int[] crearArray() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el tamaño del array:");
		int tamany = scan.nextInt();
		int[] numeros = new int[tamany];

		for (int i = 0; i < tamany; i++) {
			System.out.println("Indica el número en la posición " + (i + 1) + ":");
			numeros[i] = scan.nextInt();
		}

		scan.close();

		return numeros;
	}

	public static void mostrarArray(int[] numeros) {
		
		for (int numero: numeros) {
			System.out.println(numero);
		}
	}
	
	public static double calcularPromedio(int[] numeros) {
		
		int suma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		
		double promedio = (double) suma / numeros.length;
		
		return promedio;
		
	}
	
	public static int[] encontrarExtremos(int[] numeros) {
		
		int[] extremos = new int[2];
		int numMax = -999999999;
		int numMin = 999999999;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] >= numMax) {
				numMax = numeros[i];
			}
			if (numeros[i] <= numMin) {
				numMin = numeros[i];
			}
		}
		
		extremos[0] = numMax;
		extremos[1] = numMin;
		
		
		return extremos;
	}
	
	
	public static int[] filtrarMayoresQuePromedio(int[] numeros, double promedio) {
		
		int[] intermedio = new int[numeros.length];
		int contador = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > promedio) {
				intermedio[contador] = numeros[i];
				contador++;
			}
		}
		
		int[] mayoresQuePromedio = new int[(contador)];
		
		for (int i = 0; i < contador; i++) {
			mayoresQuePromedio[i] = intermedio[i];
		}
 		
		return mayoresQuePromedio;
	}
}
