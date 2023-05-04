public class Ejercicio4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 20;
        int impares = 0;

        while (a <= b) {
            if (a % 2 != 0){
                impares += a;
            }
            a++;
        }

        System.out.print(impares);
    }
}
