import java.util.HashMap;
import java.util.Map;

public class Ejercicio7 {
    public static void main(String[] args) {
        Map<String, Integer> personasyEdades = new HashMap<String, Integer>();

        personasyEdades.put("Juan", 25);
        personasyEdades.put("Roberto", 12);
        personasyEdades.put("Laura", 29);
        personasyEdades.put("Carlos", 16);
        personasyEdades.put("Miguel", 19);
        personasyEdades.put("Maria", 44);

        for(Map.Entry<String, Integer> persona: personasyEdades.entrySet()) {
            if (persona.getValue() >= 18){
                System.out.println("Nombre: " + persona.getKey() + ", Edad: " + persona.getValue());
            }
        }
    }
}
