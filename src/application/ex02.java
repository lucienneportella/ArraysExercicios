package application;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int [] vetorA = new int [8];
		int [] vetorB = new int [8];
		
		for (int i=0; i< vetorA.length; i++) {
			System.out.print("Entre com o valor da posição " + (i + 1) + " :" );
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.print("Valores do Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		vetorB = vetorA;
		System.out.println();
		System.out.print("Valor do VetorB = ");
		for (int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i]*2 + " ");
		}
		
		sc.close();
				

	}

}
