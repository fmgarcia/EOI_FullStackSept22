package ejercicios;

public class EjerciciosFunciones {
	
	public static void ejercicio1() {
		for(int i=0; i<20;i++) {
			System.out.print("*");
		}
	}
	
	public static void ejercicio1Mejorado(int numero,String cadena) {
		for(int i=0; i<numero;i++) {
			System.out.print(cadena);
		}
	}

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
	
	public static void ejercicio3bConMiFuncion(char caracter, int numero) {
		for(int i=0; i<numero;i++) {
			if(i==0 || i==numero-1) {
				ejercicio1Mejorado(numero,""+caracter);
				System.out.println();
			}
			else {
				System.out.print(caracter);
				ejercicio1Mejorado(numero-2," ");
				System.out.println(caracter);
			}
		}	
	}
	
	
	public static void ejercicio3c(char caracter, int numero) {
		for(int i=0; i<numero;i++) 
			System.out.println((i==0 || i==numero-1)?
					("" + caracter).repeat(numero):
					caracter + " ".repeat(numero-2) + caracter);	
	}
	
	// Crea una funci�n con 2 par�metros. El primero ser� una cadena y representa al
	// nombre de una persona, mientras que el segundo contendr� al resto de par�metros
	// recibidos (�), que ser�n cadenas con los trabajos que la persona ha realizado.
	// Imprime por consola el nombre de la persona seguido de la lista de trabajos realizados
	// por la misma. Si no hay ning�n trabajo, indica que no ha trabajado nunca. Prueba la funci�n
	// varias veces, al menos una de ellas no le pases ning�n trabajo.

	public static void ejercicio4(String nombre,String... trabajos) {
		System.out.println("La persona: " + nombre);
		if(trabajos.length==0)
			System.out.println("La persona no ha trabajado nunca.");
		else {
			for(int i=0;i<trabajos.length;i++) {
				System.out.println(trabajos[i]);
			}
		}
	}
	
	
	// 5 trabajos son las posiciones 0,1,2,3,4
	public static void ejercicio4Camila(String nombre,String... trabajos) {
		System.out.println("La persona: " + nombre);
		if(trabajos.length==0)
			System.out.println("La persona no ha trabajado nunca.");
		else {
			for(int i=0;i<trabajos.length;i++) {
				if (i < trabajos.length-1) {
					System.out.print(trabajos[i] + ", ");
				} else {
					System.out.print(trabajos[i] + ".");
				}
			}
		}
	}
	
	// 5 trabajos son las posiciones 0,1,2,3,4
		public static void ejercicio4CamilaB(String nombre,String... trabajos) {
			System.out.println("La persona: " + nombre);
			if(trabajos.length==0)
				System.out.println("La persona no ha trabajado nunca.");
			else {
				for(int i=0;i<trabajos.length;i++) {
					if (i==trabajos.length-1) {
						System.out.print(trabajos[i] + ". ");
					} else {
						System.out.print(trabajos[i] + ",");
					}
				}
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
		//ejercicio3('*',7);
		//ejercicio3b('*',7);
		//ejercicio3bConMiFuncion('*',7);
		//ejercicio3c('*',7);
		//ejercicio3a('*',7);
		//ejercicio1();
		//ejercicio1();
		//ejercicio1();
		//ejercicio1Mejorado(6,"*-4a");
		//ejercicio4("Fran");
		//ejercicio4("Francisco","Suma","Consultor�a","Profesor IES","Programador","EOI");
		ejercicio4Camila("Francisco","Suma","Consultor�a","Profesor IES","Programador","EOI");
		//ejercicio4CamilaB("Francisco","Suma","Consultor�a","Profesor IES","Programador","EOI");
		
	}

}
