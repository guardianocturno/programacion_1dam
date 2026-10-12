package ejercicio03;
import java.util.Scanner;
public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dame un numero: ");
		Integer N=sc.nextInt();
		Integer suma=0;
		Integer contador=1;
		do {
			suma+=contador;
			contador++;
		} while (contador<=N);
		
		System.out.println(suma);

	}

}
