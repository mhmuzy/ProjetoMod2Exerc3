package Hitss.Treinamento.Show;

import java.util.Scanner;

public class Show {
	public static void main(String[] args) {
		try {
			
			System.out.println("");
			System.out.println("         Hitss Treinamento");
			System.out.println("");
			int num;
			do {
				System.out.println("Digite o Número do Quadrado:");
				Scanner teclado = new Scanner(System.in);
				System.out.println("");
				num = teclado.nextInt();
				System.out.println("");
				
			} while (num >= 0);
			
				if (num < 0) {
					System.out.println("Fim do Programa.");
				}
			
		} catch (Exception e) {
			System.out.println("Erro de Processamento: " + e.getMessage());
		}
	}
}
