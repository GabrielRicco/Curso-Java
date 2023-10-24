package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	public static void main(String[] args) {
		Consumer<Integer> print = System.out::println;
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		Function<Integer, String> binario = num -> Integer.toBinaryString(num);
		UnaryOperator<String> inverter = palavra -> inverterString(palavra);
		Function<String, Integer> converter = num -> Integer.parseInt(num, 2);
		
		nums.stream()
			.map(binario)
			.map(inverter)
			.map(converter)
			.forEach(print);
	}
	
    public static String inverterString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}

// Primeiro Binário : 1 10 11 100 101 110 111 1000 1001

// Binário invertido : 1 01 11 001 101 011 111 0001 1001