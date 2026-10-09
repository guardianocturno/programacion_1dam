package ejercicio3;
import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double numero=0.0;
		
		for (int i=1;i<=10;i++) {
			System.out.print("dame un numero: ");
			 int numero2 = sc.nextInt();
			 
			 numero+=numero2;
		}
		double media=numero/10;
		
		System.out.println(numero);

		System.out.print(media);

		
		

	}

}
