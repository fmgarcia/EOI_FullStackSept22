package funciones;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

/**
 * Clase con ejemplos de funciones Fecha �ltima modificaci�n: 19/10/2022
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
	 * 
	 * @param numero N�mero que pasamos obtenido por pantalla
	 */
	public static void cuadrado(int numero) {
		System.out.println(numero * numero);
	}

	/**
	 * Funci�n que dado un n�mero devuelve su cuadrado
	 * 
	 * @param numero N�mero del que queremos obtener el cuadrado
	 * @return El cuadrado del n�mero pasado por par�metro
	 */
	public static int devolverCuadrado(int numero) {
		int cuadrado = numero * numero; // multiplico el n�mero y lo asigno a una variable
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
	
	// La linea del cambio de n�mero2 se piere al salir
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
	
	public static double absFran(double numero) {
		if(numero>=0)
			return numero;
		else
			return -numero;
	}
	
	public static void ejemplosMath() {
		double n1 = -23.40;
		double n2 = 2.349532;
		double n3 = 2.99;
		double n4 = -2.99;
		
		// -3, -2, -1, 0, 1, 2, 3

		System.out.println(Math.abs(n1)); // Devuelve el valor absoluto: 23.4
		System.out.println(absFran(n1)); // Devuelve el valor absoluto: 23.4
		System.out.println(Math.round(n2)); // 2. Redondea. A partir de .50 hacia arriba y sino hacia abajo
		System.out.println(Math.floor(n3)); // 2. Duvuelve el n�mero por debajo del argumento 
		System.out.println(Math.floor(n4)); // ??? -> -3
		System.out.println(Math.ceil(n3)); // ??? -> 3 Devuelve el siguiente n�mero al argumento pasado
		System.out.println(Math.ceil(n4)); // ??? -> -2		
		System.out.println(Math.max(23, 43)); // 43
		System.out.println(Math.min(4, 5)); // 4
		System.out.println(Math.sqrt(25)); // 5 . raiz cuadrada
		System.out.println(Math.pow(5,2)); // 25 . elevar al cuadrado
		System.out.println(Math.pow(5,3)); // 125 . elevar al cuadrado
		System.out.println(Math.sin(90)); // 1. calculo del seno
		System.out.println(Math.random()); // n�mero aleatorio entre 0.00 y 1.00
		Random r = new Random();
		int valorDado = r.nextInt(10)+1;  // Entre 0 y 10 excluido, m�s 1, es decir, del 1 al 10 ambos incluidos.
		System.out.println(valorDado); // Imprime entre 1 y 10
	}
	
	public static void ejemplosCadenas() {
		String cadena = "Hola mundo";
		
		System.out.println(cadena.charAt(0)); // H
		System.out.println(cadena.concat(" cruel")); // hola mundo cruel
		System.out.println(cadena); // hola mundo
		String[] nombres = {"Paco", "Pepa", "Dani"};
		System.out.println(String.join(", ", nombres)); // Paco, Pepa, Dani
		String nombresJuntos = String.join(", ", nombres);
		System.out.println(nombresJuntos); // Paco, Pepa, Dani
		String s1 = "ahora";
		String s2 = "despues";
		System.out.println(s1.compareTo(s2)); // -3
		String s = "Mi perro se llama Comeni�os";
		System.out.println(s.indexOf("perro")); // 3
		System.out.println(s.indexOf("gato")); // -1
		System.out.println(s.contains("perro")); // true
		System.out.println(s.contains("gato")); // false
		s = s.replace("perro", "koala");
		System.out.println(s); // Mi koala se llama Comeni�os
		s = "Mi perro se llama Comeni�os";
		String animal = s.substring(3, 8);
		System.out.println(animal); // perro
		s = "pato-gato-perro-koala";
		String[] animales = s.split("-");
		System.out.println("Hay " + animales.length + " animales"); // Hay 4 animales
		for(String animalString : animales) {
			System.out.println(animalString);
		}
		
		String tiempo = "51.50853,-0.12574,1546300800,2019-01-01 00:00:00 +0000 UTC,1546300800,2019-01-01 00:00:00 +0000 UTC,8.08,4.63,1034.848,1029.908,78.61,,2.959,292.075,,,,,,,,,";
		String[] datos = tiempo.split(",");
		System.out.println(datos[6]);  // 8.08 (obtiene la temperatura)
		
	}
	
	public static void ejemplosFechas() {
		String fechaTexto = "01/12/2010";
		LocalDate fechaAhora = LocalDate.now();
		LocalDate fechaAyer = LocalDate.now().minusDays(1);
		System.out.println(fechaAhora);
		LocalDate fechaAhoraMas30 = fechaAhora.plusDays(30);  // Suma n�mero de d�as
		System.out.println(fechaAhoraMas30);
		System.out.println(fechaAhora.plusWeeks(40));  // Suma 40 semanas
		System.out.println(fechaAhora.minusMonths(2));  // Resta 2 meses
		//System.out.println(fechaTexto + 1);  // No tiene sentido
		System.out.println("Hoy es el d�a: " + fechaAhora.getDayOfMonth());
		System.out.println("Hoy es el d�a a�o: " + fechaAhora.getDayOfYear());
		System.out.println("Hoy es el mes: " + fechaAhora.getMonthValue());
		System.out.println("Hoy es el a�o: " + fechaAhora.getYear());
		System.out.println("Hoy es el d�a de la semana: " + fechaAhora.getDayOfWeek());
		System.out.println("Hoy es antes que ayer: " + fechaAhora.isBefore(fechaAyer));
		System.out.println("Fecha como n�mero: " + fechaAhora.toEpochDay());  // Te transforma una fecha a un n�mero (a partir del 01/01/1970 por convenci�n)
		System.out.println("Fecha como n�mero: " + fechaAhora.ofEpochDay(19284));  // Te transforma un n�mero a una fecha
		
		String fechaTextoLarga = "2019-01-01 00:00:00 +0000 UTC";
		LocalDate fechaTextoConvertida = LocalDate.parse(fechaTexto);
		System.out.println(fechaTextoConvertida);
		
	}

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);

		// TODO Auto-generated method stub
		// funcion1();
		// funcion2();
		/*
		 * System.out.println("Primera b�squeda");
		 * buscarSiguiente("Esta es la cadena en la que quiero buscar", "la");
		 * System.out.println("Segunda b�squeda");
		 * buscarSiguiente("Esto es otra cadena", "ot");
		 */
		// reemplazar("Esto es una cadena donde aparece esto y esto","esto","aquello");

		// Programa que te va imprimiendo el cuadrado de los n�meros que mete el usuario
		// por pantalla
		/*
		 * int numero = -1; while(numero!=0) {
		 * System.out.println("Introduzca un n�mero (0 para terminar):"); numero =
		 * Integer.parseInt(sc.nextLine());
		 * System.out.println("El cuadrado del n�mero es: "); cuadrado(numero); }
		 */

		// Programa que pide un n�mero por pantalla y le suma 10 a su cuadrado
		/*
		 * System.out.println("Introduzca un n�mero:"); int numero =
		 * Integer.parseInt(sc.nextLine()); int numeroCuadrado =
		 * devolverCuadrado(numero); double numeroPow = Math.pow(numero, 2);
		 * numeroCuadrado += 10; numeroPow += 10; System.out.println(numeroCuadrado);
		 * System.out.println(numeroPow);
		 */

		// Par�metros variables
		/*String resultado = concatenarCadenas("Hola");
		System.out.println(resultado);
		System.out.println(concatenarCadenas("Hola", "mundo"));
		System.out.println(concatenarCadenas("Hola", "mundo", "cruel"));
		System.out.println(concatenarCadenas());
		System.out.println(concatenarCadenas("Esto es una cadena", "otra", "otra", "otra"));

		int numero = 5;
		int cambio = cambiarValor(numero);
		System.out.println("N�mero: " + numero + " Cambio: " + cambio);
		int[] numeros = new int[2];
		numeros[0] = 5;
		numeros[1] = 6;
		cambiarValorArray(numeros);
		System.out.println("N�mero 0: " + numeros[0] + " N�mero 1: " + numeros[1]);
		String cad = "Fran";
		cambiarString(cad);
		System.out.println(cad); // "Fran" o "Fran hola"? -> Fran
		cad = cambiarString(cad);
		System.out.println(cad); // "Fran" o "Fran hola"? -> Fran hola
		String otra = "otra";
		otra.concat(" cadena");
		System.out.println(otra);  // "otra" o "otra cadena"? -> otra
		otra = otra.concat(" cadena");
		System.out.println(otra);  // "otra" o "otra cadena"? -> otra cadena
		
		// No cambia: int, float, double, char, String (se pasan por valor, se hace una copia y se trabaja sobre la copia)
		// Si cambia: Arrays, Listas, Objetos (se pasan por referencia, se trabaja con el objeto original y las modificaciones le afectan)
		*/
		//ejemplosMath();
		//ejemplosCadenas();
		ejemplosFechas();
	
	}

}
