import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int a = sc.nextInt();
        sc.close();

        if (a < 0) {
            System.out.print("Es negativo");
        } else if (a > 0) {
            System.out.print("Es positivo");
        } else {
            System.out.print("Es cero");
        }
    }
}
