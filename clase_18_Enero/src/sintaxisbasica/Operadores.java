package sintaxisbasica;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//operadores: S�mbolos que realizan alguna funci�n
		//Matem�ticos: +,-,*,/,%    Binarios                 % = mod de visual
		//Asignaci�n: = , +=,-=,*=,/=                      el valor = coge el valor de la derecha y se lo asigna a la variable que esta a la izquierda
		//Operadores ++ y --
		
		int x = 5,y = 9;
		int resultado = x + y;
		
		float resultadodivision = (float)x/y;
		
		System.out.println("Resultado x/y = " + resultadodivision);
		
		byte c1 = 125,c2 = 4,resultadobyte;
		resultadobyte = (byte)(c1 + c2);
		System.out.println("c1 + c2 = " + resultadobyte);
		
		//Operadores +=, -=
		int r = 10;
		r = r +10;
		r+=10;
		
		//Operadores ++ y -- le suma 1 a la variable sobre la que act�an
		int o1 = 10;
		int o2 = o1++;
		//o2++;
		//++o2;
		System.out.println("o2 " + o2);
		System.out.println("o1 " + o1);
		
		//Operadores relacionales < , <= , > , >= , == , !=
		
		boolean condicion1 = o1>10;
		boolean condicion2 = o1!=10; //Si es diferente de 
		
		
		//Operadores l�gicos:
		// Y L�gico : && --> Devuelve true si las dos condiciones son true
		
		boolean c3 = o1>10 && o1 % 2 == 0;
		
		// O L�gico : || --> Devuelve true si una de las condiciones es true
		
		boolean c4 = o1>10 || o1 % 2 == 0;
		
		
		//No L�gico : ! --> Niega la condicion que va despu�s
		
		boolean c5 = !c4;
		

	}

}
