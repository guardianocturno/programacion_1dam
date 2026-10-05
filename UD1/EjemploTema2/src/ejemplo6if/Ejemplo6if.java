package ejemplo6if;

// 99999
public class Ejemplo6if {

	public static void main(String[] args) {

		Integer numero=504;
		
		if (numero<10) {
			System.out.println("el numero tiene 1 cifra");
		}else if (numero<100) {
			System.out.println("el numero tiene 2 cifra");
		}else if (numero<1000) {
			System.out.println("el numero tiene 3 cifra");
		}else if (numero<10000) {
			System.out.println("el numero tiene 4 cifra");
		}else if (numero<100000) {
			System.out.println("el numero tiene 5 cifra");
		}
		
	}

}
