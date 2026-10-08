package ejercicio08;
import java.util.*;
public class Ejercicio08 {

	public static void main(String[] args) {
		/*Realiza un programa que pida dos números enteros A y B. Luego visualiza los números que hay entre A y B. 
		 * Si A es menor que B, entonces debe mostrar los números desde A hasta B. Si B es menor que A, 
		 * entonces debe mostrar los números desde B hasta A.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		Integer a = sc.nextInt();
		Integer b = sc.nextInt();
		
		if (a < b) {
			
			for(int i=a;i<=b;i++) {
				System.out.println(i);
			}
			
		}else if (a>b) {
			for(int i=b;i<=a;i++) {
				System.out.println(i);
			}
		}else {
			System.out.println(a);
		}

		
		sc.close();
	}

}
