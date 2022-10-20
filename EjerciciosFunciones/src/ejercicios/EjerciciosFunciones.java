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
			System.out.println("Est� en el rango");
		else
			System.out.println("No est� en el rango");
	}
	
	public static void ejercicio2b(String cadena, int a, int b) {
		if(cadena.length()>=a && cadena.length()<=b)
			System.out.println("Est� en el rango");
		else
			System.out.println("No est� en el rango");
	}
	
	public static void ejercicio2c(String cadena, int a, int b) {
		System.out.println(cadena.length()>=a && cadena.length()<=b?"Est� en el rango":"No est� en el rango");
	}
	
	public static void ejercicio2cMejorado(String cadena, int a, int b) {
		System.out.println(cadena.length()>=Math.min(a, b) && cadena.length()<=Math.max(a, b)?"Est� en el rango":"No est� en el rango");
	}
	
	// Crea una funci�n que reciba un car�cter y un n�mero, dibuja un cuadrado usando ese
	// car�cter cuyo ancho y alto sea igual al n�mero recibido. Prueba la funci�n.
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
	
	public static void main(String[] args) {
		//ejercicio2("hola",2,4);  // Est� en el rango
		//ejercicio2("adi�s",2,4); // No est� en el rango
		//ejercicio2b("hola",2,4);  // Est� en el rango
		//ejercicio2b("adi�s",2,4); // No est� en el rango
		//ejercicio2c("hola",4,2);  // Est� en el rango
		//ejercicio2c("adi�s",4,2); // No est� en el rango
		//ejercicio2cMejorado("hola",4,2);  // Est� en el rango
		//ejercicio2cMejorado("adi�s",4,2); // No est� en el rango
		ejercicio3('*',7);
	}

}
