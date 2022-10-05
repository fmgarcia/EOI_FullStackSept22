package estructuras;

import java.util.Random;
import java.util.Scanner;

public class Iterativas {

	public static void for1() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		// El programa continua por aqu� al acabar el bucle
	}

	public static void for2() {
		String oracion = "Hola mundo";
		for (int i = 0; i < oracion.length(); i++) {
			System.out.println(oracion.charAt(i));
		}
		// El programa continua por aqu� al acabar el bucle
	}

	public static void for3() { // tabla de multiplicar
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba la tabla que desea: ");
		int tabla = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(tabla + " * " + i + " = " + (tabla * i));
		}
	}

	public static void for4() { // tabla de multiplicar invertida
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba la tabla que desea: ");
		int tabla = sc.nextInt();
		for (int i = 10; i > 0; i--) {
			System.out.println(tabla + " * " + i + " = " + (tabla * i));
		}
	}

	public static void for5() { // ejemplo de for complejo
		for (int i = 0, j = 10; i <= 10 && j > 5; i++, j--) { // 0+10, 1+9, 2+8...10+0
			System.out.println(i + " + " + j + " = " + (i + j));
		}
	}

	public static void infinito1() { // Probable error
		for (int i = 0; i >= 0; i++) {
			System.out.println(i);
		}
	}

	public static void offTopicEnteros() {
		// long numero = 2147483647;
		long numero = Integer.MAX_VALUE;
		System.out.println(numero);
		numero++;
		System.out.println(numero);
	}

	public static void infinito2() { // Probablemente un error
		for (int i = 0; i >= 0;) {
			System.out.println(i);
		}
	}

	public static void infinito3() { // A conciencia
		for (;;) {
			System.out.println("Hola");
		}
	}

	public static void while1() {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		while (total < 100) {
			System.out.print("Escribe un n�mero (acumulado: " + total + "): ");
			int num = sc.nextInt();
			total += num; // total = total + num;
		}
		System.out.println("El total acumulado ha sido:" + total);
	}

	public static void whileIgualQueFor() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		int numero = 0;
		while (numero < 10) {
			System.out.println(numero);
			numero++;
		}
	}

	public static void whileIgualQueFor2() {
		String oracion = "Hola mundo";

		for (int i = 0; i < oracion.length(); i++) {
			System.out.println(oracion.charAt(i));
		}

		int i = 0;
		while (i < oracion.length()) {
			System.out.println(oracion.charAt(i));
			i++;
		}
	}

	public static void doWhile1() {
		Scanner sc = new Scanner(System.in);
		// Generamos n�mero aleatorio entre 1 y 10
		int adivina = new Random().nextInt(10) + 1;
		//int adivina = 7;
		int intentos = 0;
		int num;
		do {
			System.out.print("Adivina el n�mero del 1 al 10 (te quedan " + (3-intentos) + " " 
					+ (((3-intentos)==1)?"intento): ":"intentos): "));
			num = sc.nextInt();
			intentos++;
		} while (adivina != num && intentos < 3);
		if (adivina==num) {
			System.out.println("Has acertado!");
		} else {
			System.out.println("Has fallado!");
		}
	}
	
	public static void whileIgualQueDoWhile1() {
		Scanner sc = new Scanner(System.in);
		// Generamos n�mero aleatorio entre 1 y 10
		//int adivina = new Random().nextInt(10) + 1;
		int adivina = 7;
		int intentos = 0;
		int num=-1;
		while (adivina != num && intentos < 3){
			System.out.print("Adivina el n�mero del 1 al 10 (te quedan " + (3-intentos) + " " 
					+ (((3-intentos)==1)?"intento): ":"intentos): "));
			num = sc.nextInt();
			intentos++;
		} 
		if (adivina==num) {
			System.out.println("Has acertado!");
		} else {
			System.out.println("Has fallado!");
		}
	}
	
	public static void forIgualQueDoWhile1() {
		Scanner sc = new Scanner(System.in);
		// Generamos n�mero aleatorio entre 1 y 10
		//int adivina = new Random().nextInt(10) + 1;
		int adivina = 7;

		int num=-1;
		for (int intentos = 0;adivina != num && intentos < 3;intentos++){
			System.out.print("Adivina el n�mero del 1 al 10 (te quedan " + (3-intentos) + " " 
					+ (((3-intentos)==1)?"intento): ":"intentos): "));
			num = sc.nextInt();
		} 
		if (adivina==num) {
			System.out.println("Has acertado!");
		} else {
			System.out.println("Has fallado!");
		}
	}
	
	public static void forIgualQueDoWhile2BreakContinue() {
		Scanner sc = new Scanner(System.in);
		// Generamos n�mero aleatorio entre 1 y 10
		//int adivina = new Random().nextInt(10) + 1;
		int adivina = 7;

		int num=-1;
		for (int intentos = 0;intentos < 3;intentos++){
			System.out.print("Adivina el n�mero del 1 al 10 (te quedan " + (3-intentos) + " " 
					+ (((3-intentos)==1)?"intento): ":"intentos): "));
			num = sc.nextInt();
			if (adivina==num) {
				break;
			} else {
				continue;
			}
		} 
		if (adivina==num) {
			System.out.println("Has acertado!");
		} else {
			System.out.println("Has fallado!");
		}
	}
	
	public static void ejemploMenuDoWhile() {
		Scanner sc = new Scanner(System.in);
		int opcion=-1;
		do {
			System.out.println("1. Jugar");
			System.out.println("2. Guardar");
			System.out.println("3. Opciones");
			System.out.println("0. Salir");			
			System.out.println("Introduzca opci�n: ");
			opcion = sc.nextInt();
		}while (opcion!=0);
	}
	
	public static void ejemploMenuWhile() {
		Scanner sc = new Scanner(System.in);
		int opcion=-1;
		while (opcion!=0){
			System.out.println("1. Jugar");
			System.out.println("2. Guardar");
			System.out.println("3. Opciones");
			System.out.println("0. Salir");			
			System.out.println("Introduzca opci�n: ");
			opcion = sc.nextInt();
		}
	}
	
	public static void ejemploMenuWhileConSwitch() {
		Scanner sc = new Scanner(System.in);
		int opcion=-1;
		while (opcion!=0){
			// Imprimir men�
			System.out.println("1. Jugar");
			System.out.println("2. Guardar");
			System.out.println("3. Opciones");
			System.out.println("0. Salir");			
			System.out.println("Introduzca opci�n: ");
			opcion = sc.nextInt();  // coger opci�n
			switch(opcion) {	// tratar la opci�n
			case 1:
				System.out.println("Has elegido jugar");
				break;
			case 2:
				System.out.println("Has elegido guardar");
				break;
			case 3:
				System.out.println("Has elegido opciones");
				break;
			case 0:
				System.out.println("Gracias por jugar al juego. Nos vemos pronto!");
				break;
			default:
				System.out.println("Opci�n no v�lida. Vuelva a elegir opci�n.");
				break;
			}
		}
	}

	public static void main(String[] args) {
		// for1();
		// for2();
		// for3();
		// for4();
		// for5();
		// infinito1();
		// offTopicEnteros();
		// infinito2();
		// infinito3();
		// while1();
		// whileIgualQueFor();
		// whileIgualQueFor2();
		// doWhile1();
		// whileIgualQueDoWhile1();
		// forIgualQueDoWhile1();
		// forIgualQueDoWhile2BreakContinue();
		// ejemploMenuDoWhile();
		// ejemploMenuWhile();
		ejemploMenuWhileConSwitch();
	}

}
