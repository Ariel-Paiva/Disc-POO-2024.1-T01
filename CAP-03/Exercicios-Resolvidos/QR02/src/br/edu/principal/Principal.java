package br.edu.principal;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal {

	public static void main(String[] args) {
		
	    System.out.println("Média aritmética.");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a sua primeira nota.");
		float n1 = scan.nextFloat();
		System.out.println("Digite a sua segunda nota.");
		float n2 = scan.nextFloat();
		System.out.println("Digite a sua terceira nota.");
		float n3 = scan.nextFloat();
		
		float m = (n1 + n2 + n3)/3;
		DecimalFormat comma = new DecimalFormat("0.00");
		
		System.out.println("A sua média final foi: " + comma.format(m));
		
	}

}