package br.edu.principal;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário base.");
		float sal = scan.nextFloat();
		float gra = (sal * 5)/100;
		float imp = (sal * 7)/100;
		
		float salr = sal + gra - imp;
		DecimalFormat comma = new DecimalFormat("0.00");
		System.out.println("O salário a ser recebido é de: R$" + comma.format(salr));
		
	}

}