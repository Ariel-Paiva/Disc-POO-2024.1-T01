package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double num1, num2, r1, r2;
		Scanner escaneador = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número abaixo.");
		num1 = escaneador.nextDouble();
		
		System.out.println("Digite o segundo número abaixo.");
		num2 = escaneador.nextDouble();
		
		r1 = Math.pow(num1, num2);
		r2 = Math.pow(num2, num1);
		
		System.out.println("Resultados: " + r1 + " e " + r2);
	}

}
