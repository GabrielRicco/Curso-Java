package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		final int num1 = 32;
		final double num2 = 5.0/9.0;
		
		double f = 86;
		System.out.println("Fahrenheit: " + f);
		
		double c = (f - num1) * num2;
		System.out.println("Convertido para grau Celsius: " + c);
		
		System.out.println("");
		
		f = 0;
		System.out.println("Fahrenheit: " + f);
		
		c = (f - num1) * num2;
		System.out.println("Convertido para grau Celsius: " + c);
	}
}
