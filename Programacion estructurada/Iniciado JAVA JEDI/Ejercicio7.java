public class Ejercicio7 {
    public static void main(String[] args) {
        int matematica = 7;
        int lengua = 4;
        int informatica = 6;
        int ed_fisica = 9;
        double promedio = (matematica + lengua + informatica + ed_fisica) / 4;

        System.out.println("Notas: ");
        System.out.print("Matematica: " + matematica);
        System.out.print("Lengua: " + lengua);
        System.out.print("Informatica: " + informatica);
        System.out.print("Ed. Fisica: " + ed_fisica);
        
        if (promedio >= 6) {
            System.out.print("Aprobó con: " + promedio);
        } else {
            System.out.print("Reprobó con: " + promedio);
        }
    }
}
