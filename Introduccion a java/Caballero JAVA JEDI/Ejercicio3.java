import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cantidad de euros: ");
        int a = sc.nextInt();
        sc.close();
        final double conversor = a * 1.20;

        System.out.print(a + " euros son " + conversor + " dolares");
    }
}
