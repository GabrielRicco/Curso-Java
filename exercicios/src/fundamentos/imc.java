package fundamentos;

import java.util.Scanner;

public class imc {
	public static void main(String[] args) {
		// IMC = PESO / ALTURA AO QUADRADO
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("-------BEM VINDO AO IMC Calculator-------");
		System.out.println("");
		
		System.out.print("Por favor digite seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.print("Por favor digite sua altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		System.out.printf("Seu IMC é: %.2f", imc);
		
		entrada.close();
	}
}
