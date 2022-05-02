package application;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int [10];
		
		int soma=0;
		for(int i =0; i<vetorA.length; i++) {
			System.out.println("Insira um valor para o vetor A na posição " + (i+1));
			vetorA[i] = sc.nextInt();
			soma += vetorA[i];
		}
		System.out.print("Vetor A= ");
		for(int i =0; i<vetorA.length; i++) {
			System.out.print( vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("A soma dos valor do vetor A é: " + soma);
		sc.close();
	}

}
