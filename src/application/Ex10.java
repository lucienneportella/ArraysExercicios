package application;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Insira um valor para o vetor A: ");
			vetorA[i] = sc.nextInt();
			vetorB[i] = vetorA[i] % 2;
		}
		
		for(int i=0; i<vetorB.length; i++) {
			System.out.println(vetorB[i]);
		}
		sc.close();
		

	}

}
