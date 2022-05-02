package application;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[10];
		
		for (int i =0; i<vetorA.length; i++) {
			System.out.println("Entre com um número para a posição " + i);
			vetorA[i] = sc.nextInt();
			
			if (vetorA[i] % 2 != 0) {
				break;
				
			}
			
		}
		sc.close();
	}

}
