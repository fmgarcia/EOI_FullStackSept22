package poo1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalUnit;
import java.util.Objects;


// 1. Crear los atributos de la clase
// 2. Crear los constructores (vacio, todos los parámetros) 
// 2.b. (opcional) Crear más constructores y el de copia
// 3. Crear Getters and Setters
// 4. Crear toString
// 5. Crear hashCode and Equals
// 6. (Opcional) métodos adicionales

public class Persona {
	
	// Atributos de la clase (propiedades)
	String nombre;
	String apellido;
	String dni;
	String telefono;
	LocalDate fechaNacimiento;
	
	// Constructores
	public Persona() {
		
	}

	public Persona(String nombre, String apellido, String dni, String telefono, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
	}
	

	// Getters and Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	// toString()
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", telefono=" + telefono
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni);
	}
	
	public boolean esMayorEdad() {		
		//LocalDate edad = LocalDate.now()-this.fechaNacimiento;  // No se puede
		//Duration edad = Duration.between(this.fechaNacimiento, LocalDate.now());  // Si quiero segundos o minutos
		Period edad = Period.between(this.fechaNacimiento, LocalDate.now());  // Quiero años, meses o días
		int anyos = Math.abs(edad.getYears());
		if(anyos>=18)
			return true;
		else
			return false;
		
	}
	
}
