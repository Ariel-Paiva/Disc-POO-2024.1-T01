package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Áre do quadrado."+"\n"+"Digite, em metros, o valor do primeiro lado da figura.");
		float l1 = sc.nextFloat();
		System.out.println("Agora digite o valor do segundo lado da figura.");
		float l2 = sc.nextFloat();
		float a = l1 * l2;
		
		System.out.println("A área do quadrado é: "+a+"m²");
		
	}

}