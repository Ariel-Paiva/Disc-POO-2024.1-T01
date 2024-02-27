package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	   double nota1, nota2, nota3, peso1, peso2, peso3, media;	   
	   Scanner scanner = new Scanner(System.in);	   
	   DecimalFormat casas = new DecimalFormat("0.00");
	   
	   System.out.println("Digite a nota 1:");
	   nota1 = scanner.nextDouble();	   
	   System.out.println("Digite a nota 2:");
	   nota2 = scanner.nextDouble();	
	   System.out.println("Digite a nota 3:");
	   nota3 = scanner.nextDouble();
	   
	   System.out.println("Digite o peso da nota 1:");
	   peso1 = scanner.nextDouble();
	   System.out.println("Digite o peso da nota 2:");
	   peso2 = scanner.nextDouble();
	   System.out.println("Digite o peso da nota 3:");
	   peso3 = scanner.nextDouble();
	   
	   media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
	   
	   System.out.println("Média ponderada: " + casas.format(media));
	}

}
