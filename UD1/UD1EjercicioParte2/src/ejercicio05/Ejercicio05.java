package ejercicio05;

import java.util.*;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("dame un numero real: ");

		double numero = sc.nextDouble();

		double absoluto = Math.abs(numero);
		double raiz = Math.sqrt(numero);

		System.out.println("Valor absoluto: " + absoluto);
		System.out.println("Raíz cuadrada: " + raiz);
	}

}
