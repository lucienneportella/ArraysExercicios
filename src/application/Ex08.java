package application;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Insira um valor para o vetor A: ");
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Vetor A: ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.println(vetorA[i]);
		}
		
		for (int i=0; i<vetorB.length; i++) {
			System.out.println("Insira um valor para o vetor B: ");
			vetorB[i] = sc.nextInt();
		}
		
		for (int i=0; i<vetorC.length; i++) {
			vetorC[i] = vetorA[i] * vetorB[i];
		}
		
		System.out.println("Vetor C: ");
		for (int i=0; i<vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		
		sc.close();
	}

}
