package ejemplo5if;

public class Ejemplo5if {

	public static void main(String[] args) {
		Integer a = 1;
		Integer b = 5;
		Integer c = 6;

		Integer solu_raiz = b * b - 4 * a * c;

		if (solu_raiz > 0) {
			Double raiz = Math.sqrt(solu_raiz);

			Double solucion_posi = (-b + raiz) / (2 * a);

			Double solucion_nega = (-b - raiz) / (2 * a);
			
			System.out.println(solucion_posi);
			
			System.out.println(solucion_nega);

		} else {
			System.out.println("No tiene solucion");
		}

	}

}
