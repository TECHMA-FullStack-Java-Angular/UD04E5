/* Ejercicio 5:
Programa Java que declare cuatro variables enteras A, B, C y D y asígnale un valor a cada una. A continuación, 
realiza las instrucciones necesarias para que:
	- B tome el valor de C;
	- C tome el valor de A;
	- A tome el valor de D;
	- D tome el valor de B.*/

public class Ej5 {
	public static void main(String args[]) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		
		//Imprimimos los valores iniciales
		System.out.println(" Variables iniciales: A= "+a+" B= "+b+" C = "+c+" D = "+d);
		
		//Realizamos el primer cambio e imprimimos el resultado del cambio
		b=c;
		System.out.println("   B toma valor de C: A= "+a+" B= "+b+" C = "+c+" D = "+d);
		
		//Realizamos el segundo cambio e imprimimos el resultado del cambio
		c=a;
		System.out.println("   C toma valor de A: A= "+a+" B= "+b+" C = "+c+" D = "+d);
		
		//Realizamos el tercer cambio e imprimimos el resultado del cambio
		a=d;
		System.out.println("   A toma valor de D: A= "+a+" B= "+b+" C = "+c+" D = "+d);

		//Realizamos el cuarto cambio e imprimimos el resultado final de los cambios
		d=b;
		System.out.println("   D toma valor de B: A= "+a+" B= "+b+" C = "+c+" D = "+d);

	}

}
