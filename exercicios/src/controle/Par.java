package controle;

import java.util.Scanner;

public class Par {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int num = entrada.nextInt();
		
		if(num >= 0 && num <= 10 && num % 2 == 0) {
			System.out.println("Número válido!");
		} else {
			System.out.println("Número inválido...");
		}
		
		entrada.close();
	}
}
