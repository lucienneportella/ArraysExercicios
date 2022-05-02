package application;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] nota1 = new double[10];
		double[] nota2 = new double[10];
		double[] result = new double[10];
		String [] aluno = new String[10];
		
		for(int i=0; i< 10; i++) {
			System.out.println("Nome: ");
			aluno[i] = sc.next();
			System.out.println("Entre com a nota 1: ");
			nota1[i] = sc.nextDouble();
			System.out.println("Entre com a nota2: ");
			nota2[i] = sc.nextDouble();
			result[i] = ( nota1[i] + nota2[i]) /2;
		}
		
		for(int i=0; i<result.length; i++) {
			if (result[i] > 7) {
				System.out.println("Aluno: " + aluno[i] + " Média: " + result[i] + " Situação:  Aprovado");
			} else {
				System.out.println("Aluno: " + aluno[i] + " Média: " + result[i] + " Situação:  Reprovado");
			}
		}
		
		
		
		
		sc.close();

	}

}
