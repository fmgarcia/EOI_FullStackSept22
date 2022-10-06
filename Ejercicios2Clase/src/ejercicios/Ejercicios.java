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
	
	/*14. Inicializa una variable entera a 0. Después, pregunta al usuario por un número y súmaselo a la
	variable inicial. Repite esto hasta que el usuario introduzca el número cero. Utiliza el bucle
	do..while.*/
	public static void ejercicio14() {
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		int numero = -1;
		do {			
			System.out.print("Introduzca un número (acumulado " + suma + "): ");
			numero = sc.nextInt();
			suma += numero;
		}while(numero!=0);
		System.out.println("El total ha sido " + suma);
	}
	
	/*Repite el ejercicio 2 pero con un bucle infinito (la condición nunca será falsa). En este caso
	tendrás que comprobar dentro del bucle cuando el usuario ha introducido un cero para salir
	(break). Si el usuario introduce un número negativo no lo sumes (usa continue para saltarte la
	suma).*/
	public static void ejercicio20() {
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		int numero = -1;
		while(true) {			
			System.out.print("Introduzca un número (acumulado " + suma + "): ");
			numero = sc.nextInt();
			if(numero==0) 
				break;
			if(numero<0)
				continue;
			suma += numero;
		}
		System.out.println("El total ha sido " + suma);
	}
	
	/*15. Pide al usuario un número y calcula cuantas cifras tiene dicho número. Para ello puedes dividir
	el número entre 10 hasta que el resultado sea cero.*/
	// 1234/10 = 134 (1), 123/10 = 13 (2), 12 /10 =1 (3), 1/10 = 0 (4)
	public static void ejercicio15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int numero = sc.nextInt();
		int contador = 0;
		while(numero!=0) {
			numero = numero / 10;
			contador++;
		}
		System.out.println("Su número tiene " + contador + " dígitos");
	}
	
	public static void ejercicio15b() {
		Integer numero = -1234;
		System.out.println(numero.SIZE); // bits -> 32
		System.out.println(String.valueOf(numero).length());
	}


	public static void main(String[] args) {
		// ejercicio2();
		// ejercicio3();
		// ejercicio4();
		// ejercicio11();
		// ejercicio11CalcularaBasica();
		// ejercicio12();
		// ejercicio14();
		// ejercicio20();
		// ejercicio15();
		ejercicio15b();

	}

}
