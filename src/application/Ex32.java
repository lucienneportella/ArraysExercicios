package application;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[5];
		
		for (int i=0; i <vetorA.length; i++) {
			System.out.println("Entre com um valor para o vetor A - " + i);
			vetorA[i] = sc.nextInt();
		}
		
		for (int i=0; i <vetorA.length; i++) {
			for(int c=1; c <=10; c++) {
				System.out.println(vetorA[i] +" x " + c + " = " + (vetorA[i] *c));
			}
		System.out.println("----------------------");	
		}
		
		sc.close();
	}

}
