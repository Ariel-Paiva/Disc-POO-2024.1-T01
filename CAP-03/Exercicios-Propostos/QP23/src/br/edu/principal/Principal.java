package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Questão 23 - Exercícios propostos do capítulo 03.
 * Faça um programa que receba a medida de dois ângulos de um triângulo, calcule e mostre a medida do terceiro ângulo. Sabe-se que a soma dos ângulos de um triângulo é 180 graus.
 */

public class Principal {
	public static void main(String[] args) {
		Scanner escan = new Scanner(System.in);
		
		DecimalFormat casasDecimais = new DecimalFormat("0.####");
		
		float angulo1, angulo2;
		
		System.out.println("Digite a medida em graus do primeiro ângulo do triângulo");
		angulo1 = escan.nextFloat();
		
		System.out.println("Digite a medida em graus do segundo ângulo do triângulo");
		angulo2 = escan.nextFloat();
		
		float angulo3 = 180 - angulo1 - angulo2;
		System.out.println("A medida do terceiro ângulo mede " + casasDecimais.format(angulo3) + " graus.");
	}
}
