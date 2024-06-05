package Vetor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class atividadeRandom3 {

	public static void main(String[] args) {
		int num =0;

		ArrayList<String> frutas = new ArrayList<String>();

		frutas.add("Laranja");
		frutas.add("Abacaxi");
		frutas.add("Melancia");	
		frutas.add("Caju");
		frutas.add("Amora");
		frutas.add("Banana");	
		frutas.add("Kiwi");
		frutas.add("Carambola");
		frutas.add("Cereja");
		frutas.add("Framboesa");
		
		for(String fruta: frutas) {
			System.out.println("Frutas: " + fruta);
		}
		System.out.println();

		frutas.remove(9);
		frutas.remove(7);
		frutas.remove(6);
		frutas.remove(5);
		frutas.remove(1);

		for(String fruta: frutas) {
			num++;
			System.out.println("Frutas: " + fruta);
		}
		System.out.println("Sua lista agora tem "+num+" itens");
	}
}
