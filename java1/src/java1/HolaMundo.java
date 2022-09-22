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
		
	}
	
}
