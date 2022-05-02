package application;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] A = new int[5];
		int [] B = new int[5];
		
		System.out.println("Digite 5 valores para o vetor A: ");
		for (int i = 0; i < A.length; i++ ) {
			A[i] = sc.nextInt();
			B[i] = A[i]; //o B recebe o valor de A
		}
		//Exibe o valor do vetor A
		System.out.print("Vetor A = ");
		
		for (int i=0; i<A.length; i++) {
			System.out.print(A[i] + " ");
		}
		
		System.out.println();
		
		//Exibe o valor de B
		System.out.print("Vetor B = ");
		for (int i=0; i<B.length; i++) {
			System.out.print(B[i] + " ");
		}
		
		System.out.println();
		
		sc.close();
		
		
		

	}

}
