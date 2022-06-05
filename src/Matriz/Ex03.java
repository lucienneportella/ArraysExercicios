package Matriz;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				System.out.println("Entre com um valor para a matriz " + i);
				matriz[i][j] = sc.nextInt();	
			}	
		}
		int par =0;
		int impar =0;
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
				if(matriz[i][j] % 2 ==0) {
					par += 1;
				} else {
					impar +=1;
				}
			}
			System.out.println();
		}
		System.out.println("Numero de pares " + par);
		System.out.println("Numero de ímpares " + impar);
		
		
		sc.close();

	}

}
