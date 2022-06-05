package Matriz;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] agenda = new String[31][24];
		
		boolean sair = false;
		
		while(!sair) {
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");
			int resp = sc.nextInt();
			
			boolean validaPosicao = false;
			while(!validaPosicao) {
				if (resp ==1) {
					System.out.println("Entre com o dia do mês: ");
					int dia = sc.nextInt();
					System.out.println("Entre com a hora: ");
					int hora = sc.nextInt();
					System.out.println("Entre com o compromisso: ");
					String compromisso = sc.next();
					agenda[dia][hora] = compromisso;
					validaPosicao = true;
				}
				
				if (resp ==2) {
					System.out.println("Entre com o dia do mês: ");
					int dia = sc.nextInt();
					System.out.println("Entre com a hora do compromisso: ");
					int hora = sc.nextInt();
					System.out.println("O compromisso agendado é: " + agenda[dia][hora]);
					validaPosicao = true;
				}
				if (resp ==0) {
					validaPosicao = true;
					sair = true;
				}
			}
	
		} 
	
		sc.close();
	}
}
