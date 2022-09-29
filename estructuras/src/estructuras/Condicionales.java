package estructuras;

import java.util.Scanner;

public class Condicionales {

	public static void ejemplosIf() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre: ");
		String nombre = sc.nextLine();
		if (nombre.equals("")) {
			System.out.println("¡El nombre no puede estar vacío!");
		}
		System.out.println("Hola " + nombre);
		sc.close();
	}

	public static void ejemplosIfElse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre: ");
		String nombre = sc.nextLine();
		if (nombre.equals("")) {
			System.out.println("¡El nombre no puede estar vacío!");
		} else {
			System.out.println("Hola " + nombre);
		}
		// Fuera del if-else
		System.out.println("Esto se imprime siempre");
		sc.close();
	}

	public static void ejemplosIfElseIf1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre: ");
		String nombre = sc.nextLine();
		if (nombre.equals("")) {
			System.out.println("¡El nombre no puede estar vacío!");
		} else if (nombre.length()==1) {
			System.out.println("No es un nombre muy corto?");
		} else {
			System.out.println("Hola " + nombre);
		}
		// Fuera del if-else if-else
		System.out.println("Esto se imprime siempre");
		sc.close();
	}

	public static void main(String[] args) {
		// ejemplosIf();
		// ejemplosIfElse();
		ejemplosIfElseIf1();

	}

}
