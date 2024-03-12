/*
 * Exercícios Propostos
 * QP17
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double r, comp, area, vol;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite raio da esfera: ");
		r = sc.nextDouble();
		
		comp = 2 * 3.14 * r;
		area = 3.14 * Math.pow(r, 2);
		vol = 3f/4f * 3.14 * Math.pow(r, 3);
		
		System.out.println("O comprimento da esfera: " + comp);
		System.out.println("A área da esfera: " + area);
		System.out.println("O volume da esfera: " + vol);
	}

}
