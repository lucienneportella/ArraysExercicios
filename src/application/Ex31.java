package application;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[20];
		int[] vetorB = new int[20];
		
		for (int i=0; i <vetorA.length; i++) {
			System.out.println("Entre com o valor da posição A - " + i);
			vetorA[i] = sc.nextInt();
			
		}
	
		int posB =0;
		for (int i=0; i <vetorA.length; i++) {
			if (vetorA[i] % 2 ==0) {
				vetorB[posB] = vetorA[i];
				posB++;
			}	
		}
		
		
		for (int i=0; i <vetorA.length; i++) {
			if (vetorA[i] % 2 !=0) {
				vetorB[posB] = vetorA[i];
				posB++;
			}
		}
		
		System.out.println("Vetor A =");
		for (int i=0; i <vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.println("Vetor B =");
		for (int i=0; i <vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		
		sc.close();
	}

}
