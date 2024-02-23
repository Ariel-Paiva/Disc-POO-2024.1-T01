package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner escaneador = new Scanner(System.in);
		double numero1, numero2, numero3, numero4;
		System.out.println("Digite o primeiro número");
		numero1 = escaneador.nextDouble();
		System.out.println("Digite o segundo número");
		numero2 = escaneador.nextDouble();
		System.out.println("Digite o terceiro número");
		numero3 = escaneador.nextDouble();
		System.out.println("Digite o quarto número");
		numero4 = escaneador.nextDouble();
		double soma = numero1+numero2+numero3+numero4;
		System.out.println(soma);
	}

}
