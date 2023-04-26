import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese velocidad inicial: ");
        double v_i = sc.nextDouble();
        System.out.print("Ingrese aceleracion de la gravedad: ");
        double g = sc.nextDouble();
        System.out.print("Ingrese tiempo transcurrido: ");
        double t = sc.nextDouble();
        sc.close();

        final double v_f = v_i + g * t;

        System.out.println("La velocidad final es de: " + v_f);
    }
}
