package ejerciciosArrays;

import java.util.Scanner;

public class EjerciciosArrays {

	private static void ejercicio1() {
		String[] meses = { "Enero", "febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" }; // Del 0 al 11
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número de mes (1 al 12): ");
		int numero = sc.nextInt();
		System.out.println(meses[numero-1]);
	}
	
	public static void main(String[] args) {
		ejercicio1();
	}
	
}
