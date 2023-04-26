import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cantidad de libras: ");
        int a = sc.nextInt();
        sc.close();
        final double conversor = a * 1.40;

        System.out.print(a + " libras son " + conversor + " dolares");
    }
}
