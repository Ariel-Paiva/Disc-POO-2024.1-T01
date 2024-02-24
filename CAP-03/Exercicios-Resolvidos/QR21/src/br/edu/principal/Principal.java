package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner escaneador = new Scanner(System.in);
		double x, y, z;
		/*O valor de X corresponde à altura em que a pessoa deseja pregar o quadro;
		 * O valor de Y corresponde à distância em que deverá ficar a escada em relação à parede;
		 * O valor de Z corresponde ao tamanho da escada.
		 */
		System.out.println("Lembre-se: A Altura da escada deve ser maior que a altura que você deseja pôr o quadro.");
		System.out.println("Digite o tamanho da sua escada.");
		z = escaneador.nextDouble();
		System.out.println("Digite a altura em que você deseja pregar o quadro.");
		x = escaneador.nextDouble();
		
		y = (Math.pow(z,2))-(Math.pow(x,2));
		y = Math.sqrt(y);
		System.out.println("A distância que você deve pôr a escada em relação à parede é "+y+".");


	}

}
