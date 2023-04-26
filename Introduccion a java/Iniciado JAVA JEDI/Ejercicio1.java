import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese primer numero para sumar: ");
        int a = sc.nextInt();
        
        System.out.print("Ingrese segundo numero para sumar: ");
        int b = sc.nextInt();
        sc.close();
        
        int c = a + b;

        System.out.print("El resutlado es: " + c);
    }
}
