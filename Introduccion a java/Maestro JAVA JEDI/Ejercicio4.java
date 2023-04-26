import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese numero total del conjunto: ");
        final int cantconjunto = sc.nextInt();
        int nroconjunto = 0;
        int total = 0;
        for (int i = 0; i < cantconjunto; i++){
            System.out.print("Ingrese un numero: ");
            nroconjunto = sc.nextInt();
            total = total+nroconjunto;
        }
        final int media = total/cantconjunto;
        sc.close();
        System.out.print("la media es: " + media);
    }
}
