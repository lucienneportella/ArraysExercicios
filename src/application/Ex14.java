package application;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		int soma =0;
		int qntImpar=0;
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Insira um valor para o vetorA: ");
			vetorA[i] = sc.nextInt();
			if (vetorA[i] % 2 != 0) {
				soma+= vetorA[i];
				qntImpar+= 1;
				
			}
		}
		 int media = soma/ qntImpar;
		 System.out.println("A média dos artmética simples dos elementos ímpares é: " + media);
		 sc.close();

	}

}
