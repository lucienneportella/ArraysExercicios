package application;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] idade = new int[10];
		
		int somaIdade=0;
		for (int i=0; i<idade.length; i++) {
			System.out.println("Entre com a idade: ");
			idade[i] = sc.nextInt();
			if (idade[i] > 35) {
				somaIdade += 1;
			}
		}
		System.out.println("Há " + somaIdade + " pessoas com mais de 35 anos.");
		sc.close();
	}

}
