package fundamentos;

import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		// (BASE * ALTURA) / 2
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("------BEM VINDO AO TRAINGULO CALCULATOR------");
		System.out.println("");
		
		System.out.print("Digite o valor da base do Triângulo: ");
		double base = entrada.nextDouble();
		System.out.println("");
		
		System.out.print("Digite o valor da altura do Triângulo: ");
		double altura = entrada.nextDouble();
		System.out.println("");
		
		double area = (base * altura) / 2;
		System.out.printf("O valor da área desse Triângulo é: %.2f", area);
		
		entrada.close();
	}
}
