package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double custo, convite, qtd;
		Scanner escaneador = new Scanner(System.in);
		
		System.out.println("Digite abaixo o custo do espetáculo.");
		custo = escaneador.nextDouble();
		
		System.out.println("Digite abaixo o preço do convite.");
		convite = escaneador.nextDouble();
		
		qtd = custo / convite;
		
		System.out.println("Total de convites que devem ser vendidos: " + qtd);
		
	}

}
