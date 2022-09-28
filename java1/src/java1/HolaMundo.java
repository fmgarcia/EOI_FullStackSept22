package java1;

import java.util.Scanner;

public class HolaMundo {
	
	
	private static void iniciacion() {
		int numero = 10;
		int numero1 = 5;
		int numero_2 = 8;
		int _numero3 = 4;
		int suma = 0;
		double numeroConDecimales = 3.5;
		double numeroConDecimales2 = 4.4;
		char letra = 'a';
		String cadena = "Esto es una cadena";
		String cadenaA = "a";
		String cadenaVacia = "";
		String cadena2 = "Esta es una segunda cadena";
		final double IVA = 0.21;  // Así definimos una constante
		
		
		// Este es mi primer programa
		// Solamente saca por pantalla mensajes
		//System.out.println("Hola mundo!");
		System.out.println("Adiós mundo cruel!");  // esta linea imprime por pantalla
		/*System.out.println("Tercera linea");
		System.out.println("Cuarta linea");*/
		System.out.println(numero);
		System.out.println(numero1+numero+numero_2+_numero3);
		suma = numero + numero1;  // 15
		System.out.println(suma);
		System.out.println(numeroConDecimales+numeroConDecimales2);
		System.out.println(numero1 + numeroConDecimales);  // 8.5
		System.out.println(letra);
		System.out.println(cadena);
		System.out.println(letra + numero);  // 107??? -> a es 97 en ASCII
		System.out.println(cadenaA + numero); // a10. Ha concatenado la cadena y el número
		System.out.println(cadena + " " + cadena2);
		System.out.println(cadena + '\n' + cadena2);
		System.out.println(cadena + '\t' + cadena2);
		System.out.println("La suma da: " + numero1 + numero);  // La suma da: 510
		System.out.println("La suma da: " + (numero1 + numero));  // La suma da: 15
		int resto = 10 % 3; // resto vale 1 (módulo)
		System.out.println(resto); // 1
		numero += 3;  // 13
		System.out.println(numero);
		numero -= 3;  // 10
		System.out.println(numero);
		numero *= 3;  // 30
		System.out.println(numero);
		numero /= 4;  // ??? -> 7
		System.out.println(numero);
		double division = numero / 4.0;
		System.out.println(division);
		double decimales1 = 3.4, decimales2 = 2.5;
		int divisionDecimales = (int) (decimales1 + decimales2);  // 5
		System.out.println(divisionDecimales);
		double divisionDecimales2 = (int) (decimales1 + decimales2);  // 5.0
		System.out.println(divisionDecimales2);
		double divisionDecimales3 = (int) decimales1 + decimales2;  // 5.5
		System.out.println(divisionDecimales3);
		double divisionDecimales4 = (int) decimales1 + (int) decimales2;  // 5.0
		System.out.println(divisionDecimales4);
		double resultado = 7+4*2-5.0; // 10.0
		System.out.println(resultado);
		double resultado2 = (7+4)*(2-5.0); // -33.0
		System.out.println(resultado2);
		double resultado3 = (7+4)/(2.0); // 5.5
		System.out.println(resultado3);
		int dos = 2;
		int tres = 3;
		double resultado4 = tres / (double)dos;  // 1.5
		System.out.println(resultado4);
		//dos = 4; esto se puede hacer pq no es constante
		// IVA = 25; esto NO se puede hacer pq es constante
		int precio = 100; 
		System.out.println("La ropa cuesta: " + precio + "\nIVA:" 
		+ precio* IVA + "\nTOTAL: " + (precio + (precio*IVA)));
		// Preincremento, Postincremento, predecremento, postdecremento
		int valor = 10;
		valor++;  // 11  valor = valor + 1;  valor += 1; Postincremento
		valor--;  // 10  Postdecremento
		System.out.println(valor++); //10
		System.out.println(valor); // 11
		System.out.println(++valor); // 12  Preincremento
		System.out.println(valor);  // 12
		System.out.println(--valor); // 11  Predecremento
		System.out.println(valor);  // 11
		valor = 10;
		System.out.println(valor++ + ++valor + valor-- - --valor); // 10 + 12 + 12 - 10 = 24
		System.out.println(valor); // 10
		
		
	}
	
	
	private static void ejemplosConversiones() {
		Scanner sc = new Scanner(System.in);
		int prefijo = 34;
		int telefono = 666666666;
		System.out.println(prefijo + telefono); // 666666670
		//Conversiones
		System.out.println("" + prefijo + telefono); // 34666666666. Implícita
		System.out.println(String.valueOf(prefijo) + telefono); // 34666666666
		System.out.println(String.valueOf(prefijo) + String.valueOf(telefono)); // 34666666666
		System.out.println(Integer.toString(prefijo) + telefono); // 34666666666
		
		System.out.println("Introduzca el valor 1: ");
		String valor1 = sc.nextLine();
		valor1 = valor1.replace(',', '.');
		valor1 = valor1.trim();  // Quita los espacios por delante y por detrás
		System.out.println("El número que usted introdujo más 5 da: " + (valor1 + 5));  //105
		//System.out.println("El número que usted introdujo más 5 da: " + (Integer.parseInt(valor1) + 5));  //15
		//System.out.println("El número que usted introdujo más 5 da: " + (Integer.valueOf(valor1) + 5));  //15
		System.out.println("El número que usted introdujo más 5 da: " + (Double.parseDouble(valor1)  + 5));  //15
		
		sc.close();
	}
	
	private static void ejercicio1() {
		System.out.println("La suma es: " + (36+27));
	}
	
	private static void ejercicio4() {
		double num1 = 1.0;
		double num2 = 2.0;
		double num3 = 3.0;
		double num4 = 4.0;
		/*System.out.print(num1);
		System.out.print(num2);
		System.out.print(num3);
		System.out.println(num4);		
		System.out.println(((num1+num2)*num3)/num4);*/
		System.out.println(""+num1+num2+num3+num4);
		
	}
	
	private static void ejercicio5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int N = sc.nextInt();
		System.out.println("El valor de inicial de N es: " + N);
		N += 77;  // 78
		System.out.println("El valor incrementado en 77 es: " + N);
		
		sc.close();
	}	
	
	
	private static void ejercicio6() {
		//hola
	}
	
	private static void ejemplosComparaciones() {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b = 2;
		double c = 1.3;
		String cad1 = "hola";  // Java es case-sensitive (distingue mayúsculas y minúsculas)
		String cad2 = "Hola";
		String login = "111X";
		String password = "Fran1234";
		//System.out.println(a==c);  //false
		//System.out.println(a==b);
		//System.out.println(cad1==cad2);  // No debemos comparar las cadenas con ==
		//System.out.println(cad1.equals(cad2)); // Forma correcta de comparar cadenas
		//System.out.println(cad1.equals(cad2)); // Forma correcta de comparar cadenas
		System.out.println("Introduzca su login: ");
		String loginUsuario = sc.nextLine();
		//System.out.println(login.toLowerCase().equals(loginUsuario.toLowerCase())); // 1ª alternativa
		//System.out.println(login.equalsIgnoreCase(loginUsuario)); // 2ª alternativa
		System.out.println("Introduzca su password: ");
		String passwordUsuario = sc.nextLine();
		// System.out.println(password.equals(passwordUsuario));
		/*String datosUsuario = loginUsuario + " " + passwordUsuario;  // Concatenar cadenas
		String datosUsuario2 = loginUsuario.concat(passwordUsuario); // Concatenar cadenas
		System.out.println(datosUsuario);
		System.out.println(datosUsuario2);*/
		System.out.println(login.equalsIgnoreCase(loginUsuario) && password.equals(passwordUsuario));  // True si el usuario acierta login y password
		System.out.println(login.equalsIgnoreCase(loginUsuario) || password.equals(passwordUsuario));  // True si el usuario acierta login y/o el password
		System.out.println(login.equalsIgnoreCase(loginUsuario));  // Devuelve el resultado de la condición
		System.out.println(!login.equalsIgnoreCase(loginUsuario));  // Devuelve lo contrario al resultado de la condición
		
	}
	
	private static void ejemplosFormateos() {
		
		String nombre1 = "Paco";
		String nombre2 = "Anastasia";
		double salario1 = 2300.24;
		double salario2 = 24439.6;
		// 1er intento
		System.out.println(" NOMBRE SALARIO");
		System.out.println("---------------------------");
		System.out.println(" " + nombre1 + " " + salario1);
		System.out.println(" " + nombre2 + " " + salario2);
		// 2º intento
		System.out.printf("%12s%14s\n", "NOMBRE", "SALARIO");
		System.out.println("---------------------------");
		System.out.printf("%12s%14f€\n", nombre1, salario1);
		System.out.printf("%12s%14f€\n", nombre2, salario2);
		// 3er intento
		System.out.printf("%-12s%14s\n", "NOMBRE", "SALARIO");
		System.out.println("---------------------------");
		System.out.printf("%-12s%14f€\n", nombre1, salario1);
		System.out.printf("%-12s%14f€\n", nombre2, salario2);
		// 4º intento
		System.out.printf("%12s%14s\n", "NOMBRE", "SALARIO");
		System.out.println("---------------------------");
		System.out.printf("%12s%14.2f€\n", nombre1, salario1);
		System.out.printf("%12s%14.2f€\n", nombre2, salario2);
		
		// Fechas
		int dia = 4;
		int mes = 6;
		int anyo = 2013;
		System.out.printf("Fecha: %02d/%02d/%04d\n", dia, mes, anyo);
		
	}
	
	
	public static void main(String[] args) {
		
		//iniciacion();
		//ejercicio1();
		//ejemplosConversiones();
		//ejercicio4();
		//ejercicio5();
		//ejemplosComparaciones();
		//ejemplosFormateos();
	}
	
}
