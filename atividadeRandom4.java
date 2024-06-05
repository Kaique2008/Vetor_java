package Vetor;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class atividadeRandom4 {

	public static void main(String[] args) {
	Integer a;	
	ArrayList<String> carros = new ArrayList<String>();
	Scanner ler = new Scanner(System.in);	
		
		carros.add("Fusca");
		carros.add("Brasília");
		carros.add("Chevette");
		carros.add("Monza");
		carros.add("Ferrari");
		carros.add("Bugati");
		carros.add("Camaro");
		carros.add("Lamborghini");
		carros.add("Maclaren");
		carros.add("Supra");
		
		System.out.println("Qual dos seguintes modelos você gostaria de ver?");
		for (String carro: carros) {
			System.out.println(carro);
		}
		a=ler.nextInt();
		
		System.out.println("A opção escolhida foi: "+carros.get(a-1));
		
		ler.close();
	}
}