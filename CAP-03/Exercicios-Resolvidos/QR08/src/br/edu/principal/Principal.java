package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double dep, taxa, rend, total;
		Scanner escaneador = new Scanner(System.in);
		
		System.out.println("Digite o valor depositado abaixo.");
		dep = escaneador.nextDouble();
		
		System.out.println("Digite o valor da taxa de juros abaixo.");
		taxa = escaneador.nextDouble();
		
		rend = dep * taxa / 100;
		total = dep + rend;
		
		System.out.println("O seu rendimento foi de: " + rend);
		System.out.println("Total após o rendimento: " + total);
	}

}
