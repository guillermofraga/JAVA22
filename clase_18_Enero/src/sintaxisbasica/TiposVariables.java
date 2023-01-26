package sintaxisbasica;

public class TiposVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //comentario de una linea utilizamos doble barras
		/*
		 *  barra asterisco para más lineas
		 */
		
		//hay que declarar la variable ejemplo byte b1 = 0; ya que java no lo inicializa a ningun valor
		//Tipos de variables numéricas enteras:
		byte b1 = 0; //-128 to 127
		short s1; // -32.760 to 32.760
		int i1; // 4 bytes
		long l1; // 8 bytes
		
		
		//Tipos de variables numéricas reales (con decimales):
		float f1 = 9.4f; //un double ocupa el doble que un float la f se pone solo con float cuando son numeros decimales
		double d1;
		
		//Caracteres alfanuméricas
		char caracter = 'a'; //Char sirve para guardar un solo caracter
		char caracter1 = '4';
		
		
		//Booleanas solo guarda false or true
		boolean condicion = false;
		
		String cadena = "Me gusta java"; //String se diferencia de los demas porque empieza por mayuscula
		//String contiene funciones ya programadas
		
		
		//**************************** FIN TIPO VARIABLES ************************\\
		// Declaracion e Inicialización de variables
		
		int numero, numero2, numero3;
		numero = 1;  
		numero2 = 2;   
		
		float temp1 = 4.5f,temp2=9.6f,temp3=4.5f;
		double t1 = 5.678;
		
		
		//Valores > capacidad que int hay que añadir sufijo L
		long numeromuyalto = 90_000_000_000L;
		
		
		
		//Modificación de los valores de una variable:
		int x1 = 100;
		//sumar 1 a x1
		x1 = x1 + 1;
		x1 +=1;
		
		//Mandar mensaje por consola
		
		System.out.println("Hola Mundo");
		System.out.println();
		System.out.print("El valor de x1 es: " + x1 + " "); //p
		System.out.println("El valor de t1 es: " + t1);
		System.out.println();
		
		//si ponemos sysou y le damos a Ctrl + espacio nos coloca automaticamente = System.out.println();
		
		
		
		
		
	}

}
