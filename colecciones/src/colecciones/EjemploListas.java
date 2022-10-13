package colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class EjemploListas {

	public static void ejemplo1() {
		// Crear listas
		List<String> nombres = new ArrayList<String>(); 	
		// anyadir elementos
		nombres.add("Fran");
		nombres.add("Dani");
		nombres.add("Fran");
		nombres.add("Daniela");	
		System.out.println(nombres);  // imprime toda la lista
		// recorre una lista e imprime su contenido
		for(String nombre : nombres) {
			System.out.println(nombre);
		}	
		nombres.forEach(e->System.out.println(e));
		nombres.forEach(e->System.out.println(e + " Garc�a"));
		nombres.forEach(e->System.out.println(e.length())); // 4,4,4,7
		// eliminar elementos de una lista
		nombres.remove(1); // borro posicionalmente
		nombres.forEach(e->System.out.println(e));
		nombres.remove("Fran");  // borra el primer Fran que encuentre
		nombres.remove("Paco");	 // no hace nada pq no existe ese elemento en la lista
		System.out.println("Lista tras borrar Fran y Paco");
		nombres.forEach(e->System.out.println(e));
		// a�adir en una posici�n intermedia
		nombres.add(1, "Nuevo nombre");
		nombres.forEach(e->System.out.println(e));
		// tama�o de la lista
		System.out.println("El tama�o de la lista es: " + nombres.size());
		// Conversiones entre arrays y listas
		// 1. Convertir de lista a array
		String[] nombresArray = new String[nombres.size()];
		nombres.toArray(nombresArray);
		System.out.println("Impresi�n de la lista");
		nombres.forEach(e->System.out.println(e));
		System.out.println("Impresi�n del array");
		System.out.println(Arrays.toString(nombresArray));
		// 2. Convertir de array en lista
		String[] meses = { "Enero", "febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" }; 
		List<String> mesesLista = new ArrayList<String>(Arrays.asList(meses));
		mesesLista.forEach(e->System.out.println(e));
		// Creaci�n de una lista a partir de otra/s
		List<String> alumnosDam = new ArrayList<String>(Arrays.asList("pablo","Ismael","Yessica"));
		List<String> alumnosEoi = new ArrayList<String>(Arrays.asList("Alberto","Benjam�n","Camila","Pablo"));
		List<String> alumnosBorrar = new ArrayList<String>(Arrays.asList("Pablo","Benjam�n"));
		List<String> todosAlumnos = new ArrayList<String>(alumnosDam);  // pablo, Ismael, Yessica
		todosAlumnos.addAll(alumnosEoi); // pablo, Ismael, Yessica, Alberto, Benjam�n, Camila, Pablo
		System.out.println("Todos mis alumnos:");
		todosAlumnos.forEach(e->System.out.println(e));
		todosAlumnos.removeAll(alumnosBorrar);
		System.out.println("Todos mis alumnos menos los borrados:");
		todosAlumnos.forEach(e->System.out.println(e));
		// Eliminar toda la lista
		todosAlumnos.clear();
		if(todosAlumnos.isEmpty()) {
			System.out.println("La lista est� vac�a");
		}
		// Ordenar una lista
		alumnosDam.sort(null);
		System.out.println(alumnosDam);
		alumnosDam.sort(Collections.reverseOrder());
		System.out.println(alumnosDam);
		alumnosDam.sort(String.CASE_INSENSITIVE_ORDER);		
		System.out.println(alumnosDam);
		alumnosDam.sort(Comparator.comparingInt(String::length));		
		System.out.println(alumnosDam);
		alumnosDam.sort(String.CASE_INSENSITIVE_ORDER.reversed());
		System.out.println(alumnosDam);
		
	}
	
	public static void buscarLista() {

		List<String> meses = new ArrayList<String>(Arrays.asList("Enero", "febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre"));
		if(meses.contains("enero"))
			System.out.println("enero existe en la lista");
		if(meses.containsAll(new ArrayList<String>(Arrays.asList("Enero","febrero"))))
			System.out.println("Enero y febrero existen en la lista");
		
	}
	
	public static void reemplazarLista() {
		List<String> meses = new ArrayList<String>(Arrays.asList("Enero", "febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre"));
		meses.replaceAll(e->e + " mes");  // hace una operaci�n a TODOS los elementos de una lista, sin ning�n tipo de filtro.
		meses.forEach(e->System.out.println(e));
		meses = new ArrayList<String>(Arrays.asList("Enero", "febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre"));
		meses.replaceAll(cadena->cadena.substring(0, 1).toUpperCase() + cadena.substring(1).toLowerCase()); // Capitalizar una lista entera
		meses.forEach(e->System.out.println(e));
		// Filtrar elementos en la cadena
		meses.stream()
			.filter(e->e.equals("Julio")  || e.equals("Agosto"))
			.forEach(e-> e="Verano");  // Esto no hace lo que nosotros queremos, ya que no puede reemplazar sobre la marcha
		//meses.forEach(e->System.out.println(e))

		// Buscar los elementos que queremos y cambiar el contenido de su posici�n
		meses.indexOf("Julio"); // 6
		meses.set(meses.indexOf("Julio"), "Verano");
		meses.set(meses.indexOf("Agosto"), "Verano");
		meses.set(11, "December");		
		meses.forEach(e->System.out.println(e));
		
	}
	
	public static void algunasOperacionesCadenas() {
		String cadena = "Hola mundo";
		System.out.println(cadena.length());  // 10
		cadena.replace("Hola", "hola");  // Esto no hace lo que yo quiero
		System.out.println(cadena); // Hola o hola? -> Hola (inmutabilidad de las cadenas)
		cadena = cadena.replace("Hola", "hola");  // Esto s� hace lo que yo quiero
		System.out.println(cadena);
		System.out.println(cadena.toUpperCase());
		System.out.println(cadena.substring(0, 1).toUpperCase());  // Esto es la primera letra en may�scula
		cadena = cadena.substring(0, 1).toUpperCase() + cadena.substring(1).toLowerCase();  // Capitalizar una cadena
		System.out.println(cadena);
		String cadena2="Esta es una cadena m�s larga que la Anterior";
		// Encontrar todas las 'a' de esta cadena
		for (int i = 0; i < cadena2.length(); i++) {
			if(cadena2.toLowerCase().charAt(i)=='a' || cadena2.toLowerCase().charAt(i)=='�') {
				System.out.println("Encontrada una 'a' en la posici�n: " + i);
			}
		}
		
	}
	
	// dada una cadena, pregunta al usuario la subcadena a buscar y mu�strale esa subcadena hasta el final
	// luego pregunta si quiere buscar la siguiente ocurrencia y mientras diga que s�, s�cale el resultado.
	public static void buscarSiguiente() {
		Scanner sc = new Scanner(System.in);
		String cadena="w Esta es una cadena m�s larga que la Anterior, hola adi�s hola hola";
		boolean salir = false;
		int posicionEncontrada = -1;
		// Pista: contains, indexOf, lastIndexOf
		System.out.println("Introduzca la cadena a buscar: ");
		String cadenaBuscada = sc.nextLine();
		while(!salir) {
			posicionEncontrada = cadena.toLowerCase().indexOf(cadenaBuscada.toLowerCase(), posicionEncontrada+1);
			if(posicionEncontrada!=-1) {  // Encuentro la cadena
				System.out.println(cadena.substring(posicionEncontrada));
				System.out.println("�Buscar siguiente? (s/n): ");
				String respuesta = sc.nextLine();
				if(respuesta.toLowerCase().equals("n")) {
					salir = true;
				}
			} else {
				System.out.println("No se encuentran m�s ocurrencias de la cadena");
				salir = true;
			}			
		}		
	}
	
	
	public static void main(String[] args) {
		//ejemplo1();
		//buscarLista();
		//reemplazarLista();
		//algunasOperacionesCadenas();
		buscarSiguiente();

	}

}
