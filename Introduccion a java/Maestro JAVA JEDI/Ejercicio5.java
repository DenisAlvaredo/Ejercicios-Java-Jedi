import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa masa de un objeto: ");
        double m = sc.nextDouble();
        System.out.print("Ingresa velocidad de un objeto: ");
        double v = sc.nextDouble();
        sc.close();

        double e = (m * Math.pow(v, 2)) / 2;

        System.out.print("La energia cinetica es de " + e + "j");
    }
}
