package ejercicio02;
import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce los segundos: ");
		int seg = sc.nextInt();
		
		int min=seg/60;
		int horas=seg/600;
		
		System.out.println("son " + horas + " horas");

		System.out.println("son " + min + " minutos");
		
		System.out.print("son " + seg + " seg");
		
	}
}
