package application;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		char[] vetorB = new char[10];
		
		System.out.println("--Vetor A --");
		
		for(int i =0; i<vetorA.length; i++) {
			System.out.println("Entre com um valor para a posicação " + (i + 1));
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("--Vetor B--");
		
		for(int i=0; i<vetorB.length; i++) {
			if (vetorA[i] < 7) {
				vetorB[i] = 'a';
			}
			if (vetorA[i] == 7) {
				vetorB[i] = 'b';
			}
			if (vetorA[i] > 7 && vetorA[i] < 10) {
				vetorB[i] = 'c';
			}
			if (vetorA[i] == 10) {
				vetorA[i] = 'd';
			}
			if (vetorA[i] > 10 ) {
				vetorB[i] = 'e';
			}
		}
		
	System.out.println("Vetor A");
	for(int i =0; i<vetorA.length; i++) {
		System.out.print(vetorA[i] + " ");
	}
	
	System.out.println("Vetor B");{
		for(int i =0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
	}
	
	sc.close();
	}

}
