import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese masa del objeto: ");
        double m = sc.nextDouble();
        System.out.print("Ingrese radio de la trayectoria: ");
        double r = sc.nextDouble();
        System.out.print("Ingrese velocidad angular: ");
        double v = sc.nextDouble();
        sc.close();

        double f_c = m * Math.pow(v, 2) / r;

        System.out.print("La fuerza centripeda es de: " + f_c);
    }
}
