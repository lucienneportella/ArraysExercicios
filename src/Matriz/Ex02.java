package Matriz;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[10][10];
		Random generator = new Random();
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = generator.nextInt(10);
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		int maiorL5 =0;
		int menorL5 = Integer.MAX_VALUE;
		int linha5 = 5;
		for (int i=0; i<matriz[linha5].length; i++) {
			if (matriz[linha5][i] > maiorL5) {
				maiorL5 = matriz[linha5][i];
			}
			if (matriz[5][i] < menorL5) {
				menorL5 = matriz[linha5][i];
			}
		}
		
		System.out.println("Maior valor da linha 5 = " + maiorL5);
		System.out.println("Menor valor da linha 5 = " + menorL5);
		
		int maiorC7 =0;
		int menorC7 = Integer.MAX_VALUE;
		int col7 = 7;
		for (int i=0; i<matriz.length; i++) {
			if (matriz[i][col7] > maiorC7) {
				maiorC7 = matriz[i][col7];
			}
			
			if (matriz[i][col7] < menorC7) {
				menorC7 = matriz[i][col7];
			}
		}
		System.out.println("Maior valor da coluna 7 = " + maiorC7);
		System.out.println("Menor valor da coluna 7 = " + menorC7);
		

	}

}
