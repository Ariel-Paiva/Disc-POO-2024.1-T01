package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Área do losango."+"\n"+"Digite, em metros, o valor da diagonal maior do losango.");
		float dmaior = sc.nextFloat();
		System.out.println("Agora digite o valor da diagonal menor do losango.");
		float dmenor = sc.nextFloat();
		float a = (dmaior * dmenor)/2;
		
		System.out.println("A área do losango é: "+a+"m²");
	}

}
