package ejercicio08;

import java.util.*;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime el numero de producto: ");
		
		int prod = sc.nextInt();
		
		System.out.print("Dime la capacidad de las cajas donde se almacena el producto: ");
		
		int cap = sc.nextInt();
		
		double Ncajas = (double) prod/cap;
		
		double superior = Math.ceil(Ncajas);
		
		System.out.print("El numero de cajas necesarias es " + (int) superior);



	}

}
