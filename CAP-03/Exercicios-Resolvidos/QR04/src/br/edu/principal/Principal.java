package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double sal, novosal;
		Scanner escaneador = new Scanner(System.in);
		
		System.out.println("Digite o seu saldo abaixo.");
		sal = escaneador.nextDouble();
		novosal = sal + sal * 25/100;
		
		System.out.println("Seu novo saldo será: " + novosal);
	}

}
