package sentenciasRepeticion;
import java.util.*; 

public class ExplicacionDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Do While --> Muy utilizado para procesar entradas al programa
		//Solicitar al usuario un n�mero positivo:
		
			Scanner lector = new Scanner(System.in);
			int numero;
			do {
				System.out.println("Introduzca un n�mero positivo: ");
				numero = lector.nextInt();
				System.out.println("Numero introducido: " + numero);
			}
			while(numero<0);
	}

}
