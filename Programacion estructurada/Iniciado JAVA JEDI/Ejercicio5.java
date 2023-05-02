public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9};
        int total = 0;

        for(int num: numeros) {
            total = total + num;
        }
        System.out.println(total);
    }
}
