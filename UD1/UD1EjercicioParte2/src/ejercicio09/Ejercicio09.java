package ejercicio09;

import java.util.*;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime el numero de litros: ");
		
		int L = sc.nextInt();
		
		System.out.print("Dime la capacidad de las botellas donde se almacena el agua: ");
		
		int botellas = sc.nextInt();
		
		double Nbotella = (double) L/botellas;
				
		System.out.print("El numero de botellas las cuales de pueden llenar enteras serian " + (int) Math.floor(Nbotella));

	}

}
