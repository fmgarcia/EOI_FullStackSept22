package estructuras;

import java.util.Scanner;

public class Condicionales {
	

	public static void ejemplosIf() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre: ");
		String nombre = sc.nextLine();
		if (nombre.equals("")) {
			System.out.println("�El nombre no puede estar vac�o!");
		}
		System.out.println("Hola " + nombre);
		sc.close();
	}

	public static void ejemplosIfElse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre: ");
		String nombre = sc.nextLine();
		if (nombre.equals("")) {
			System.out.println("�El nombre no puede estar vac�o!");
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
			System.out.println("�El nombre no puede estar vac�o!");
		} else if (nombre.length() == 1) {
			System.out.println("No es un nombre muy corto?");
		} else if (nombre.length() == 2) {
			System.out.println("Me sigue pareciendo un nombre corto");
		} else {
			System.out.println("Hola " + nombre);
		}
		// Fuera del if-else if-else
		System.out.println("Esto se imprime siempre");
		sc.close();
	}

	public static void ejemplosIfElseIf2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre: ");
		String nombre = sc.nextLine();
		if (nombre.equals("")) {
			System.out.println("�El nombre no puede estar vac�o!");
		} else if (nombre.length() == 1) {
			System.out.println("No es un nombre muy corto?");
		} else if (nombre.length() == 2) {
			System.out.println("Me sigue pareciendo un nombre corto");
		}
		// Fuera del if-else if-else
		System.out.println("Hola " + nombre); // Siempre se har�a esta l�nea
		sc.close();
	}

	public static void ternario1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre: ");
		String nombre = sc.nextLine();

		System.out.println(nombre.equals("") ? "�El nombre no puede estar vac�o!" : "Hola " + nombre);

		int numero = 5;
		System.out.println((numero % 2 == 0) ? "El n�mero es par" : "El n�mero es impar");

		/*
		 * System.out.println(nombre.equals("")?"�El nombre no puede estar vac�o!"
		 * :(nombre.length()==1)?"No es un nombre muy corto?"
		 * :(nombre.length()==2)?"Me sigue pareciendo un nombre corto" :"Hola " +
		 * nombre);
		 */

		// Fuera del if-else
		System.out.println("Esto se imprime siempre");
		sc.close();
	}

	public static void ternario2() {
		int edad1 = 4;
		int edad2 = 7;
		int diferencia = (edad1 > edad2) ? edad1 - edad2 : edad2 - edad1;
		if (edad1 > edad2) {
			diferencia = edad1 - edad2;
		} else {
			diferencia = edad2 - edad1;
		}
		System.out.println(diferencia); // 3
	}

	public static void switch1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime el prefijo de tu pa�s: ");
		int prefijo = sc.nextInt();
		switch (prefijo) {
		case 34:
			System.out.println("Tu pa�s es Espa�a");
			break;
		case 49:
			System.out.println("Tu pa�s es Alemania");
			break;
		default:
			System.out.println("No s� cual es tu pa�s...");
			break;
		}
		sc.close();
	}

	public static void main(String[] args) {
		// ejemplosIf();
		// ejemplosIfElse();
		// ejemplosIfElseIf1();
		// ejemplosIfElseIf2();
		// ternario1();
		// ternario2();
		switch1();

	}

}
