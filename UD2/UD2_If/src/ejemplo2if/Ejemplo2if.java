package ejemplo2if;

public class Ejemplo2if {

	public static void main(String[] args) {
		Integer x = 2;
		Integer y = 12;
		Integer z = 15;

		if (x > y && x > z) {
			System.out.print("el numero mayor es " + x);
		} else if (x < y && y > z) {
			System.out.print("el numero mayor es " + y);
		} else if (x < y && y < z) {
			System.out.print("el numero mayor es " + z);
		}

	}

}
