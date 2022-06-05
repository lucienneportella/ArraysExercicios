package Matriz;

import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[4][4];
		Random generator = new Random();
		
		for(int i=0; i <matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = generator.nextInt(10);
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		int maior =0;
		int linha =0;
		int coluna =0;
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				if ( matriz[i][j] > maior) {
					maior = matriz[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		System.out.println("O maior número é " + maior + " na linha " + linha + " coluna " + coluna);
	}

}
