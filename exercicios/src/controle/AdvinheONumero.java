package controle;

import java.util.Random;
import java.util.Scanner;

public class AdvinheONumero {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random numSorteado = new Random();
		int num = numSorteado.nextInt(101);
		
		for(int i = 10; i >= 1; i--) {
			System.out.print("Digite um valor: ");
			int valor = entrada.nextInt();
			
			if(num == valor) {
				System.out.println("PARABÉNS, VOCÊ ACERTOU!!!");
				break;
			} else {
				System.out.println("Que pena, você errou... resta " + (i-1) + " tentativas");
			} if(num > valor) {
				System.out.println("O número é maior do que isso...");
			} else {
				System.out.println("O número é menor do que isso...");
			}
		}
		
		entrada.close();
	}
}
