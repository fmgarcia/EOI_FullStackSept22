package poo1;


//1. Crear los atributos de la clase
//2. Crear los constructores (vacio, todos los parámetros) 
//2.b. (opcional) Crear más constructores y el de copia
//3. Crear Getters and Setters
//4. Crear toString
//5. Crear hashCode and Equals
//6. (Opcional) métodos 

public class Coche {

	private String matricula;
	private String marca;
	private String modelo;
	private int anyo;
	private int kms;
	
	// Constructor vacío
	public Coche() {
		
	}

	
	// Constructor con todos los parámetros
	public Coche(String matricula, String marca, String modelo, int anyo, int kms) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.anyo = anyo;
		this.kms = kms;
	}


	public Coche(String matricula, String marca, String modelo) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}

	// Constructor copia
	public Coche(Coche c) {
		super();
		this.matricula = c.matricula;
		this.marca = c.marca;
		this.modelo = c.modelo;
		this.anyo = c.anyo;
		this.kms = c.kms;
	}


	// Generar Getters and Setters
	
	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getAnyo() {
		return anyo;
	}


	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}


	public int getKms() {
		return kms;
	}


	public void setKms(int kms) {
		this.kms = kms;
	}


	
	
	
	
	
	
	
}
