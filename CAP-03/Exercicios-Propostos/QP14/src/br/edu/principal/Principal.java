/*
 * Exercícios Propostos
 * QP14
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int anonascimento, anoatual, idadeano = 0, idademeses = 0, idadedias = 0, idadesemana = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano de nascimento: ");
		anonascimento = sc.nextInt();
		
		System.out.println("Digite o ano autal: ");
		anoatual = sc.nextInt();
		
	    idadeano = anoatual - anonascimento;
	    idademeses = idadeano * 12;
	    idadedias = idadeano * 365;
	    idadesemana = idadeano * 52;
		
		System.out.println("Idade em anos: " + idadeano);
		System.out.println("Idade em meses: " + idademeses);
		System.out.println("Idade em dias: " + idadedias);
		System.out.println("Idade em semanas: " + idadesemana);
	}

}
