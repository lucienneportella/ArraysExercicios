package application;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] idade = new int[10];
		
		int maiorIdade =0, menorIdade = idade[0];
		int posicao1 =0, posicao2 =0;
		for(int i=0; i < idade.length; i++) {
			System.out.println("Entre com a idade: ");
			idade[i] = sc.nextInt();
			if(idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				posicao1 = i;
			} if(idade[i] < menorIdade) {
				menorIdade = idade[i];
				posicao2 = i;
			}
		}	
		
		System.out.println("Maior idade: " + maiorIdade + " Posicao " + posicao1);
		System.out.println("Menor idade: " + menorIdade + " Posicao " + posicao2);
		
		sc.close();

	}

}
