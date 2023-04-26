import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double libras = 2.205;
        System.out.print("Ingrese un peso: ");
        double a = sc.nextDouble();
        sc.close();

        double conversor = a * libras;

        System.out.print(a + " kilos son " + conversor + " libras");

    }
}
