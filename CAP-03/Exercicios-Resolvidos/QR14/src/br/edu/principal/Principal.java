package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o seu ano de nascimento.");
		int anoN = scan.nextInt();
		System.out.println("Digite o ano atual.");
		int anoA = scan.nextInt();
		
		int IdadeAtual = anoA - anoN;
		int Idade2050 = 2050 - anoN;
		
		System.out.println("A sua idade atual é: " + IdadeAtual + " " +"anos. Logo, em 2050, você terá " + Idade2050 + " anos.");

	}

}
