package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double pesokg, pesog;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu peso em quilogramas:");
		pesokg=sc.nextDouble();
		
		pesog=pesokg*1000;
		
		System.out.println("Seu peso em gramas é:" + pesog);

	}

}
