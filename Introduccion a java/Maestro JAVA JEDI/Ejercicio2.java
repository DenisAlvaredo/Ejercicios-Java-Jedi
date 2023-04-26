import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese grados celsius: ");
        int c = sc.nextInt();
        sc.close();
        double f = (c * 1.8) + 32;

        System.out.print(c +"°C son " + f + "°F");
    }
}
