package colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
		List<String> todosAlumnos = new ArrayList<String>(alumnosDam);
		todosAlumnos.addAll(alumnosEoi);
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
			System.out.println("Enero y Febrero existen en la lista");
		
	}
	
	
	public static void main(String[] args) {
		//ejemplo1();
		buscarLista();

	}

}
