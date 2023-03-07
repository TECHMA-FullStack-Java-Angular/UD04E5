
public class Ej5 {
	public static void main(String args[]) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		
		System.out.println(" Variables iniciales: A= "+a+" B= "+b+" C = "+c+" D = "+d);
		
		b=c;
		System.out.println("   B toma valor de C: A= "+a+" B= "+b+" C = "+c+" D = "+d);
		
		c=a;
		System.out.println("   C toma valor de A: A= "+a+" B= "+b+" C = "+c+" D = "+d);
		
		a=d;
		System.out.println("   A toma valor de D: A= "+a+" B= "+b+" C = "+c+" D = "+d);

		d=b;
		System.out.println("   D toma valor de B: A= "+a+" B= "+b+" C = "+c+" D = "+d);

	}

}
