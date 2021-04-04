package br.com.erickfreire.media;

import java.util.Scanner;

/**
 * Crie um prorgama que calcule a m�dia de notas de um aluno
 * @author Erick Freire
 * @version 1 - Criado em 04-04-2021 as 17:54
 */

public class Media {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int total = 0;
		int contaNotas = 1;
		
		while(contaNotas <= 10) {
			System.out.print("Informe uma nota: ");
			int nota = entrada.nextInt();
			
			total = total + nota;
			contaNotas = contaNotas + 1;
		}
		
		int media = total / 10;
		
		System.out.printf("%nO total de notas foi de: %d", total);
		System.out.printf("%nA m�dia das notas � de: %d%n", media);

	}

}
