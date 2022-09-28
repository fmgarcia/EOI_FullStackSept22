import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejercicios1 {

	public static void apartado2() {
		int n1 = 15, n2 = 4;
		
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
		System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
		System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
		System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
		System.out.println(n1 + " % " + n2 + " = " + (n1 % n2));
	}
	
	public static void apartado3() {
		int n1 = 4, n2 = 4;
		
		System.out.println(n1 + " es menor que " + n2 + ": " + (n1 < n2));
		System.out.println(n1 + " es igual que " + n2 + ": " + (n1 == n2));
		System.out.println(n1 + " es mayor o igual que " + n2 + ": " + (n1 >= n2));
	}
	
	public static void apartado4() {
		double num1 = 1.0;
		double num2 = 2.0;
		double num3 = 3.0;
		double num4 = 4.0;
		System.out.print(num1);
		System.out.print(num2);
		System.out.print(num3);
		System.out.println(num4);
		System.out.println(((num1+num2)*num3)/num4);
	}
	
	public static void apartado6() {
		int A = 1;
		int B = 2;
		int C = 3;
		int D = 4;
		final int auxA = A;
		final int auxB = B;
		final int auxC = C;
		final int auxD = D;
		System.out.print("Valores iniciales: A = " + A);
		System.out.print(" B = " + B);
		System.out.print(" C = " + C);
		System.out.println(" D = " + D);
		B=auxC; // B = 3
		C=auxA; // C = 1
		A=auxD; // A = 4
		D=auxB; // D = 2
		System.out.println("B toma el valor de C -> B = " + B);
		System.out.println("C toma el valor de A -> C = " + C);
		System.out.println("A toma el valor de D -> A = " + A);
		System.out.println("D toma el valor de B -> D = " + D);
		
	}
	
	public static void apartado7() {
		char c1 = 'b', c2 = 'k';
		System.out.println("'" + c1 + "' tiene la posición " + (int)c1);
		System.out.println("'" + c2 + "' tiene la posición " + (int)c2);
		System.out.println("Diferencia entre '" + c1 + "' y '" + c2 + "': " + (c2 - c1));

	}
	
	public static void apartado10() throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Dime un número: ");
		int num = Integer.parseInt(reader.readLine());
		System.out.println("Doble: " + (num * 2) + ", triple: " + (num * 3));
	}
	
	public static void apartado11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Grados centígrados: ");
		double gradosC = sc.nextDouble();
		double gradosF = 32 + (9 * gradosC / 5);
		System.out.println("Grados Farenheit: " + gradosF);
	}
	
	public static void apartado12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un número de 3 cifras: ");
		int num = sc.nextInt();
		int unidades = num % 10;
		int num2 = num / 10; 
		int decenas = num2 % 10; 
		int centenas = num2 / 10;
		
		System.out.println("Centenas: " + centenas + ", decenas: " + decenas + ", unidades: " + unidades);
	}
	
	public static void apartado13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Fecha de nacimiento (dia mes año): ");
		int dia = sc.nextInt();
		int mes = sc.nextInt();
		int anyo = sc.nextInt();
		
		int suma = dia + mes + anyo;
		int num1 = suma % 10;
		int num2 = (suma / 10) % 10;
		int num3 = (suma / 100) % 10;
		int num4 = suma / 1000;
		int numSuerte = num1 + num2 + num3 + num4;
		System.out.println("Tu número de la suerte es: " + numSuerte);
	}
	
	public static void apartado15() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Producto 1: ");
		String prod1 = reader.readLine();
		System.out.print("Precio 1: ");
		double precio1 = Double.parseDouble(reader.readLine());
		
		System.out.print("Producto 2: ");
		String prod2 = reader.readLine();
		System.out.print("Precio 2: ");
		double precio2 = Double.parseDouble(reader.readLine());
		
		System.out.print("Producto 3: ");
		String prod3 = reader.readLine();
		System.out.print("Precio 3: ");
		double precio3 = Double.parseDouble(reader.readLine());
	
		System.out.printf("%-15s%12s%12s\n", "NOMBRE", "PRECIO", "CON IVA");
		System.out.printf("%-15s%11.2f€%11.2f€\n", prod1, precio1, (precio1 * 1.21));
		System.out.printf("%-15s%11.2f€%11.2f€\n", prod2, precio2, (precio2 * 1.21));
		System.out.printf("%-15s%11.2f€%11.2f€\n", prod3, precio3, (precio3 * 1.21));
	}
	
	public static void apartado21() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nombre y edad: ");
		String nombre = sc.next();
		int edad = sc.nextInt();
		
		System.out.println("Estos son tus datos\n\tNombre: " + nombre + "\n\tEdad: " + edad);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
//		apartado1();
//		apartado2();
//		apartado4();
		apartado6();
//		apartado7();
//		apartado10();
//		apartado11();
//		apartado12();
//		apartado13();
//		apartado15();
//		apartado21();
	}

}
