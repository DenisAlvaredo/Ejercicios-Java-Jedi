import java.util.ArrayList;
import java.util.List;

public class Ejercicio6 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        for (int i=0; i<=50; i++){
            if (i % 2 == 0) {
                numeros.add(i);
            }
        }
        System.out.print(numeros);
    }
}

