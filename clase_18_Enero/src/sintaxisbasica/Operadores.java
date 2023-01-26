package sintaxisbasica;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//operadores: Símbolos que realizan alguna función
		//Matemáticos: +,-,*,/,%    Binarios                 % = mod de visual
		//Asignación: = , +=,-=,*=,/=                      el valor = coge el valor de la derecha y se lo asigna a la variable que esta a la izquierda
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
		
		//Operadores ++ y -- le suma 1 a la variable sobre la que actúan
		int o1 = 10;
		int o2 = o1++;
		//o2++;
		//++o2;
		System.out.println("o2 " + o2);
		System.out.println("o1 " + o1);
		
		//Operadores relacionales < , <= , > , >= , == , !=
		
		boolean condicion1 = o1>10;
		boolean condicion2 = o1!=10; //Si es diferente de 
		
		
		//Operadores lógicos:
		// Y Lógico : && --> Devuelve true si las dos condiciones son true
		
		boolean c3 = o1>10 && o1 % 2 == 0;
		
		// O Lógico : || --> Devuelve true si una de las condiciones es true
		
		boolean c4 = o1>10 || o1 % 2 == 0;
		
		
		//No Lógico : ! --> Niega la condicion que va después
		
		boolean c5 = !c4;
		

	}

}
