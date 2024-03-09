package br.edu.principal;

import java.util.Scanner;

/* 
 * Questão 22 - Exercícios propostos do capítulo 03.
 * Faça um programa que receba o número de lados de um polígono convexo, calcule e mostre o número de diagonais desse polígono. Sabe-se que ND = N * (N − 3)/2, em que N é o número de lados do polígono.
 */

public class Principal {
	public static void main(String[] args) {
		Scanner escan = new Scanner(System.in);

		int lados;
		
		System.out.println("Digite o número de lados do polígono convexo.");
		lados = escan.nextInt();
		
		int diagonais = lados * (lados - 3) / 2;
		System.out.println("O número de diagonais desse polígono é: " + diagonais);
	}
}
