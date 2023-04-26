import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese primer numero: ");
        int a = sc.nextInt();
        System.out.print("Ingrese segundo numero: ");
        int b = sc.nextInt();
        sc.close();
        
        int c = a + b;
        
        String paridad = (c % 2 == 0)? "es par":"es impar";

        System.out.print("El resltado es " + c + " y " + paridad);
    }
}
