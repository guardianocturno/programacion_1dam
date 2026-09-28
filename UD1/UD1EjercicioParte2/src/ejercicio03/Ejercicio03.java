package ejercicio03;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("dame el precio base: ");
		
		double precio_base = sc.nextInt();
		
		double descuento=precio_base-precio_base*15/100 ;
		
		double iva=descuento+descuento*21/100 ;

		double resultado = Math.round(iva * 100.0) / 100.0;

		
		
		System.out.println("El precio final es el siguiente : " + resultado);
	}

}
