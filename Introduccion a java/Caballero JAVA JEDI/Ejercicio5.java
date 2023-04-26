import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cantidad de pesos: ");
        int a = sc.nextInt();
        sc.close();
        final int conversor = a / 20;

        System.out.print(a + " pesos son " + conversor + " euros");
    }
}
