package tryDictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class TryDictionary {
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
        Random random = new Random();

       
        //String[] selectedWords = new String[5];
        int correctAnswers = 0;
        int incorrectAnswers = 0;

        System.out.println("Probemos tu nivel de inglés. Traduce las siguentes palabras:");
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            String randomWord = getRandomDictionaryWord(dictionary, random);
            System.out.print(randomWord + " en inglés es: ");
            String userAnswer = scanner.nextLine().toLowerCase();

            if (dictionary.containsKey(randomWord) && dictionary.get(randomWord).equalsIgnoreCase(userAnswer)) {
                System.out.println("¡Así se hace!");
                System.out.println("");
                correctAnswers++;
            } else {
                System.out.println("La respuesta correcta es: " + dictionary.get(randomWord));
                System.out.println("");
                incorrectAnswers++;
            }
        }
        if(correctAnswers > 3) {
        	System.out.println("Tuviste " + correctAnswers + " respuestas corrctas. ¡Felicidades! Eres bilingue.");
        }else {
			System.out.println("Tuviste " + incorrectAnswers + " respuestas incorrectas. ¡No te rindas, sigue practicando!");
		}

     

        scanner.close();
    }

    // Función para seleccionar aleatoriamente una palabra del diccionario
    public static String getRandomDictionaryWord(Map<String, String> dictionary, Random random) {
    	
        Object[] words = dictionary.keySet().toArray();
        return (String) words[random.nextInt(words.length)];
    }
}
