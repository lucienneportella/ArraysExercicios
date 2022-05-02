package application;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		int somaMenor=0, somaIgual =0, media =0, somaMaior = 0;
		for (int i=0; i<vetorA.length; i++) {
			System.out.print("Insira um valor para o vetor A: ");
			vetorA[i] = sc.nextInt();
			if (vetorA[i] < 15) {
				somaMenor += vetorA[i];
			}
			if (vetorA[i] == 15) {
				somaIgual += 1;	
			}
			if (vetorA[i] > 15){
				somaMaior += vetorA[i];
				}
				
		}
		System.out.println("Vetor A = ");
		for (int i=0; i<vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
		
		media = somaMaior / vetorA.length;
		System.out.println();
		System.out.println("Soma dos números do vetor A menores que 15: " + somaMenor);
		System.out.println("Números do vetor A iguais a 15: " + somaIgual);
		System.out.println("Media doS números maiores que 15: " + media);
		sc.close();
	}

}
