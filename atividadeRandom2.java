package Vetor;
import java.util.ArrayList;
import java.util.Random;

public class atividadeRandom2 {

	public static void main(String[] args) {
		
		int soma=0;

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		Random random = new Random();

		for (int i = 0; i < 5; i++) {
			int numeroAleatorio = random.nextInt(); 
			numeros.add(numeroAleatorio);
		}
		for (Integer numero: numeros) {
			System.out.println("Os numeros armazenados foram " + numero);
			if (numero < 0) {
				soma ++;
			}

		}
		System.out.println("A soma de impares é " +soma);
	}
}
	
		

	


