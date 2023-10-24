package fundamentos;

import java.util.Scanner;

public class QuadradoCubo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("------BEM VINDO AO QuadradoCubo------");
		System.out.println("");
		
		System.out.print("Digite um valor: ");
		double valor = entrada.nextDouble();
		
		double valorQuadrado = Math.pow(valor, 2);
		System.out.printf("%.2f ao quadrado é %.2f", valor, valorQuadrado);
		System.out.println("");
		
		double valorCubo = Math.pow(valor, 3);
		System.out.printf("%.2f ao cubo é %.2f", valor, valorCubo);
		
		entrada.close();
	}
}
