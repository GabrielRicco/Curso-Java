package controle;

import java.util.Scanner;

public class MediaAluno {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite sua primeira nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.print("Digite sua segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		if(media >= 7) {
			System.out.println("Aprovado!");
		} else if(media >= 4) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		
		entrada.close();
	}
}
