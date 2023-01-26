package matrices;

import java.util.Arrays;
import java.util.Random;

public class ClasesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros[] = new int[10];
		//Llenar el array con n�meros aleatorios
		Random aleatorio = new Random();
		
		for(int i = 0; i<numeros.length;i++) {
			numeros[i] = aleatorio.nextInt(10);
		}
		
		
		//La clase array contiene m�todos �tiles para trabajar con matrices
		//Printar por pantalla todo el array
		
		System.out.println(Arrays.toString(numeros));
		
		//Ordenar de menor a mayor los elementos del array
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
		
		//copiar los valores de un array en otro array
		int [] copia = Arrays.copyOf(numeros, numeros.length);
		
		
		//Buscar un valor en un array ordenado --> BinarySearch
		int valorbuscado = 1;
		int posicion = Arrays.binarySearch(numeros, valorbuscado);
		System.out.println(valorbuscado + " posicion: " + posicion);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
