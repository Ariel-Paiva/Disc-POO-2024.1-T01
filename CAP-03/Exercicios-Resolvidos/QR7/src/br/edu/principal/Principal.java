package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	   double sal, salreceber, imp;	   
	   Scanner scanner = new Scanner(System.in);	   
	  
	   System.out.println("Digite o salário do funcionário:");
	   sal = scanner.nextDouble();	   
	   imp = sal * 10/100;
	   salreceber = sal + 50 - imp;
	   
	   System.out.println(salreceber);
	}

}
