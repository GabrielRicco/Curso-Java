package fundamentos;

import java.util.Scanner;

public class CelsiusParaFahrenheit {
	public static void main(String[] args) {
		// F = C * 1,8 + 32
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("--------BEM VINDO AO CelToFah--------");
		System.out.println("");
		System.out.print("Celsius: ");
		double celsius = entrada.nextDouble();
		
		double fahrenheit = (celsius * 1.8) + 32;
		System.out.printf("%.2f graus Celsius da %.2f Fahrenheit", celsius, fahrenheit);
		
		entrada.close();
	}
}
