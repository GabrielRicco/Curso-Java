package controle;

import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int maiorValor = 0;
		for(int i = 0; i < 5; i++) {
			System.out.print("Digite um valor: ");
			int num = entrada.nextInt();
			if(num > maiorValor) {
				maiorValor = num;
			}
		}
		
		System.out.println("O maior valor digitado foi: " + maiorValor);
		
		entrada.close();
	}
}
