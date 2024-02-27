package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	   double a_degrau, a_usuario, qtd_degraus;	   
	   Scanner scanner = new Scanner(System.in);	   
	  
	   System.out.println("Altura do degrau em metros:");
	   a_degrau = scanner.nextDouble();	   
	   System.out.println("Altura que você deseja alcançar subindo a escada em metros:");
	   a_usuario = scanner.nextDouble();	
	   qtd_degraus = a_usuario / a_degrau;
	   
	   System.out.println("Degraus que você deve subir: " + qtd_degraus);
	}

}
