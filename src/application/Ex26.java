package application;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];
		
		System.out.println("--VetorA--");
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Insira um valor para o Vetor A na posição " + (i +1));
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("--VetorB--");
		for(int i=0; i<vetorB.length; i++) {
			System.out.println("Insira um valor para o Vetor B na posição " + (i + 1));
			vetorB[i] = sc.nextInt();
		}
		
		System.out.println("--VetorC--");
		for(int i=0; i<vetorB.length; i++) {
			if(vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			}
			if (vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;
				}
			if (vetorA[i] < vetorB[i]) {
				vetorC[i] = -1;
			}
			}
		
		System.out.println("Vetor A: ");
		for(int i=0; i< vetorA.length; i++ ) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println("Vetor B: ");
		for(int i=0; i< vetorB.length; i++ ) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println("Vetor B: ");
		System.out.println();
		for(int i=0; i< vetorC.length; i++ ) {
			System.out.print(vetorC[i] + " ");
		}
		
		sc.close();
		

	}

}
