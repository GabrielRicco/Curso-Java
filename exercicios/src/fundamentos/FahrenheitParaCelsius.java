package fundamentos;

import java.util.Scanner;

public class FahrenheitParaCelsius {
	public static void main(String[] args) {
		// C = (F - 32) / 1,8
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("--------BEM VINDO AO FahToCel--------");
		System.out.println("");
		System.out.print("Fahrenheit: ");
		double fahrenheit = entrada.nextDouble();
		
		double celcius = (fahrenheit - 32) / 1.8;
		System.out.printf("%.2f Fahrenheit da %.2f graus Celcius", fahrenheit, celcius);
		
		entrada.close();
	}
}
