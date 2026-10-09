package ejercicio2;
import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("dame un numero: ");
		int n = sc.nextInt();
		int n2=0;
		for ( int i=0; i<=n;i+=3) {
			 n2 ++;
		}
		System.out.println(n2);
		
		sc.close();
	}

}
