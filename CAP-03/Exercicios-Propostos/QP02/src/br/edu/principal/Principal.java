package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		//Faça um programa que receba três números, calcule e mostre a multiplicação desses números.
		double n1, n2, n3, multiplicacao;
		Scanner escaneador = new Scanner (System.in);
		System.out.println("Digite o primeiro número");
		n1 = escaneador.nextDouble();
		System.out.println("Digite o segundo número");
		n2 = escaneador.nextDouble();
		System.out.println("Digite o terceiro número");
		n3 = escaneador.nextDouble();
		multiplicacao = n1*n2*n3;
		System.out.println("A multiplicação "+n1+" x "+n2+" x "+n3+" resulta em: "+multiplicacao);
	}

}
