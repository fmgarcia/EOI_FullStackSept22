package funciones;

import java.util.Scanner;

public class Ejemplos {
	
	
	public static void buscarSiguiente(String cadena, String cadenaBuscada) {
		Scanner sc = new Scanner(System.in);		
		boolean salir = false;
		int posicionEncontrada = -1;
		while (!salir) {
			posicionEncontrada = cadena.toLowerCase().indexOf(cadenaBuscada.toLowerCase(), posicionEncontrada + 1);
			if (posicionEncontrada != -1) { // Encuentro la cadena
				System.out.println(cadena.substring(posicionEncontrada));
				System.out.println("�Buscar siguiente? (s/n): ");
				String respuesta = sc.nextLine();
				if (respuesta.toLowerCase().equals("n")) {
					salir = true;
				}
			} else {
				System.out.println("No se encuentran m�s ocurrencias de la cadena");
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
				System.out.println("�Reemplazar y buscar siguiente? (s/n): ");
				String respuesta = sc.nextLine();
				if (respuesta.toLowerCase().equals("n")) {
					salir = true;
				} else {
					cadena = cadena.replaceFirst(cadenaBuscada, cadenaReemplazar);
				}
			} else {
				System.out.println("No se encuentran m�s ocurrencias de la cadena");
				salir = true;
			}
		}
		System.out.println("La cadena ha quedado as�: " + cadena);
	}

	public static void funcion1() {
		System.out.println("hola mundo");
	}
	public static void funcion2() {
		System.out.println("adi�s mundo");
	}
	
	/**
	 * Funci�n que dado un n�mero imprime su cuadrado
	 * @param numero N�mero que pasamos obtenido por pantalla
	 */
	public static void cuadrado(int numero) {
		System.out.println(numero*numero);
	}
	
	public static int devolverCuadrado(int numero) {
		int cuadrado = numero * numero;
		return cuadrado;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		//funcion1();
		//funcion2();
		/*System.out.println("Primera b�squeda");
		buscarSiguiente("Esta es la cadena en la que quiero buscar", "la");
		System.out.println("Segunda b�squeda");
		buscarSiguiente("Esto es otra cadena", "ot");*/
		//reemplazar("Esto es una cadena donde aparece esto y esto","esto","aquello");
		
		//Programa que te va imprimiendo el cuadrado de los n�meros que mete el usuario por pantalla
		/*int numero = -1;
		while(numero!=0) {
			System.out.println("Introduzca un n�mero (0 para terminar):");
			numero = Integer.parseInt(sc.nextLine());
			System.out.println("El cuadrado del n�mero es: ");
			cuadrado(numero);
		}*/
		
		
		// Programa que pide un n�mero por pantalla y le suma 10 a su cuadrado
		System.out.println("Introduzca un n�mero:");
		int numero = Integer.parseInt(sc.nextLine());
		int numeroCuadrado = devolverCuadrado(numero);
		double numeroPow = Math.pow(numero, 2);
		numeroCuadrado += 10;
		numeroPow += 10;
		System.out.println(numeroCuadrado);
		System.out.println(numeroPow);
	}

}
