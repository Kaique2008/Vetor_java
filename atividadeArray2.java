package Vetor;

import java.util.ArrayList;
import java.util.ArrayList;

public class atividadeArray2 {

	public static void main(String[] args) {
		// Criando um ArrayList de números inteiros 
				ArrayList<Integer> numeros = new ArrayList<>();
				
				numeros.add(5);// Adicionando elementos ao ArrayList
				numeros.add(10);
				numeros.add(15);
				numeros.add(25);
				numeros.add(30);
				
				int soma=0;
				
				for (Integer numero: numeros) {
					soma += numero;
					System.out.println("Os numeros armazenados foram " + numero);
					
				}
				
				System.out.println("A soma dos números é " + soma);
				
			

			}

		


	}


