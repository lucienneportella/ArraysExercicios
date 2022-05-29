package application;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i=0; i <vetorA.length; i++) {
			System.out.println("Entre com um valor para o vetor A ");
			vetorA[i] = sc.nextInt();
		}
		
		for (int i=0; i<vetorA.length; i ++) {
			System.out.println("Analisando os divisores de  " + vetorA[i]);
			
			for (int j=1; j<=vetorA[i]; j++) {
				if (vetorA[i] % j ==0) {
					System.out.println(vetorA[i] + " é divisivel por " + j);
				}
			}
		}
		
		
		
		sc.close();
	}

}
