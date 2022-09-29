package ejercicios;

import java.util.Scanner;

public class Ejercicios {
	
	public static void ejercicio2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int numero = sc.nextInt();
		System.out.println((numero % 10 == 0) ? "El número es divisible por 10" : "El número no es divisible por 10");
		sc.close();
	}
	
	public static void ejercicio3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca una letra: ");
		String cadena = sc.nextLine();  // el usuario mete "hola"
		char primeraLetra = cadena.charAt(0); // 0->h 1->o 2->l 3->a
		if(primeraLetra>='A' && primeraLetra<='Z') {
		//if((cadena.charAt(0)) == (cadena.toUpperCase().charAt(0)))  {
			System.out.println("Es una mayúscula");
		} else {
			System.out.println("No es una mayúscula");
		}
		sc.close();
	}
	
	public static void ejercicio3b() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca una letra: ");
		char letra = sc.nextLine().charAt(0);  // el usuario mete "hola"
		System.out.println((letra>='A' && letra<='Z')?"Es una mayúscula":"No es una mayúscula");
		sc.close();
	}
	
	public static void ejercicio4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca la primera palabra: ");
		String palabra1 = sc.nextLine();
		System.out.print("Introduzca la segunda palabra: ");
		String palabra2 = sc.nextLine();
		if(palabra1.equals(palabra2)) {
			System.out.println("Las palabras son iguales");
		} else {
			System.out.println("Las palabras NO son iguales");
		}
		sc.close();
	}

	public static void main(String[] args) {
		//ejercicio2();
		//ejercicio3();
		ejercicio4();
	}

}
