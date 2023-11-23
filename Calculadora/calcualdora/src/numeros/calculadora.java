package numeros;

import java.util.Scanner;

public class calculadora {
	public static void main (String[] args) {
		double a=0, b=0, res=0;
		String sel=null;
		Scanner tec = new Scanner(System.in);
		System.out.println("Elija una opción\n");
		System.out.println(" +: Suma"
				+ "\n -: Resta"
				+ "\n x: Multiplicacion"
				+ "\n /: División");
		
		
		sel=tec.next();
		switch (sel) {
		case "+":
			System.out.println("Ha seleccionado suma");
			System.out.println("Ingrese el primer numero");
			a=tec.nextDouble();
			System.out.println("Ingrese el segundo numero");
			b=tec.nextDouble();
			res=a+b;
			System.out.println("El resultado es: "+ res);
			break;
		case "-":
			System.out.println("Ha seleccionado resta");
			System.out.println("Ingrese el primer numero");
			a=tec.nextDouble();
			System.out.println("Ingrese el segundo numero");
			b=tec.nextDouble();
			res=a-b;
			System.out.println("El resultado es: "+ res);
			break;
		case "x":
			System.out.println("Ha seleccionado multiplicación");
			System.out.println("Ingrese el primer numero");
			a=tec.nextDouble();
			System.out.println("Ingrese el segundo numero");
			b=tec.nextDouble();
			res=a*b;
			System.out.println("El resultado es: "+ res);
			break;
		case "/":
			System.out.println("Ha seleccionado división");
			System.out.println("Ingrese el primer numero");
			a=tec.nextDouble();
			System.out.println("Ingrese el segundo numero");
			b=tec.nextDouble();
			res=a/b;
			System.out.println("El resultado es: "+ res);
			break;
		default:
			System.out.println("Ha seleccionado una opción incorrecta");
			break;
		}
		
	}
}
