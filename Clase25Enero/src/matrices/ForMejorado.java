package matrices;

import java.util.Scanner;

public class ForMejorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []numeros = {9,8,4,5,1};
		
		/* Este for se utiliza cuando me interesa recorrer la matriz
		 * solo para leer.
		 */
		
		//Contar n�meros pares
		
		int contador = 0;
		for(int n : numeros) {
			if (n % 2 == 0) {
				contador++;
			}
		}
		System.out.println("Hay " + contador + " n�meros pares.");
		
		
		//sumar todos los valores del array
		
		int suma = 0;
		for(int n : numeros) {
			suma += n;
		}
		
		System.out.println("La suma es: " + suma);
		
		//Buscar un n�mero para saber si est� o no est�
		int numero;
		boolean encontrado = false;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce el n�mero que quieras buscar: ");
		numero = lector.nextInt();
		for(int n : numeros) {
			if (n == numero) {
				encontrado = true;
						System.out.println("Encontrado.");
				break;
			}
		}
		if(!encontrado) { // !encontrado es lo mismo que encontrado == false
			System.out.println("No encontrado.");
		}
		
		
		//Mostrar por pantalla los valores del array
		
		
	}

}
