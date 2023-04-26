public class Ejercicio10 {
    
    public static void main(String[] args) {
        double a = 2;
        double b = 4;
        double acumulador = 1;
        double resultado = 0;

        do {
            resultado = resultado + a*b/acumulador;
            acumulador++;
            System.out.println(resultado);
        } while (acumulador < 16);

        System.out.print(resultado);
    }
}
