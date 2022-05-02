package application;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] vetorA = new int [10];
		int [] vetorB = new int [10];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Digite um elemento para a posição " + i);
			vetorA[i] = sc.nextInt();
			
		}
		
		System.out.println("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.print("Vetor B: ");
		for (int i=0; i<vetorB.length; i++) {
			vetorB[i] = vetorA[i] *i;
			System.out.println(vetorB[i] + " ");
		}
		sc.close();

	}

}
