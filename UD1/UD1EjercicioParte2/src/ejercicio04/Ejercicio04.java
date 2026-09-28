package ejercicio04;

import java.util.*;
public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("dame un numero real: ");

		double numero = sc.nextDouble();

		double inferior = Math.floor(numero);

		double superior = Math.ceil(numero);
		
		double redondeado  = Math.round(numero);

		System.out.println("El numero inferior es " + inferior + " , el numero superior es " + superior + " y el numero redondeado es " + redondeado);

	}

}
