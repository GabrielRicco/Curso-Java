package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		// Domingo -> 1
		// Segunda -> 2
		// Terça -> 3
		// Quarta -> 4
		// Quinta -> 5
		// Sexta -> 6
		// Sábado -> 7
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o dia da semana: ");
		String diaDaSemana = entrada.next();
		
		if(diaDaSemana.equalsIgnoreCase("Domingo")) {
			System.out.println(1);
		} else if (diaDaSemana.equalsIgnoreCase("Segunda")) {
			System.out.println(2);
		} else if (diaDaSemana.equalsIgnoreCase("Terça")) {
			System.out.println(3);
		} else if (diaDaSemana.equalsIgnoreCase("Quarta")) {
			System.out.println(4);
		} else if (diaDaSemana.equalsIgnoreCase("Quinta")) {
			System.out.println(5);
		} else if (diaDaSemana.equalsIgnoreCase("Sexta")) {
			System.out.println(6);
		} else if (diaDaSemana.equalsIgnoreCase("Sábado")) {
			System.out.println(7);
		} else {
			System.out.println("Dia inválido");
		}
		
		entrada.close();
	}
}
