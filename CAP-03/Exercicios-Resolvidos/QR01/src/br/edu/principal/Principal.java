package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner escaneador = new Scanner(System.in);
		double numero1, numero2, numero3, numero4;
		System.out.println("Digite o primeiro n�mero");
		numero1 = escaneador.nextDouble();
		System.out.println("Digite o segundo n�mero");
		numero2 = escaneador.nextDouble();
		System.out.println("Digite o terceiro n�mero");
		numero3 = escaneador.nextDouble();
		System.out.println("Digite o quarto n�mero");
		numero4 = escaneador.nextDouble();
		double soma = numero1+numero2+numero3+numero4;
		System.out.println(soma);
	}

}
