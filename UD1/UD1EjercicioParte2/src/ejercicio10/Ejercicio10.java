package ejercicio10;

import java.util.*;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame un año: ");
		
		int año = sc.nextInt();
		
		boolean resultado = año % 400 == 0 || año % 4 == 0 && año % 100 != 0;
		
		System.out.print("¿Tu año es bisiesto?:------> " + resultado);
	}

}
