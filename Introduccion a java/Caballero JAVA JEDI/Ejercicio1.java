import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        double a = sc.nextInt();
        System.out.print("Ingrese otro numero: ");
        int bint = sc.nextInt();
        sc.close();

        final double porcentaje = bint * 100 / a;

        System.out.print(porcentaje);
    }
}
