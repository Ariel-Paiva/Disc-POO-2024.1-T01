package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Faça um programa que recebe dois números, calcule e mostre a divisão do primeiro número pelo segundo.
		//Saiba-se que o segundo número não pode ser zero, portanto,
		//não é necessário se preocupar com validações.
		Scanner escaneador = new Scanner (System.in);
		double n1, n2;
		System.out.println("Digite o primeiro número. ");
		n1 = escaneador.nextDouble();
		System.out.println("Digite o segundo número. ");
		n2 = escaneador.nextDouble();
		System.out.println(n1/n2);
		

	}

}
