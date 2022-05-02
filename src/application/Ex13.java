package application;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		int soma =0;
		for(int i=0; i<vetorA.length; i++) {
			System.out.print("Insira um valor para o vetorA: ");
			vetorA[i] = sc.nextInt();
			if (vetorA[i] % 5 == 0) {
				soma+= vetorA[i];	
			}
		}
		System.out.println("A soma dos múltiplos de 5 são: " + soma);
		sc.close();

	}

}
