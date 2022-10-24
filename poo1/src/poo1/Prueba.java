package poo1;

import java.time.LocalDate;

public class Prueba {

	public static void main(String[] args) {
		
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

}
