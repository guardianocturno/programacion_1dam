package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce la base del rectangulo: ");
		double  b = sc.nextDouble();

		System.out.print("Introduce la altura del rectangulo: ");
		double  a = sc.nextDouble();

		System.out.println("El area es: " + b * a);
		System.out.println("El perimetro es: " + (b * 2 + a * 2));
	}
}
