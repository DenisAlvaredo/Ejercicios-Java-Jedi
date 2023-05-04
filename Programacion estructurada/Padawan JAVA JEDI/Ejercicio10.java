import java.util.ArrayList;
import java.util.List;

public class Ejercicio10 {
    public static void main(String[] args) {
        List<String> equipos = new ArrayList<>(); 
        List<String> entrenadores = new ArrayList<>(); 
        List<String> jugadores1 = new ArrayList<>(); 
        List<String> jugadores2 = new ArrayList<>(); 

        equipos.add("Boca");
        equipos.add("River");

        entrenadores.add("Mariano Herrón");
        entrenadores.add("Martín Demichelis");

        jugadores1.add("Sergio Romero");
        jugadores1.add("Nicolás Figal");
        jugadores1.add("Nicolás Figal");
        jugadores1.add("Gabriel Aranda");
        jugadores1.add("Agustín Sández");
        jugadores1.add("Marcelo Weigandt");
        jugadores1.add("Cristian Medina");
        jugadores1.add("Martín Payero");
        jugadores1.add("Sebastián Villa");
        jugadores1.add("Norberto Briasco");
        jugadores1.add("Jan Hurtado");

        jugadores2.add("Ezequiel Centurión");
        jugadores2.add("Emanuel Mammana");
        jugadores2.add("Robert Rojas");
        jugadores2.add("Leandro González Pírez");
        jugadores2.add("Enzo Díaz");
        jugadores2.add("Andrés Herrera");
        jugadores2.add("Enzo Pérez");
        jugadores2.add("Tomás Castro Ponce");
        jugadores2.add("Esequiel Barco");
        jugadores2.add("Santiago Simón");
        jugadores2.add("Miguel Borja");

        for(int i=0; i<equipos.size(); i++){
            System.out.println("Equipo: " + equipos.get(i));
            System.out.println("Entrenador: " + entrenadores.get(i));
            if(i==0) {
                for(String jugador: jugadores1){
                    System.out.println("Jugador: " + jugador);
                }
            } else {
                for(String jugador: jugadores2){
                    System.out.println("Jugador: " + jugador);
                }
            }
        }
    }
}