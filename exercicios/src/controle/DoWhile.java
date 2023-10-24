package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		do {
			System.out.print("Digite um valor: ");
			valor = entrada.nextLine();
		} while(!valor.equalsIgnoreCase("sair"));
		
		System.out.println("Saindo...");
		
		entrada.close();
	}
}
