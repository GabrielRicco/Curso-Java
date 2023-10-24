package controle;

import java.util.Scanner;

public class NumeroPositivo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		int soma = 0;
		
		while(num >= 0) {
			System.out.print("Digite um número: ");
			num = entrada.nextInt();
			if(num >= 0) {
				soma += num;
			}
		}
		
		System.out.println("A soma de todos os valores positivos é: " + soma);
		
		entrada.close();
	}
}
