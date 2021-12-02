//Libreria
import java.util.Scanner;
import java.text.Normalizer;

public class Main
{
	public static void main(String[] args) {
	    String Palabra;
		Scanner teclado = new Scanner(System.in);
		
		//Obtenemos la palabra
		System.out.println("Ingresa una palabra:");
		Palabra = teclado.nextLine();
		
		//Se eliminan los acentos de la palabra
        Palabra = Normalizer.normalize(Palabra, Normalizer.Form.NFD);
		Palabra = Palabra.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");

		//Imprimimos la palabra sin acentos
		System.out.println("\n--> "+Palabra);
	}
}