package libs;

/**
 * 
 * @author Fernando Caravaca Carretero
 *
 */

public class Funciones {
	
	
	/**
	 * Funci�n que pide tres n�meros por teclado para comprobar cual de los tres
	 * n�meros es el que est� en medio.
	 * 
	 * @param num1 int primer n�mero
	 * @param num2 int segundo n�mero
	 * @param num3 int tercer n�mero
	 * @return enMedio int valor del n�mero que se encuentra en medio de los tres
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
	 * Funci�n que comprueba si un a�o introducido es o no bisiesto a trav�s de Verdadero(True) o Falso(False). 
	 * 
	 * @param a�o int a�o que se comprobar� si es bisiesto
	 * @return biesiesto boolean (True -> Si el a�o es bisiesto | False -> Si el a�o no es bisiesto)
	 */
	public boolean esBisiesto(int a�o) {
		boolean bisiesto = false;
		
		if ((a�o % 4 == 0) && ((a�o % 100 != 0) || (a�o % 400 == 0)))
			bisiesto = true;
		else
			bisiesto = false;

		return bisiesto;
	}
	
	/**
	 * Funci�n que comprueba si un vector es capicua, inicializando una variable j al tama�o del (vector - 1) para as� ir
	 * recorriendo el vector que hemos introducido entre 2 y comprobando despu�s si el principio del vector y el final cumplen los mismos valores.
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
	 * Funci�n que suma dos vectores. Recibe dos vectores, crea un par�metro vector_suma que ser� el que
	 * almacene la suma de ambos vectores. La suma la calcula recorriendo un bucle for tantas veces como
	 * valores puedan almacenar los vectores(tama�o del vector suma). Es por esto que si uno de los vectores no tienen el mismo tama�o
	 * debe saltar una excepci�n ya que no podr�a recorrerse el bucle para sumar los vectores.
	 * 
	 * @param v int [] primer vector
	 * @param v2 int [] segundo vector
	 * @return vector_suma int [] vector suma El par�metro que devuelve es la suma del primer y segundo vector
	 * @throws ArithmeticException Lanza esta excepci�n si los tama�os de los vectores no es el mismo.
	 */
	public int [] suma_vectores(int v[], int v2[]) {
		int vector_suma [] = new int[v.length];
		
		if (v.length!=v2.length) 
		   throw new ArithmeticException("Los vectores deben tener el mismo tama�o");
		
		for (int i = 0; i < vector_suma.length; i++) {
			vector_suma[i]=v[i]+v2[i];
		}
		return vector_suma;
	}
	
	
}
