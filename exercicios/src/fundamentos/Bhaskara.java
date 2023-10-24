package fundamentos;

public class Bhaskara {
	public static void main(String[] args) {
		// ax2 + bx + c = 0
		// DELTA = b ao quadrado -4ac
		// (-b +- raiz de DELTA / 2a
		
		int a = 1;
		int b = 12;
		int c = -13;
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		System.out.printf("Valor do delta: %.2f", delta);
		double raizDelta = Math.pow(delta, 0.5);
		System.out.println("");
		
		double x1 = (-b + raizDelta) / (2 * a);
		double x2 = (-b - raizDelta) / (2 * a);
		
		System.out.printf("x1: %.2f", x1);
		System.out.println("");
		System.out.printf("x2: %.2f", x2);
	}
}
