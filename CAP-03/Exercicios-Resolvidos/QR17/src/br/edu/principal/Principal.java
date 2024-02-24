package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner escaneador = new Scanner(System.in);
		double salario, cheque1, cheque2, cpmf1, cpmf2, saldo;
		System.out.println("Digite o salário");
		salario = escaneador.nextDouble();
		System.out.println("Digite o primeiro cheque.");
	    cheque1 = escaneador.nextDouble();
		System.out.println("Digite o segundo cheque.");
	    cheque2 = escaneador.nextDouble();
	    cpmf1 = cheque1 * (0.38/100);
	    cpmf2 = cheque2 * (0.38/100);
	    saldo = salario - cheque1 - cheque2 - cpmf1 - cpmf2;
	    System.out.println("O seu saldo é de R$"+saldo+".");

	}

}
