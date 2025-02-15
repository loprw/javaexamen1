package davidjuan.morenoriera.examen;

public class Examen {

	public static void main(String[] args) {

		int[] numeros = UtilidadesExamen.crearArray();

		System.out.println("Los numeros que componen el array son:");
		UtilidadesExamen.mostrarArray(numeros);

		double promedio = UtilidadesExamen.calcularPromedio(numeros);
		System.out.println(promedio);

		int[] arrayExtremos = UtilidadesExamen.encontrarExtremos(numeros);
		System.out.println("El número mayor del array es " + arrayExtremos[0] + ".\nEl número menor del array es "
				+ arrayExtremos[1] + ".");

		int[] numsMayorPromedio = UtilidadesExamen.filtrarMayoresQuePromedio(numeros, promedio);
		System.out.println("Los numeros que componen el array de números mayores que el promedio son:");
		UtilidadesExamen.mostrarArray(numsMayorPromedio);	
	}
}
