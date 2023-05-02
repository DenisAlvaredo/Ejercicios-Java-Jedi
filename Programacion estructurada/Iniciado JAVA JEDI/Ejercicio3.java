import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int a = sc.nextInt();
        sc.close();

        if (a % 2==0) {
            System.out.print("Es par");
        } else {
            System.out.print("Es impar");
        }
    }
}
