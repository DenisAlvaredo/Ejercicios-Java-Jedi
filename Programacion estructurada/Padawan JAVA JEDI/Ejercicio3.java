public class Ejercicio3 {
    public static void main(String[] args) {
        int numero = 5;
        int factorial = 1;

        while (numero!=0) {
            factorial = factorial * numero;
            numero--;
        }
        System.out.println(factorial);
    }
}
