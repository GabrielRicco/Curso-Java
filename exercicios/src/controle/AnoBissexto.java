package controle;

import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o ano: ");
		int ano = entrada.nextInt();
		
		if(ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
			System.out.println("ANO BISSEXTO!");
		} else {
			System.out.println("Não bissexto");
		}
		
		entrada.close();
	}
}
