package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cantidad de dinero: ");
        double dinero = sc.nextDouble();

        int euros = (int) dinero;
        int centimos = (int) Math.round((dinero - euros) * 100);

        if (centimos == 100) {
            euros++;
            centimos = 0;
        }

        System.out.println("Euros: " + euros);
        System.out.println("Céntimos: " + centimos);
    }
}
