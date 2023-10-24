package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		System.out.println("Vou comprar uma TV de 50 polegadas?");
		System.out.println(trabalho1 && trabalho2);
		
		System.out.println("");
		
		System.out.println("Vou comprar uma TV de 32 polegadas?");
		System.out.println(trabalho1 ^ trabalho2);
		
		System.out.println("");
		
		System.out.println("Vamos tomar sorvete?");
		System.out.println(trabalho1 || trabalho2);
	}
}
