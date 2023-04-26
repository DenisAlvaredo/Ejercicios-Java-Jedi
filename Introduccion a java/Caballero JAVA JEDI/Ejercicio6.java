import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cantidad de bitcoins: ");
        double a = sc.nextDouble();
        sc.close();
        final double conversor = a * 50000;

        System.out.print(a + " bitcoins son " + conversor + " dolares");
    }
}
