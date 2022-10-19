package funciones;

import java.util.Scanner;

/**
 * Clase con ejemplos de funciones Fecha última modificación: 19/10/2022
 * 
 * @author Fran
 * @version 1.0
 */

public class Ejemplos {

	public static void buscarSiguiente(String cadena, String cadenaBuscada) {
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		int posicionEncontrada = -1;
		while (!salir) {
			posicionEncontrada = cadena.toLowerCase().indexOf(cadenaBuscada.toLowerCase(), posicionEncontrada + 1);
			if (posicionEncontrada != -1) { // Encuentro la cadena
				System.out.println(cadena.substring(posicionEncontrada));
				System.out.println("¿Buscar siguiente? (s/n): ");
				String respuesta = sc.nextLine();
				if (respuesta.toLowerCase().equals("n")) {
					salir = true;
				}
			} else {
				System.out.println("No se encuentran más ocurrencias de la cadena");
				salir = true;
			}
		}
	}

	public static void reemplazar(String cadena, String cadenaBuscada, String cadenaReemplazar) {
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		int posicionEncontrada = -1;
		while (!salir) {
			posicionEncontrada = cadena.toLowerCase().indexOf(cadenaBuscada.toLowerCase(), posicionEncontrada + 1);
			if (posicionEncontrada != -1) { // Encuentro la cadena
				System.out.println(cadena.substring(posicionEncontrada));
				System.out.println("¿Reemplazar y buscar siguiente? (s/n): ");
				String respuesta = sc.nextLine();
				if (respuesta.toLowerCase().equals("n")) {
					salir = true;
				} else {
					cadena = cadena.replaceFirst(cadenaBuscada, cadenaReemplazar);
				}
			} else {
				System.out.println("No se encuentran más ocurrencias de la cadena");
				salir = true;
			}
		}
		System.out.println("La cadena ha quedado así: " + cadena);
	}

	public static void funcion1() {
		System.out.println("hola mundo");
	}

	public static void funcion2() {
		System.out.println("adiós mundo");
	}

	/**
	 * Función que dado un número imprime su cuadrado
	 * 
	 * @param numero Número que pasamos obtenido por pantalla
	 */
	public static void cuadrado(int numero) {
		System.out.println(numero * numero);
	}

	/**
	 * Función que dado un número devuelve su cuadrado
	 * 
	 * @param numero Número del que queremos obtener el cuadrado
	 * @return El cuadrado del número pasado por parámetro
	 */
	public static int devolverCuadrado(int numero) {
		int cuadrado = numero * numero; // multiplico el número y lo asigno a una variable
		return cuadrado;
	}

	public static boolean esPositivo(int numero) {
		/*
		 * if(numero>=0) return true; else return false;
		 */
		return numero >= 0 ? true : false;
	}

	public static String concatenarCadenas(String... cadenas) {
		String resultado = "";
		System.out.println("He recibido " + cadenas.length + " cadenas");
		for (int i = 0; i < cadenas.length; i++) {
			resultado = resultado + " " + cadenas[i];
		}
		return resultado;
	}
	
	public static int cambiarValor(int numero) {
		numero = numero + 1;
		return numero;
	}
	
	// La linea del cambio de número2 se piere al salir
	public static int cambiarValor(int numero, int numero2) {
		numero = numero + 1;
		numero2 = numero2 +1;
		return numero;
	}
	
	public static void cambiarValorArray(int[] numeros) {
		numeros[0] = numeros[0] + 1;
		numeros[1] = numeros[1] + 1;
	}
	
	public static String cambiarString(String cadena) {
		cadena = cadena + " hola";
		return cadena;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// TODO Auto-generated method stub
		// funcion1();
		// funcion2();
		/*
		 * System.out.println("Primera búsqueda");
		 * buscarSiguiente("Esta es la cadena en la que quiero buscar", "la");
		 * System.out.println("Segunda búsqueda");
		 * buscarSiguiente("Esto es otra cadena", "ot");
		 */
		// reemplazar("Esto es una cadena donde aparece esto y esto","esto","aquello");

		// Programa que te va imprimiendo el cuadrado de los números que mete el usuario
		// por pantalla
		/*
		 * int numero = -1; while(numero!=0) {
		 * System.out.println("Introduzca un número (0 para terminar):"); numero =
		 * Integer.parseInt(sc.nextLine());
		 * System.out.println("El cuadrado del número es: "); cuadrado(numero); }
		 */

		// Programa que pide un número por pantalla y le suma 10 a su cuadrado
		/*
		 * System.out.println("Introduzca un número:"); int numero =
		 * Integer.parseInt(sc.nextLine()); int numeroCuadrado =
		 * devolverCuadrado(numero); double numeroPow = Math.pow(numero, 2);
		 * numeroCuadrado += 10; numeroPow += 10; System.out.println(numeroCuadrado);
		 * System.out.println(numeroPow);
		 */

		// Parámetros variables
		String resultado = concatenarCadenas("Hola");
		System.out.println(resultado);
		System.out.println(concatenarCadenas("Hola", "mundo"));
		System.out.println(concatenarCadenas("Hola", "mundo", "cruel"));
		System.out.println(concatenarCadenas());
		System.out.println(concatenarCadenas("Esto es una cadena", "otra", "otra", "otra"));

		int numero = 5;
		int cambio = cambiarValor(numero);
		System.out.println("Número: " + numero + " Cambio: " + cambio);
		int[] numeros = new int[2];
		numeros[0] = 5;
		numeros[1] = 6;
		cambiarValorArray(numeros);
		System.out.println("Número 0: " + numeros[0] + " Número 1: " + numeros[1]);
		String cad = "Fran";
		cambiarString(cad);
		System.out.println(cad); // "Fran" o "Fran hola"? -> Fran
		cad = cambiarString(cad);
		System.out.println(cad); // "Fran" o "Fran hola"? -> Fran hola
		String otra = "otra";
		otra.concat(" cadena");
		System.out.println(otra);  // "otra" o "otra cadena"?
	}

}
