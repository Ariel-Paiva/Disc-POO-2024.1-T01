package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		//Faça um programa que receba dois números, calcule e mostre a subtração do primeiro número pelo segundo.
		Scanner escaneador = new Scanner (System.in);
		double n1, n2, subtracao;
		System.out.println("Digite o primeiro número");
		n1 = escaneador.nextDouble();
		System.out.println("Digite o segundo número");
		n2 = escaneador.nextDouble();
		subtracao = n1-n2;
		System.out.println("A subtração de "+n1+" menos "+n2+" é:"+subtracao);
		
	}

}
