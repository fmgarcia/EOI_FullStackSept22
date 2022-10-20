package ficheros;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;


public class EjemplosFicheros {
	
	public static void leer1(String directorio, String nombreFichero)  {
		try {
			Files.readAllLines(Paths.get(directorio + File.separator + nombreFichero))
			.forEach(l->System.out.println(l));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void leer2(String directorio, String nombreFichero)  {		
		String rutaAbsoluta = directorio + File.separator + nombreFichero; // construir la cadena
		Path rutaOrdenador =  Paths.get(rutaAbsoluta); // transformar la cadena en una ruta entendible por la clase Files (Path)
		try {
			List<String> lineasFichero = Files.readAllLines(rutaOrdenador); // Leer el fichero y pasarlo a una lista de líneas
			lineasFichero.forEach(l->System.out.println(l)); // recorrer las líneas	
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public static void leerRutaEntera(String ruta) {
		try {
			Files.readAllLines(Paths.get(ruta)).forEach(l->System.out.println(l));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fin de la función");
	}
	
	public static void escribir1(String directorio, String nombreFichero, List<String> lineas) {
		try {
			Files.write(Paths.get(directorio + File.separator + nombreFichero),
					lineas, StandardOpenOption.CREATE_NEW);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void ejemploTry() {
		int numero1 =10;
		int numero2 = 0;
		try {
			int division = numero1/numero2;
		} catch (Exception e) {			
			System.out.println("Error en la división");
		}
	}
	
	public static void ejemploTry2() {
		int numero1 =10;
		int numero2 = 0;
		int[] enteros = new int[2];
		enteros[0]= 10;
		enteros[1]= 15;
		String cadena = null;
		int longitudCadena = 0;
		try {
			if(cadena!=null)
				longitudCadena = cadena.length();
			else
				throw new Exception("Cadena Nula");
			enteros[2] = longitudCadena;
			int division = numero1/numero2;
			Files.write(Paths.get("c:\\ficherox\\eoi.txt"),
					Arrays.asList(""+division), StandardOpenOption.CREATE_NEW);
			
		} catch (ArithmeticException e) {
			e.printStackTrace(); // Esto ayuda a saber donde está el problema
			System.out.println("Error en la división"); // controlamos la división
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error en acceso al fichero");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Otro tipo de error");
		} finally {
			// Esto se ejecuta haya acabado el try correctamente o 
			// haya fallado una línea y generado una excepcion y saltado al catch
		}
		// Esto se ejecutaría siempre
		System.out.println("Hola");
	}

	public static void main(String[] args) {		
		//leer1("c:\\ficheros","eoi.txt");
		//leer1("c:\\ficheros\\datosbancos","caixa.txt");
		//leer2("c:\\ficheros","eoi.txt");
		//List<String> lineas = Arrays.asList("Linea 1" , "Línea 2");
		//escribir1("c:\\ficheros","ejemploeoi.txt",lineas);
		//leerRutaEntera("c:\\ficherox\\eoi.txt");
		
		//ejemploTry();
		ejemploTry2();
		System.out.println("Fin del main");
	}

}
