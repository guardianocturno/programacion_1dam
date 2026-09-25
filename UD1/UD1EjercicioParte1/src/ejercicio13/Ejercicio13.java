package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Está lloviendo? (true/false): ");
        boolean llueve = sc.nextBoolean();

        System.out.print("¿Has terminado las tareas? (true/false): ");
        boolean tareasTerminadas = sc.nextBoolean();

        System.out.print("¿Necesitas ir a la biblioteca? (true/false): ");
        boolean biblioteca = sc.nextBoolean();

        boolean puedeSalir = (!llueve && tareasTerminadas) || biblioteca;

        System.out.println(puedeSalir);
    }
}
