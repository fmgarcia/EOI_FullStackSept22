package colecciones;

public class Arrays {
	
	
	public static void ejemplo1() {
		int a;
		String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"}; // Del 0 al 11
		int[] numeros = new int[5]; // de la posición 0 a la 4.
		// Asignación de valores a los elementos de un array
		numeros[0] = 3;
		numeros[1] = 4; 
		numeros[2] = 1; 
		numeros[3] = 4; 
		numeros[4] = 4; 
		int[] numeros2 = {4,7,8,9};
		//numeros[5] = 1; // Error
		System.out.println("La suma da: " + (numeros[1]+numeros[2]));
		//System.out.println("La suma da: " + numeros); // No tiene sentido
		
		//meses[0] = "Enero";
		System.out.println(meses[1]);
		System.out.println(meses[11]);
		for(int i=0;i<meses.length;i++) {  // recorro todos los meses
			System.out.println(meses[i] + " es el mes " + (i+1));
		}
		
		// No sé la posición
		for(String mes : meses) {
			System.out.println(mes);
		}
		
		int numeroMes = 1;
		for(String mes : meses) {
			System.out.println(mes + " es el mes " + numeroMes);
			numeroMes++;
		}
		
	}

	public static void main(String[] args) {
		ejemplo1();

	}

}
