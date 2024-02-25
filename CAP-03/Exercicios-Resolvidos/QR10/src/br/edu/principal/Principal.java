package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		System.out.println("Área do círculo.");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio do círculo.");
		double r = scan.nextFloat();
		double r2 = Math.pow(r, 2);
	    double a = 3.14 * r2;
	    
	    System.out.println("A área do círculo é igual a: " + a);
	
	}

}
