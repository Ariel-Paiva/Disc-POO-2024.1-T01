package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double ang, alt, escada, radiano;
		Scanner escaneador = new Scanner(System.in);
		
		System.out.println("Digite abaixo a medida do ângulo em graus formado pela escada.");
		ang = escaneador.nextDouble();
		
		System.out.println("Digite abaixo a altura da parede.");
		alt = escaneador.nextDouble();
		
		radiano = ang * 3.14 / 180;
		escada = alt / Math.sin(radiano);
		
		System.out.println("A medida da escada é: " + escada);
	}

}
