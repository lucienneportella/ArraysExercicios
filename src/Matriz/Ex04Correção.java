package Matriz;

import java.util.Scanner;

public class Ex04Corre��o {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String[][] compromissos = new String[31][24];
		
		boolean sair = false;
		int opcao;
		while (!sair) {
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");
			
			opcao = sc.nextInt();
			
			if (opcao ==1) {
				
				boolean diaValido = false;
				int dia =0;
				while (!diaValido) {
					System.out.println("Entre com o dia do m�s: ");
					 dia = sc.nextInt();
					 if (dia > 0 && dia <=31) {
						 diaValido = true;
					 } else {
						 System.out.println("Dia inv�lido, digite novamente.");
					 }
				}
				
				boolean horaValido = false;
				int hora =0;
				while (!horaValido) {
					System.out.println("Entre com a hora do compromisso: ");
					 hora = sc.nextInt();
					 if (hora >= 0 && hora <=24) {
						 horaValido = true;
					 } else {
						 System.out.println("Hora inv�lido, digite novamente.");
					 }
				}
				dia--;
				System.out.println("Digite o compromisso: ");
				compromissos[dia][hora] = sc.next();
				
			} else if (opcao ==2) {
				boolean diaValido = false;
				int dia =0;
				while (!diaValido) {
					System.out.println("Entre com o dia do m�s: ");
					 dia = sc.nextInt();
					 if (dia > 0 && dia <=31) {
						 diaValido = true;
					 } else {
						 System.out.println("Dia inv�lido, digite novamente.");
					 }
				}
				
				boolean horaValido = false;
				int hora =0;
				while (!horaValido) {
					System.out.println("Entre com a hora do compromisso: ");
					 hora = sc.nextInt();
					 if (hora >= 0 && hora <=24) {
						 horaValido = true;
					 } else {
						 System.out.println("Hora inv�lido, digite novamente.");
					 }
				}
				
				dia--;
				System.out.println("O compromisso agendado �: " + compromissos[dia][hora]);
				
				
			} else if (opcao ==0) {
				sair = true;
			} else {
				System.out.println("Op��o inv�lida, digite novamente. ");
			}
		
		}
		
	
		sc.close();
		

	}

}
