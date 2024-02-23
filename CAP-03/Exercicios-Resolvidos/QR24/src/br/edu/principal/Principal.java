package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double hora, h, m, conversao;
		Scanner escaneador = new Scanner(System.in);
		
		System.out.println("Digite abaixo a hora.");
		hora = escaneador.nextDouble();
		
		h = Math.floor(hora);
		m = hora - h;
		conversao = (h * 60) + (m * 100);
		
		System.out.println("Minutos: " + conversao);
	}

}
