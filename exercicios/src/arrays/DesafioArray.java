package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Quantas notas? ");
		int notas = entrada.nextInt();
		
		double[] notasAluno = new double[notas];
		
		for (int i = 0; i < notasAluno.length; i++) {
			System.out.print("Digite a nota[" + (i+1) + "]: ");
			notasAluno[i] = entrada.nextDouble();
		}
		
		double soma = 0;
		for(double nota: notasAluno) {
			soma += nota;
		}
		
		System.out.println("Minhas notas foram: " + Arrays.toString(notasAluno));
		System.out.println("A média delas é: " + soma / notasAluno.length);
		
		
		entrada.close();
	}
}
