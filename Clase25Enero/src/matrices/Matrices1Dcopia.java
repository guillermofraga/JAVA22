package matrices;

public class Matrices1Dcopia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] original = {2,3,4,5,6};
		//Copiar estos valores a otro array:
		int [] copia = new int[original.length];
		
		//copia = original; Esto no hace una copia, simplemente redirige la referencia copia a
		/*  la misma zona de datos a la que apunta la original.
		 */
		
		for (int i = 0;i<original.length;i++ ) {
			copia[i] = original[i];
		}
		
		original = copia;
		
		System.out.println("Array original: ");
		for(int i = 0;i<original.length;i++) {
			System.out.println(original[i] + " ");
		}
		
	}

}
