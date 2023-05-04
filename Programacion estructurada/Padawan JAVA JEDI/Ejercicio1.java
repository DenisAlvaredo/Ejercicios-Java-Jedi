public class Ejercicio1 {
    public static void main(String[] args) {
        int numeroWhile = 1;
        int numeroDo = 1;

        while (numeroWhile <= 50) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println(numeroDo);
            numeroDo++;
        } while (numeroDo <= 50);
    }
}
