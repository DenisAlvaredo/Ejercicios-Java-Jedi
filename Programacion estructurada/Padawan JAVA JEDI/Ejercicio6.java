import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        int a = sc.nextInt();
        sc.close();

        for(int i=0;i<=a;i++){
            x = x + i;
        }
        
        System.out.println(x);
    }
}
