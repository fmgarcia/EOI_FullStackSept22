package ejemplo1;

import java.util.Scanner;

public class Main {

	/**
	 * Declaración de variables y acceso
	 */
	public static void ejemplo1() {
		int numero = 50;
		numero = 12; // Cambiamos el valor
		System.out.println(numero); // 12
		
		String nombre;
		nombre = "Pedro";
		System.out.println(nombre);
		
		int ancho = 4, alto = 6;
		int area = ancho * alto;
		System.out.println("Área: " + area + " m2");
		
		final double decimal = 4.56; // constante
		// decimal = 5.6; -> ERROR, no se puede cambiar el valor de una constante
	}
	
	public static void ejemplo2() {
		double total = 0;
		// A total, súmale 3, multiplícala por 5 y réstale 8
		total += 3;
		total *= 5;
		total -= 8;
		System.out.println("Total: " + total);
	}
	
	public static void ejemplo3() {
		int a = 5, b = 3;
		int res = a++ + ++b - a++;
		//        5   +   4 -   6
		// a = 7, b = 4
		System.out.println(res);
	}
	
	public static void ejemplo4() {
		char c = 'r';
		System.out.println('r' - 'a' + 1); // 18 ( 114 - 97)
		int posA = 'a';
		System.out.println(posA); // 97 -> Pos caracter Unicode
	}
	
	public static void ejemplo5() {
		int edad = 25;
		System.out.println("Dentro de 5 años tendrás: " + (edad - 5) + " años");
	
		int prefijo = 34;
		int telefono = 645675345;
		System.out.println("" + prefijo + telefono); // Concatena prefijo y telefono
	}

	public static void ejemplo6() {
		System.out.println(12 != 9); // true
		String c1 = "ho";
		c1 += "la";
		String c2 = "hola";
		System.out.println(c1.equals(c2)); // true
		System.out.println(!c1.equals(c2)); // false
		System.out.println(c1 + " - " + c2);
	}
	
	public static void ejemplo7() {
		double d1 = 45.24;
		System.out.println((int)d1); // 45
		
		int n1 = 10;
		int n2 = 4;
		System.out.println(n1 / (double)n2); // 2.5
		
		char c = '.';
		System.out.println("Posición Unicode de '.' -> " + (int)c);
	
		String edad = "24";
		System.out.println("Dentro de 2 años tendrás: " + (Integer.parseInt(edad) + 2));
	
		int posUnicode = 165;
		System.out.println((char) posUnicode);
	}
	
	/**
	 * Ejemplo printf (salida formateada)
	 */
	public static void ejemplo8() {
		String nombre1 = "Paco";
		String nombre2 = "Anastasia Martínez";
		double salario1 = 20300.24;
		double salario2 = 24439.6;

		System.out.println(" NOMBRE             SALARIO");
		System.out.println("---------------------------");
		System.out.printf(" %-14.14s %10.2f€\n", nombre1, salario1);
		System.out.printf(" %-14.14s %10.2f€\n", nombre2, salario2);
	
		int dia = 4;
		int mes = 6;
		int anyo = 2013;
		System.out.printf("Fecha: %02d/%02d/%4d\n", dia, mes, anyo);
	}
	
	// Leer desde consola
	public static void ejemplo9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime tu edad: ");
		int edad = Integer.parseInt(sc.nextLine());
		System.out.print("Dime tu nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Te llamas " + nombre + " y tienes " + edad + " años");
		sc.close();
	}
	
	public static void main(String[] args) {
//		ejemplo1();
//		ejemplo2();
//		ejemplo3();
//		ejemplo4();
//		ejemplo5();
//		ejemplo6();
//		ejemplo7();
//		ejemplo8();
		ejemplo9();
	}
	
}
