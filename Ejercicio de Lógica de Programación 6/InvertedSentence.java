package invertedSentence;
import java.util.Scanner;

public class InvertedSentence {
	
	public static void main(String[] args) {
		
		//Declaro mi variable para guardar la frase
		String phrase;
		//Variables para mi ciclo
		int phraseIterator, phraseInvertedIterator;
		
		
		//Perdirle al usuario que ingrese la frase, utilizando la consola.
		Scanner read = new Scanner(System.in);
		System.out.println("Please, write a phrase: ");
		phrase = read.nextLine();
		read.close();
		
		//System.out.println(phrase.length());
		
		//Ya que tengo mi frase, necesito saber su lingitud para asignarséla a mi nuevo array
		char[] invertedPhrase = new char[phrase.length()]; //En este caso genero un array de caracteres, donde se almacenará mi frase invertida
		
		
		//Ciclo para iterar en  mi frase y en el array donde guardaré la frase invertida
		for(phraseIterator = phrase.length()-1, phraseInvertedIterator = 0 ; phraseIterator >= 0; phraseIterator--, phraseInvertedIterator++) {
			
			//En mi array de caracteres guarda en la posción del iterador, el caracter que se encuentra en en el índice del interardor dentro de mi frase original
			invertedPhrase[phraseInvertedIterator] = phrase.charAt(phraseIterator);
					
		}
		
		//Para imprimir mi nuevo array utilizamos un forEach
		System.out.print(phrase + " inverted is: ");
		//por cada caracter que tengo en mi array de la frase invertida, guárdalo en una variable llamada "caracter" e imprímela.
		for(char caracter : invertedPhrase) {
			System.out.print(caracter);
		}
			
		
	}

}













