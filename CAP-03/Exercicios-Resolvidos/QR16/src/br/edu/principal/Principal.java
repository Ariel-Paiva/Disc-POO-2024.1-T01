package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double horas_t, vlr_sal_min, vlr_hora_t, vlr_sal_bru, imp, vlr_sal_liq;
		Scanner escaneador = new Scanner(System.in);
		
		System.out.println("Digite as horas trabalhadas abaixo.");
		horas_t = escaneador.nextDouble();
		
		System.out.println("Digite o valor do salário mínimo abaixo.");
		vlr_sal_min = escaneador.nextDouble();
		
		vlr_hora_t = vlr_sal_min / 2;
		vlr_sal_bru = vlr_hora_t * horas_t;
		imp = vlr_sal_bru * 3 / 100;
		vlr_sal_liq = vlr_sal_bru - imp;
		
		System.out.println("O salário a receber é: " + vlr_sal_liq);
	}

}
