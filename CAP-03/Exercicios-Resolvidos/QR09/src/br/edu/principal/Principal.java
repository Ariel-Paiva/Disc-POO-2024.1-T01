package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner escaneador = new Scanner(System.in);	
		double base, altura, area;
		System.out.println("Digite a base do triângulo.");
		base = escaneador.nextDouble();
		System.out.println("Digite a altura do triângulo.");
		altura = escaneador.nextDouble();
		area = (base*altura)/2;
		System.out.println("A área do triângulo é de "+area+"u².");
	}

}
