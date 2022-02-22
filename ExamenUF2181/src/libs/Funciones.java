package libs;

/**
 * 
 * @author Fernando Caravaca Carretero
 *
 */

public class Funciones {
	
	
	/**
	 * Función que pide tres números por teclado para comprobar cual de los tres
	 * números es el que está en medio.
	 * 
	 * @param num1 int primer número
	 * @param num2 int segundo número
	 * @param num3 int tercer número
	 * @return enMedio int valor del número que se encuentra en medio de los tres
	 */
	public int devuelveCentral(int num1, int num2, int num3) {
		
		int enMedio;
		
		if ((num1>num2) && (num1<num3)) {
			enMedio=num1;
		}  else if  ((num2>num1) && (num2<num3)) {
			enMedio= num2;
		} else {
			enMedio = num3;
		}
		return enMedio;
	}
	
	/**
	 * Función que comprueba si un año introducido es o no bisiesto a través de Verdadero(True) o Falso(False). 
	 * 
	 * @param año int año que se comprobará si es bisiesto
	 * @return biesiesto boolean (True -> Si el año es bisiesto | False -> Si el año no es bisiesto)
	 */
	public boolean esBisiesto(int año) {
		boolean bisiesto = false;
		
		if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0)))
			bisiesto = true;
		else
			bisiesto = false;

		return bisiesto;
	}
	
	/**
	 * Función que comprueba si un vector es capicua, inicializando una variable j al tamaño del (vector - 1) para así ir
	 * recorriendo el vector que hemos introducido entre 2 y comprobando después si el principio del vector y el final cumplen los mismos valores.
	 * 
	 * @param v int[] vector que introducimos para comprobar que es capicua
	 * @return capicua boolean (True -> Si el vector es capicua | False -> Si el vector no es capicua)
	 */
	public boolean esCapicua(int v[]) {
		boolean capicua = true;
		
		for (int i=0, j=v.length-1; i<v.length/2; i++,j--) {
			if (v[i]!=v[j]) {
				capicua=false;
			}
		}
		return capicua;
	}

	
	/**
	 * Función que suma dos vectores. Recibe dos vectores, crea un parámetro vector_suma que será el que
	 * almacene la suma de ambos vectores. La suma la calcula recorriendo un bucle for tantas veces como
	 * valores puedan almacenar los vectores(tamaño del vector suma). Es por esto que si uno de los vectores no tienen el mismo tamaño
	 * debe saltar una excepción ya que no podría recorrerse el bucle para sumar los vectores.
	 * 
	 * @param v int [] primer vector
	 * @param v2 int [] segundo vector
	 * @return vector_suma int [] vector suma El parámetro que devuelve es la suma del primer y segundo vector
	 * @throws ArithmeticException Lanza esta excepción si los tamaños de los vectores no es el mismo.
	 */
	public int [] suma_vectores(int v[], int v2[]) {
		int vector_suma [] = new int[v.length];
		
		if (v.length!=v2.length) 
		   throw new ArithmeticException("Los vectores deben tener el mismo tamaño");
		
		for (int i = 0; i < vector_suma.length; i++) {
			vector_suma[i]=v[i]+v2[i];
		}
		return vector_suma;
	}
	
	
}
