package davidjuan.morenoriera.examen;

import java.util.Scanner;

public class UtilidadesExamen {

	public static int[] crearArray() {

		// no se controla si el tamaño es entre 1 y 10: debería hacerse con un do while,
		// con condición <1 || >10
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el tamaño del array:");
		int tamany = scan.nextInt();
		int[] numeros = new int[tamany];

		for (int i = 0; i < tamany; i++) {
			System.out.println("Indica el número en la posición " + (i + 1) + ": ");
			numeros[i] = scan.nextInt();
		}

		scan.close();

		return numeros;
	}

	public static void mostrarArray(int[] numeros) {

		for (int numero : numeros) {
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

		// en numMax y numMin, hubiera sido mejor hacer Integer.MIN_VALUE e
		// Integer.MAX_VALUE
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

	// en vez de pasarle un promedio, podemos pasar la función estática que lo
	// calcula dentro de esta función.
	public static int[] filtrarMayoresQuePromedio(int[] numeros, double promedio) {

		// Es mucho mejor sin el array de int intermedio, debiendo tener un contador
		// nuevo que aumente de valor si se agrega un valor al array que devuelve la
		// función
		int[] intermedio = new int[numeros.length];
		int contador = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > promedio) {
				intermedio[contador] = numeros[i];
				contador++;
			}
		}

		int[] mayoresQuePromedio = new int[contador];

		for (int i = 0; i < contador; i++) {
			mayoresQuePromedio[i] = intermedio[i];
		}

		return mayoresQuePromedio;
	}
}
