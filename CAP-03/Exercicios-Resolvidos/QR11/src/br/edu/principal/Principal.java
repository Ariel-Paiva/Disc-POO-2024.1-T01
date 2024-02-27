package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	   double num, quad, cubo, r2, r3;	   
	   Scanner scanner = new Scanner(System.in);	   
	   System.out.println("Digite um número positivo maior que zero:");
	   num = scanner.nextDouble();	  
       quad = Math.pow(num, 2);
       cubo = Math.pow(num, 3);
	   r2 = Math.sqrt(num);
	   r3 = Math.cbrt(num); 
	   System.out.println("a) o número digitado ao quadrado:\n" + quad + "\nb) o número digitado ao cubo:\n" + cubo + "\nc) raiz quadrada do número digitado:\n" +  r2 + "\nd) raiz cúbica do número digitado:\n" +  r3);
	}

}
