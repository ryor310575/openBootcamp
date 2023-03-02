package openBootcamp;


public class fundamentos {

	public static void main(String[] args) {
		
	int suma;
	//Llamado a la funcion suma para sumar tres numeros
	suma=sumaTres(4,5,8);
	System.out.println(suma);
	Coche miCoche=new Coche(3);
	System.out.println("El coche tiene "+miCoche.damePuertas()+" puertas");
	miCoche.incrementaPuertas(1);
	System.out.println("El coche tiene "+miCoche.damePuertas()+" puertas");
	}
	/*
	 * Funcion de suma de tres numeros
	 */
	public static int sumaTres(int a, int b, int c) {
		return a+b+c;
	}
	

}
/*
 * Clase Coche
 */
class Coche{
	//Variable con la cantidad de puertas
	private int cantidadPuertas;
	//Constructor que inicializa la variable cantidadPuertas
	public Coche(int puertas) {
		cantidadPuertas=puertas;
	}
	//Metodo que incrementa la cantidad de puertas
	public void  incrementaPuertas(int puertas) {
		cantidadPuertas=cantidadPuertas+puertas;
	}
	//Metodo que devuelve la cantidad de puertas.
	public int damePuertas() {
		return cantidadPuertas;
	}
		
	}


