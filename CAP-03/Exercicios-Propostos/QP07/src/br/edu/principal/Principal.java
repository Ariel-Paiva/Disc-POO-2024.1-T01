package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		double peso, peso15, peso20;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu peso:");
		peso=sc.nextDouble();
		
		peso15=peso+peso*15/100;
		peso20=peso+peso*20/100;
		
		System.out.println("Seu peso caso engorde 15% é:" + peso15);
		
		System.out.println("Seu peso caso engorde 20% é:" + peso20);
		
	}

}
