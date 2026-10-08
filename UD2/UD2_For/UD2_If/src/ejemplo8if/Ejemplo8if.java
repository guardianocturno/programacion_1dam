package ejemplo8if;
import java.util.*;
public class Ejemplo8if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Integer a=sc.nextInt();
		Integer b=sc.nextInt();

		Integer c=sc.nextInt();

		Boolean res = false;
		
		if (a+b==c || c+b==a || a+c==b ) {
		  res = true;
			
		}
		System.out.println(res);


	}

}
