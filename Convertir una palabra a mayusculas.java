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
		
		//Se cambia toda la palabra a mayusculas
        Palabra = Palabra.toUpperCase();

		//Imprimimos la palabra en mayusculas
		System.out.println("\n--> "+Palabra);
	}
}
