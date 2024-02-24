package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner escaneador = new Scanner(System.in);	
		double salario, aumento, vaumento, vsalario;
		System.out.println("Digite seu salário.");
		salario = escaneador.nextDouble();
		System.out.println("Digite o valor de seu aumento em %, sem o símbolo.");
		aumento = escaneador.nextDouble();
		vaumento = (salario*(aumento/100));
		vsalario = (salario+vaumento);
		System.out.println("O valor do seu aumento é de R$"+vaumento+", parabéns!");
		System.out.println("O valor do seu salário após o aumento é de R$"+vsalario+", parabéns!");
	}

}
