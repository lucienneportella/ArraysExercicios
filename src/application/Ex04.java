package application;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Criando vetores
		double[] vetorA = new double[15];
		double[] vetorB = new double[15];
		
		for(int i=0; i< vetorA.length; i++) {
			System.out.println("Insira um valor para a posição " + (i + 1) + " ");
			vetorA[i] = sc.nextInt();
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		
		//Exibir o vetorA
		
		System.out.print("Vetor A: ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		//VetorB
		System.out.print("Vetor B:");
		for(int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		sc.close();
	}
	

}
