package application;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int soma =0;
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Insira um valor para o vetor A:");
			vetorA[i] = sc.nextInt();
			if (vetorA[i] % 2 ==0) {
				soma +=1;
			} 
			
		}
		System.out.println("Existem nesse programa ao todo " + soma + " números pares.");
		sc.close();

	}

}
