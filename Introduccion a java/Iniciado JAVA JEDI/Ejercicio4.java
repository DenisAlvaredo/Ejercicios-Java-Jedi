import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese primer numero: ");
        int a = sc.nextInt();
        System.out.print("Ingrese segundo numero: ");
        int b = sc.nextInt();
        sc.close();
        
        int c = a + b;
        
        String divisible = (a % b == 0)? " es divisible por ":" no es divisible por ";

        System.out.print("El resltado es " + c + ".Y " + a + divisible + b);
    }
}