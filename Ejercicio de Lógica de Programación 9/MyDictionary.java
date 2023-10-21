package dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyDictionary {
    public static void main(String[] args) {
        
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("mesa", "table");
        dictionary.put("verde", "green");
        dictionary.put("llave", "key");
        dictionary.put("bailar", "dance");
        dictionary.put("flores", "flowers");
        dictionary.put("tierra", "earth");
        dictionary.put("nieve", "snow");
        dictionary.put("guitarra", "guitar");
        dictionary.put("reloj", "watch");
        dictionary.put("comida", "food");
        dictionary.put("escuela", "school");
        dictionary.put("verano", "summer");
        dictionary.put("invierno", "winter");
        dictionary.put("viajar", "travel");
        dictionary.put("playa", "beach");
        dictionary.put("ciudad", "city");
        dictionary.put("montaña", "mountain");
        dictionary.put("lago", "lake");
        dictionary.put("hola", "hello");
        dictionary.put("casa", "house");
        dictionary.put("perro", "dog");
        dictionary.put("gato", "cat");
        dictionary.put("jugar", "play");
        dictionary.put("trabajar", "work");
        dictionary.put("ordenador", "computer");
        dictionary.put("familia", "family");
        dictionary.put("cielo", "sky");
        dictionary.put("coche", "car");
        dictionary.put("musica", "music");
        dictionary.put("pelicula", "movie");

        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario una palabra en español
        System.out.print("Introduce una palabra en español: ");
        String palabraEnEspanol = scanner.nextLine();

        // Buscar y mostrar la traducción en inglés
        String traduccion = dictionary.get(palabraEnEspanol);
        if (traduccion != null) {
            System.out.println(palabraEnEspanol + " en inglés es " + traduccion);
        } else {
            System.out.println("'" + palabraEnEspanol + "' no se encuentra en nuestro diccionario.");
        }

        scanner.close();
    }
}

