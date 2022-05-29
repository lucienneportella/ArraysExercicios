package application;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		
		for(int i=0; i <vetorA.length; i++) {
			System.out.println("Entre com o valor para a posiçaõ " + (i +1));
			vetorA[i] = sc.nextInt();
		}
		int s = 10;
		for (int i= 0; i < vetorA.length; i++) {
			
			s -= 1;
			vetorB[i] = vetorA[s];
		}
		
		System.out.println("--VetorA--");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.println("--VetorB--");
		for (int i=0; i <vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		sc.close();
	}

}
