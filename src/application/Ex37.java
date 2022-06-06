package application;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com um valor para posição " + i + ":");
			vetorA[i] = sc.nextInt();
		}
		
		int primeiro;
		int segundo;
		int soma;
		for (int i=0; i<vetorA.length; i++) {
			primeiro = vetorA[i];
			for (int j=1; j<vetorA[i]; j++) {
				segundo = vetorA[i] -j;
				soma = primeiro * segundo;
				primeiro = soma;
				vetorB[i] = primeiro;	
		}
	}
		System.out.println("VETOR A =");
		for (int i=0; i<vetorA.length; i++) {
			System.out.println(vetorA[i]);
		}
	
		System.out.println("VETOR B = ");
	for (int i=0; i<vetorB.length; i++) {
		System.out.println(vetorB[i]);
	}
	
	sc.close();
	}
}
