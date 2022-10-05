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
		String cadena = sc.nextLine(); // el usuario mete "hola"
		char primeraLetra = cadena.charAt(0); // 0->h 1->o 2->l 3->a
		if (primeraLetra >= 'A' && primeraLetra <= 'Z') {
			// if((cadena.charAt(0)) == (cadena.toUpperCase().charAt(0))) {
			System.out.println("Es una mayúscula");
		} else {
			System.out.println("No es una mayúscula");
		}
		sc.close();
	}

	public static void ejercicio3b() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca una letra: ");
		char letra = sc.nextLine().charAt(0); // el usuario mete "hola"
		System.out.println((letra >= 'A' && letra <= 'Z') ? "Es una mayúscula" : "No es una mayúscula");
		sc.close();
	}

	public static void ejercicio4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca la primera palabra: ");
		String palabra1 = sc.nextLine();
		System.out.print("Introduzca la segunda palabra: ");
		String palabra2 = sc.nextLine();
		if (palabra1.equals(palabra2)) {
			System.out.println("Las palabras son iguales");
		} else {
			System.out.println("Las palabras NO son iguales");
		}
		sc.close();
	}

	public static void ejercicio11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el primer número: ");
		int numero1 = sc.nextInt();
		System.out.print("Introduzca el segundo número: ");
		int numero2 = sc.nextInt();
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("Introduzca opción: ");
		int opcion = sc.nextInt();
		switch (opcion) { // tratar la opción
		case 1:
			System.out.println("La suma es: " + (numero1 + numero2));
			break;
		case 2:
			System.out.println("La resta es: " + (numero1 - numero2));
			break;
		case 3:
			System.out.println("La multiplicación es: " + (numero1 * numero2));
			break;
		case 4:
			if (numero2 != 0) {
				System.out.println("La division es: " + (numero1 / numero2));
			} else { // es igual a 0
				System.out.println("No se puede dividir por cero");
			}
			break;
		default:
			System.out.println("Opción no válida.");
			break;
		}

	}

	public static void ejercicio11CalcularaBasica() {
		Scanner sc = new Scanner(System.in);
		int opcion = -1;

		while (opcion != 0) {

			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("0. Salir");
			System.out.println("Introduzca opción: ");
			opcion = sc.nextInt();
			int numero1 = -1;
			int numero2 = -1;
			if (opcion >= 1 && opcion <= 4) { // Si una operación que requiere números, los pedimos.
				System.out.print("Introduzca el primer número: ");
				numero1 = sc.nextInt();
				System.out.print("Introduzca el segundo número: ");
				numero2 = sc.nextInt();
			}
			switch (opcion) { // tratar la opción
			case 1:
				System.out.println("La suma es: " + (numero1 + numero2));
				break;
			case 2:
				System.out.println("La resta es: " + (numero1 - numero2));
				break;
			case 3:
				System.out.println("La multiplicación es: " + (numero1 * numero2));
				break;
			case 4:
				if (numero2 != 0) {
					System.out.println("La division es: " + (numero1 / numero2));
				} else { // es igual a 0
					System.out.println("No se puede dividir por cero");
				}
				break;
			case 0:
				System.out.println("Gracias por usar nuestra calculadora básica");
				break;
			default:
				System.out.println("Opción no válida.");
				break;
			}
		}

	}

	public static void ejercicio12() {
		final double PRECIO_ENTRADA = 100;
		final int MAYORIA_EDAD = 18;
		final int EDAD_JUBILACION = 65;
		final double DESCUENTO_JOVEN = 0.25;
		final double DESCUENTO_SOCIO = 0.40;
		final double DESCUENTO_JUBILADO = 0.75;
		Scanner sc = new Scanner(System.in);
		double entrada = PRECIO_ENTRADA;
		System.out.print("Introduzca su edad: ");
		int edad = Integer.parseInt(sc.nextLine());
		//int edad = sc.nextInt();
		//sc.nextLine();  // debemos ponerlo si vamos a hacer más de una entrada por consola después de un int
		double descuento = 0;
		if (edad < MAYORIA_EDAD) {
			// hacer descuento 25%
			descuento = DESCUENTO_JOVEN;
			entrada = entrada * (1 - descuento); // entrada * 0.75
		} else if (edad >= MAYORIA_EDAD && edad < EDAD_JUBILACION) {
			System.out.print("Es usted socio (si/no): ");
			String socio = sc.nextLine();
			if (socio.toLowerCase().equals("si") || socio.toLowerCase().equals("sí") || socio.toLowerCase().equals("s")) {
				descuento = DESCUENTO_SOCIO;
				entrada = entrada * (1 - descuento);
			}
		} else if(edad>=EDAD_JUBILACION){
			descuento = DESCUENTO_JUBILADO;
			entrada = entrada * (1 - descuento);
		}
		System.out.println("El precio de su entrada es: " + entrada);
		if(descuento>0)
			System.out.println("Se le ha aplicado un descuento del: " + (descuento*100) + "%");
	}

	public static void ejercicio13() {
		for (int i = 20; i > 0; i--) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// ejercicio2();
		// ejercicio3();
		// ejercicio4();
		// ejercicio11();
		// ejercicio11CalcularaBasica();
		ejercicio12();

	}

}
