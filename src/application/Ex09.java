package application;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float[] vetorA = new float[10];
		float[] vetorB = new float[10];
		float[] vetorC = new float[10];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Insira um valor para o vetor A: ");
			vetorA[i] = sc.nextInt();
		}
		System.out.println("Vetor A:");
		for (int i=0; i<vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}
		
		for (int i=0; i<vetorB.length; i++) {
			System.out.println("Insira um valor para o vetor B:");
			vetorB[i] = sc.nextInt();
	
		}
		System.out.println("Vetor B:");
		for (int i=0; i<vetorB.length; i++)
			System.out.println(vetorB[i]);
		
		for (int i=0; i<vetorC.length; i++) {
			vetorC[i] = vetorA[i] /  vetorB[1];
		}
		System.out.println("Vetor C:");
		for (int i=0; i<vetorC.length; i++) {
			System.out.println(vetorC[i]);
		}
		sc.close();
	}
	
}
