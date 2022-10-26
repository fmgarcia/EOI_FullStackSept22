package poo1;

import java.time.LocalDate;

public class Prueba {
	
	public static void ejemploPersonas() {
		Persona vacia = new Persona();  // Llama al constructor sin parámetros
		Persona fran = new Persona("Fran","García","111X","666-666-666",LocalDate.parse("1976-07-27"));
		Persona dani = new Persona("Dani","García","222X","666-666-667",LocalDate.of(1979, 3, 26));

		System.out.println(fran);  // Llama al método toString
		
		vacia.setNombre("Consuelo");
		vacia.setApellido("López");
		
		//System.out.println(vacia);
		System.out.println("Nombre de vacia: " + vacia.getNombre());
		System.out.println("Apellido de vacia: " + vacia.getApellido());
	}
	
	public static void ejemplosCoches() {
		
		Coche vacio = new Coche();  // crea un coche usando el constructor vacio
		Coche todosParametros = new Coche("0000AAA", "Seat", "Panda", 1990, 80000);
		Coche tresParametros = new Coche("1111BBB","BMW", "Z3");
		Coche copia = new Coche(todosParametros);  // usa el constructor de copia
		
		System.out.println(todosParametros.getMatricula());  // Uso del get 0000AAA
		todosParametros.setMatricula("1234ABC");  // Uso del set, le cambio la matrícula
		System.out.println(todosParametros.getMatricula());  // 1234ABC
		System.out.println(copia.getMatricula());  // 0000AAA
		tresParametros.setMatricula("3456DFGaaaaaaaaaaaa");
		System.out.println(tresParametros.getMatricula());
		tresParametros.setMatricula("1111BBBaaaaaaaaaaaabbbbbbbbb");
		System.out.println(tresParametros.getMatricula());
		todosParametros.setKms(-40000);
		System.out.println(todosParametros.getKms());
		System.out.println(todosParametros);  // Llama al toString del coche
		if(todosParametros.equals(tresParametros)) { // comprueba si son el mismo coche por el criterio que hayamos puesto en el equals
			System.out.println("son el mismo coche");
		}else {
			System.out.println("Son coches distintos");
		}
		todosParametros.setMatricula("1111BBB");
		if(todosParametros.equals(tresParametros)) { // comprueba si son el mismo coche por el criterio que hayamos puesto en el equals
			System.out.println("son el mismo coche");
		}else {
			System.out.println("Son coches distintos");
		}
		
	}

	public static void main(String[] args) {
		
		//ejemploPersonas();
		ejemplosCoches();
		
	}

}
