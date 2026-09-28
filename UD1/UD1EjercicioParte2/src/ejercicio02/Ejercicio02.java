package ejercicio02;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cantidad de segundos: ");
        int segundosTotales = sc.nextInt();

        int horas = segundosTotales / 3600;
        int minutos = (segundosTotales % 3600) / 60;
        int segundos = segundosTotales % 60;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);

        sc.close();
    }
}