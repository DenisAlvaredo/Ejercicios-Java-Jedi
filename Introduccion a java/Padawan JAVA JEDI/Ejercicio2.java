import java.util.Scanner;

public class Ejercicio12 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int a = sc.nextInt();
        int contador = 0;
        sc.close();

        do {
            a--;
            contador++;
        } while (contador < 20);
        System.out.print(a);
    }
}
