package ejemplo3if;

public class Ejemplo3 {

	public static void main(String[] args) {
		Integer a = 2000;
		Integer mes = 2;
		Integer dias = null;

		if (mes != 2) {

			if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				dias = 30;
			} else {
				dias = 31;
			}

		} else {
			if (a % 400 == 0 || a % 4 == 0 && a % 100 != 0) {
				dias = 29;
			} else {
				dias = 28;
			}
		}

		System.out.println("El mes " + mes + " del año " + a + " tiene " + dias + " dias");
	}

}
