package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	   double num, i, f, a;	   
	   DecimalFormat casasInt = new DecimalFormat("0");
	   
	   Scanner scanner = new Scanner(System.in);	   
	   System.out.println("Digite um número real:");
	   num = scanner.nextDouble();	 
	   i = Math.floor(num);
	   f = num - i;
	   a = Math.round(num);
	   
	   System.out.println("a) a parte inteira desse número: " + casasInt.format(i));
	   System.out.println("b) a parte fracionária desse número: " + f);
	   System.out.println("c) o arredondamento desse número: " + casasInt.format(a));
	}

}
