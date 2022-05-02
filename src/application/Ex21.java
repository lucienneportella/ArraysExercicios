package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] vetorA = new double[20];
		
		System.out.println("Insira a cotação do dólar: ");
		double cotacao = sc.nextDouble();
		
		for(int i=1; i<vetorA.length; i++) {
			vetorA[i] = cotacao *i;
		}
		
		for(int i=1; i<vetorA.length; i++) {
			System.out.print( vetorA[i] + " ");
		}
		
		sc.close();
	}

}
