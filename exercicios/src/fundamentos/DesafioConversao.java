package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Primeira Salario: ");
		String s1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Segundo Salario: ");
		String s2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Terceiro Salario: ");
		String s3 = entrada.nextLine().replace(",", ".");
		
		double salario1 = Double.parseDouble(s1);
		double salario2 = Double.parseDouble(s2);
		double salario3 = Double.parseDouble(s3);
		
		double mediaSalario = (salario1 + salario2 + salario3) / 3;
		
		System.out.println("Salário primeiro mês: " + salario1);
		System.out.println("Salário segundo mês: " + salario2);
		System.out.println("Salário terceiro mês: " + salario3);
		System.out.println("Média salarial: " + mediaSalario);
		
		entrada.close();
		
	}
}
