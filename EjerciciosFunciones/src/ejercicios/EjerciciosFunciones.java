package ejercicios;

public class EjerciciosFunciones {

	public static void ejercicio2(String cadena, int a, int b) {
		int letras = cadena.length();
		int min,max;
		if(a<b) {
			min = a;
			max = b;
		}
		else {
			min = b;
			max = a;
		}
		if(letras>=min && letras<=max)
			System.out.println("Está en el rango");
		else
			System.out.println("No está en el rango");
	}
	
	public static void ejercicio2b(String cadena, int a, int b) {
		if(cadena.length()>=a && cadena.length()<=b)
			System.out.println("Está en el rango");
		else
			System.out.println("No está en el rango");
	}
	
	public static void ejercicio2c(String cadena, int a, int b) {
		System.out.println(cadena.length()>=a && cadena.length()<=b?"Está en el rango":"No está en el rango");
	}
	
	public static void ejercicio2cMejorado(String cadena, int a, int b) {
		System.out.println(cadena.length()>=Math.min(a, b) && cadena.length()<=Math.max(a, b)?"Está en el rango":"No está en el rango");
	}
	
	// Crea una función que reciba un carácter y un número, dibuja un cuadrado usando ese
	// carácter cuyo ancho y alto sea igual al número recibido. Prueba la función.
	public static void ejercicio3(char caracter, int numero) {
		// Fila arriba
		for(int i=0; i<numero;i++) {
			System.out.print(caracter);
		}
		System.out.println();		
		// Filas de mitad
		for(int i=0; i<numero-2;i++) {
			System.out.print(caracter);  // el lado izquierdo del cuadrado
			for(int j=0; j<numero-2;j++) {
				System.out.print(" ");
			}
			System.out.print(caracter); // el lado derecho del cuadrado
			System.out.println();
		}				
		// Fila abajo
		for(int i=0; i<numero;i++) {
			System.out.print(caracter);
		}		
	}
	
	public static void ejercicio3a(char caracter, int numero) {
		for(int i=0; i<numero;i++) {
			if(i==0 || i==numero-1) {
				for(int j=0; j<numero;j++) {
					System.out.print(caracter);
				}
				System.out.println();
			}
			else {
				System.out.print(caracter);  // el lado izquierdo del cuadrado
				for(int j=0; j<numero-2;j++) {
					System.out.print(" ");
				}
				System.out.print(caracter); // el lado derecho del cuadrado
				System.out.println();
			}
		}					
	}
	
	public static void ejercicio3b(char caracter, int numero) {
		for(int i=0; i<numero;i++) {
			if(i==0 || i==numero-1) {
				String repetido = "" + caracter;
				System.out.println(repetido.repeat(numero));
			}
			else {
				String repetido = " ";
				System.out.println(caracter + repetido.repeat(numero-2) + caracter);
			}
		}	
	}
	
	
	public static void ejercicio3c(char caracter, int numero) {
		for(int i=0; i<numero;i++) 
			System.out.println((i==0 || i==numero-1)?
					("" + caracter).repeat(numero):
					caracter + " ".repeat(numero-2) + caracter);	
	}
	
	public static void main(String[] args) {
		//ejercicio2("hola",2,4);  // Está en el rango
		//ejercicio2("adiós",2,4); // No está en el rango
		//ejercicio2b("hola",2,4);  // Está en el rango
		//ejercicio2b("adiós",2,4); // No está en el rango
		//ejercicio2c("hola",4,2);  // Está en el rango
		//ejercicio2c("adiós",4,2); // No está en el rango
		//ejercicio2cMejorado("hola",4,2);  // Está en el rango
		//ejercicio2cMejorado("adiós",4,2); // No está en el rango
		//ejercicio3('*',7);
		//ejercicio3b('*',7);
		//ejercicio3c('*',7);
		ejercicio3a('*',7);
	}

}
