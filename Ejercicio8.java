import java.util.Scanner;

public class Ejercicio8{


	public static void main(String [] args){


	int numAleatorio;
	int opcion = 0;
	int mcinco;


		Scanner sc = new Scanner(System.in);
	
		do{

				// generar numero aleatorio entre 1 y 100
				numAleatorio = (int) ( Math.random() * (100- 1 ) + 1);
				mcinco= numAleatorio*5;
				System.out.println("\nNumero aleatorio multiplo de 5: "+mcinco);

				
				System.out.println("\nIngresa cualquier numero para continuar y 5 para detener");
				opcion = sc.nextInt();

	
			} while (opcion != 5); {
				
			}

		
				

	
		
	



	}


} 