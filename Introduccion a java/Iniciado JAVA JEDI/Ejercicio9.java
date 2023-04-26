import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        double a = sc.nextInt();
        double cuadrado = Math.pow(a, 2);
        double cubo = Math.pow(a, 3);
        sc.close();

        System.out.print(a + " al cuadrado es: " + cuadrado + ".\nY " + a + " al cubo es: " + cubo);
    }
}
