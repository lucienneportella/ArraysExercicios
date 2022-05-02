package application;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] vetorA = new int [15];
		int [] vetorB = new int [15];
		
		System.out.print("Vetor A: ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print("Entre com um número para a posição " + i + ": " );
			vetorA[i] = sc.nextInt();
			
		}
		
		System.out.println("Vetor A: ");
		for (int i =0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		for (int i=0; i<vetorA.length; i++) {
			vetorB[i] = vetorA[i] * vetorA[i];
		}
		
		System.out.println();
		System.out.print("Vetor B:");
		for (int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		sc.close();
	}

}
