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
	
	public static void leer1(String directorio, String nombreFichero) throws IOException {
		Files.readAllLines(Paths.get(directorio + File.separator + nombreFichero))
		.forEach(l->System.out.println(l));
	}
	
	public static void leer2(String directorio, String nombreFichero) throws IOException {		
		String rutaAbsoluta = directorio + File.separator + nombreFichero; // construir la cadena
		Path rutaOrdenador =  Paths.get(rutaAbsoluta); // transformar la cadena en una ruta entendible por la clase Files (Path)
		List<String> lineasFichero = Files.readAllLines(rutaOrdenador); // Leer el fichero y pasarlo a una lista de líneas
		lineasFichero.forEach(l->System.out.println(l)); // recorrer las líneas		
	}
	
	public static void escribir1(String directorio, String nombreFichero, List<String> lineas) throws IOException {
		Files.write(Paths.get(directorio + File.separator + nombreFichero), lineas, StandardOpenOption.CREATE_NEW);
	}

	public static void main(String[] args) throws IOException  {		
		//leer1("c:\\ficheros","eoi.txt");
		//leer1("c:\\ficheros\\datosbancos","caixa.txt");
		//leer2("c:\\ficheros","eoi.txt");
		List<String> lineas = Arrays.asList("Linea 1" , "Línea 2");
		escribir1("c:\\ficheros","ejemploeoi.txt",lineas);
	}

}
