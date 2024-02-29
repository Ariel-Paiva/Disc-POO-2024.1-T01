package br.edu.principal;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat comma = new DecimalFormat("0.00");
	
		System.out.println("Digite o valor referente ao peso do saco de ração.");
		double saco = scan.nextDouble();
		System.out.println("Digite, em gramas, a quantidade de ração fornecida ao primeiro gato.");
		double gato1 = scan.nextDouble();
		System.out.println("Digite, em gramas, a quantidade de ração fornecida ao segundo gato.");
		double gato2 = scan.nextDouble();
		
		double rgato1 = gato1/1000;
		double rgato2 = gato2/1000;
		double rfinal = saco - (5 *(rgato1 + rgato2));
	
	
		System.out.println("O quantidade, em quilogramas, de ração restante após cinco dias é: " + comma.format(rfinal) + " Kg.");
	}

}
