package application;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int par =0;
		int impar =0;
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Insira um valor para o veto A: ");
			vetorA[i] = sc.nextInt();
			if (vetorA[i] % 2==0) {
				par += 1;
			} else {
				impar +=1;
			}
		}
		int porcPar = (par * 100)/vetorA.length;
		int porcImpar = 100 - porcPar;
		
		System.out.println("Vetor A= ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("Há " + par + " pares no vetor A.\n E há " + impar + " ímpares no vetor A");
		System.out.println("Porcentagem de pares: " + porcPar);
		System.out.println("Porcentagem de ímpares: " + porcImpar);
		sc.close();

	}

}
