package controle;

import java.util.Scanner;

public class Primo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = entrada.nextInt();
		int contadorDeDivisor = 0;
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				contadorDeDivisor++;
			}
		}
		
		if(contadorDeDivisor == 0) {
			System.out.println("Este número é primo");
		} else {
			System.out.println("Este número não é primo");
		}
		
		
		entrada.close();
	}
}
