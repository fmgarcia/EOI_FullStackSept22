package java1;

public class HolaMundo {
	
	public static void main(String[] args) {
		
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

	}
	
}
