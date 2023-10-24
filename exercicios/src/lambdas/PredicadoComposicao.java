package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	public static void main(String[] args) {
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTreGigitos = num -> num >= 100 && num <= 999;
		
		System.out.println(isPar.and(isTreGigitos).test(22));
	}
}
