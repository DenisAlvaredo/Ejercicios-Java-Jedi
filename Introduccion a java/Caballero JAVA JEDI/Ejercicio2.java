import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cantidad de dolares: ");
        int a = sc.nextInt();
        sc.close();
        final int conversor = a * 20;

        System.out.print(a + " dolares son " + conversor + " pesos");
    }
}
