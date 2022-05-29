package application;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int[] vetorA = new int[10];
		 
		 for(int i=0; i <vetorA.length; i++) {
			 System.out.println("Entre com um valor para o vetorA na posição " + i);
			 vetorA[i] = sc.nextInt();
		 }
		 
		 boolean primo = true;
		 String msg;
		 for (int i=0; i<vetorA.length; i++) {
			 
			primo = true;
			 for (int j=2; j<vetorA[i]; j++) {
				 if (vetorA[i] % j ==0) {
					 primo = false;
					 break;
				 }
			 }
			 
			 msg = " ";
			 if (primo ) {
				 msg = " primo ";
			 } else {
				 msg = " não é primo ";
			 }
			 System.out.println(vetorA[i] + msg);
		 }
		 sc.close();

	}

}
