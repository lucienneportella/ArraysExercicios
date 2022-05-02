package application;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int [10];
		int[] vetorB = new int [10];
		int[] vetorC = new int[10];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.print("Digite um valor para o vetor A: " );
			vetorA[i] = sc.nextInt();
		}
		
		//exibe vetorA na tela
		System.out.print("Vetor A:");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + "  ");
		}
		//Insere o valor no vetor B
		for (int i=0; i<vetorB.length; i++) {
			System.out.println("Digite um valor para o vetor B: ");
			vetorB[i] = sc.nextInt();
		}
		
		//exibe o vetorB
		for(int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		//vetorC
		System.out.println("Vetor C: ");
		for(int i=0; i<vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		
		//exibe vetorC
		for (int i=0; i<vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		sc.close();

	}

}

			

