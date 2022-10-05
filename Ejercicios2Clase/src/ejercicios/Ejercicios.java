package ejercicios;

import java.util.Scanner;

public class Ejercicios {
	
	public static void ejercicio2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un n�mero: ");
		int numero = sc.nextInt();
		System.out.println((numero % 10 == 0) ? "El n�mero es divisible por 10" : "El n�mero no es divisible por 10");
		sc.close();
	}
	
	public static void ejercicio3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca una letra: ");
		String cadena = sc.nextLine();  // el usuario mete "hola"
		char primeraLetra = cadena.charAt(0); // 0->h 1->o 2->l 3->a
		if(primeraLetra>='A' && primeraLetra<='Z') {
		//if((cadena.charAt(0)) == (cadena.toUpperCase().charAt(0)))  {
			System.out.println("Es una may�scula");
		} else {
			System.out.println("No es una may�scula");
		}
		sc.close();
	}
	
	public static void ejercicio3b() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca una letra: ");
		char letra = sc.nextLine().charAt(0);  // el usuario mete "hola"
		System.out.println((letra>='A' && letra<='Z')?"Es una may�scula":"No es una may�scula");
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
	
	
	public static void ejercicio11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el primer n�mero: ");
		int numero1 = sc.nextInt();
		System.out.print("Introduzca el segundo n�mero: ");
		int numero2 = sc.nextInt();
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");			
		System.out.println("Introduzca opci�n: ");
		int opcion = sc.nextInt();
		switch(opcion) {	// tratar la opci�n
		case 1:
			System.out.println("La suma es: " + (numero1+numero2));
			break;
		case 2:
			System.out.println("La resta es: " + (numero1-numero2));
			break;
		case 3:
			System.out.println("La multiplicaci�n es: " + (numero1*numero2));
			break;
		case 4:
			if(numero2!=0) {
				System.out.println("La division es: " + (numero1/numero2));
			} else {  // es igual a 0
				System.out.println("No se puede dividir por cero");
			}
			break;
		default:
			System.out.println("Opci�n no v�lida.");
			break;
		}
		
	}
	
	public static void ejercicio11CalcularaBasica() {
		Scanner sc = new Scanner(System.in);
		int opcion = -1;

		while (opcion!=0) {

			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("0. Salir");
			System.out.println("Introduzca opci�n: ");
			opcion = sc.nextInt();
			int numero1=-1;
			int numero2=-1;
			if (opcion>=1 && opcion<=4) {  // Si una operaci�n que requiere n�meros, los pedimos.
				System.out.print("Introduzca el primer n�mero: ");
				numero1 = sc.nextInt();
				System.out.print("Introduzca el segundo n�mero: ");
				numero2 = sc.nextInt();
			}
			switch (opcion) { // tratar la opci�n
			case 1:
				System.out.println("La suma es: " + (numero1 + numero2));
				break;
			case 2:
				System.out.println("La resta es: " + (numero1 - numero2));
				break;
			case 3:
				System.out.println("La multiplicaci�n es: " + (numero1 * numero2));
				break;
			case 4:
				if (numero2 != 0) {
					System.out.println("La division es: " + (numero1 / numero2));
				} else { // es igual a 0
					System.out.println("No se puede dividir por cero");
				}
				break;
			case 0:
				System.out.println("Gracias por usar nuestra calculadora b�sica");
				break;
			default:
				System.out.println("Opci�n no v�lida.");
				break;
			}
		}
		
	}
	
	public static void ejercicio13() {
		for (int i = 20; i > 0; i--) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		//ejercicio2();
		//ejercicio3();
		//ejercicio4();
		//ejercicio11();
		ejercicio11CalcularaBasica();
		
	}

}
