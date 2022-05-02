package application;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int [10];
		int[] vetorB = new int [10];
		int[] vetorC = new int [10];
		
		
		for (int i =0; i< vetorA.length; i++) {
			System.out.print("Digite um valor para posição: " + i + " ");
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("VETOR A= ");
		for (int i = 0; i <vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		for (int i =0; i<vetorB.length; i++) {
			System.out.print("Digite um valor para a posição: " + i + " ");
			vetorB[i] = sc.nextInt();
		}
		System.out.println("VETOR B = ");
		for (int i = 0; i <vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();
		for (int i=0; i <vetorC.length; i++) {
			vetorC[i] = vetorA[i] - vetorB[i];
		}
		
		System.out.println();
		System.out.println("VETOR C = ");
		
		for (int i=0; i<vetorC.length; i++) {
			System.out.println(vetorC[i]);
		}
		
		sc.close();
	}

}
