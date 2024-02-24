package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner escaneador = new Scanner(System.in);	
		double pes, polegadas, jardas, milhas;
		System.out.println("Digite a distância em pés.");
		pes = escaneador.nextDouble();
		polegadas = (pes*12);
		jardas = (pes/3);
		milhas = (jardas/1760);
		System.out.println(pes+" pés equivalem a "+polegadas+" polegadas.");
		System.out.println(pes+" pés equivalem a "+jardas+" jardas.");
		System.out.println(pes+" pés equivalem a "+milhas+" milhas.");
	}

}
