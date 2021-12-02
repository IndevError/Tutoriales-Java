//Libreria
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    String Palabra;
		Scanner teclado = new Scanner(System.in);
		
		//Obtenemos la palabra
		System.out.println("Ingresa una palabra:");
		Palabra = teclado.nextLine();
		
		//Se Eliminan los espacios de la palabra
		Palabra = Palabra.replaceAll("\\s+", "");
		
		//Imprimimos la palabra sin espacios
		System.out.println("\n--> "+Palabra);
	}
}
