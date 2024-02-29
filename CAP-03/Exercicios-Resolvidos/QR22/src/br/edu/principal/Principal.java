package br.edu.principal;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat comma = new DecimalFormat("0.00");
		
		System.out.println("Digite o valor do salário mínimo.");
		double salmin = scan.nextDouble();
		System.out.println("Digite a quantidade de quilowatts consumidos pela residência");
		double qw = scan.nextDouble();
		
		double valqw = salmin/5;
		double realqw = valqw * qw;
		double dqw = (realqw * 15)/100;
		double vald = realqw - dqw;
		
		System.out.println("O valor, em reais, de cada quilowatt é: R$" +comma.format(valqw)+ ". Logo, a residência deverá pagar R$" +comma.format(realqw));
		System.out.println("Caso haja um desconto de 15% do valor total, a residência deverá pagar R$" +comma.format(vald));
		
	}

}
