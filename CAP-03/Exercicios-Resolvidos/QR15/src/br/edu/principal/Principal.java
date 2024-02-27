package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double p_fab, perc_d, perc_i, vlr_d, vlr_i, p_final;	   
		Scanner scanner = new Scanner(System.in);	   
		   
		System.out.println("Preço de fábrica do carro:");
		p_fab = scanner.nextDouble();	   
		System.out.println("Percentual de lucro do distribuidor:");
		perc_d = scanner.nextDouble();	
		System.out.println("Percentual de impostos:");
		perc_i = scanner.nextDouble();
		   
        vlr_d = p_fab * perc_d / 100;
        vlr_i = p_fab * perc_i / 100;
        p_final = p_fab + vlr_d + vlr_i;
		
	    System.out.println("a) valor correspondente ao lucro do distribuidor: " + vlr_d);
	    System.out.println("b) valor correspondente aos impostos: " + vlr_i);
	    System.out.println("c) preço final do carro: " + p_final);
	}

}
