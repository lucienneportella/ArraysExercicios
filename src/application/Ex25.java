package application;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.print("Entre com um número na posição " + i + " ");
			vetorA[i] = sc.nextInt();
			if (vetorA[i] % 2 == 0 && vetorA[i] != 1 ) {
				vetorB[i] = 1;
			} else {
				vetorB[i] = 0;
			}
		}
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.print("Vetor B= ");
		for (int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		sc.close();
		
	}

}
