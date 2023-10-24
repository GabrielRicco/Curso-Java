package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 5.8);
		Aluno a3 = new Aluno("Daniel", 9.8);
		Aluno a4 = new Aluno("Gui", 6.8);
		Aluno a5 = new Aluno("Rebeca", 7.1);
		Aluno a6 = new Aluno("Pedro", 8.8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7; 
		Function<Aluno, String> parabens = a -> "Parabéns " + a.nome + "! Você foi aprovado!";
		
		alunos.stream()
			.filter(aprovado)
			.map(parabens)
			.forEach(System.out::println);
		
		System.out.println("\n\n");
		
		Carro c1 = new Carro("Corsa", 100, false);
		Carro c2 = new Carro("Ferrari", 300, true);
		Carro c3 = new Carro("Camaro", 250, true);
		Carro c4 = new Carro("Gol", 150, false);
		Carro c5 = new Carro("Mustang", 350, true);
		
		List<Carro> carros = Arrays.asList(c1, c2, c3, c4, c5);
		
		Predicate<Carro> veloz = c -> c.velocidade >= 200;
		Predicate<Carro> novo = c -> c.novo;
		Function<Carro, String> apresentacao = c -> "Nome do carro: " + c.nome + 
												"\nVelocidade do carro: " + c.velocidade + "\n";
		
		carros.stream()
			.filter(veloz)
			.filter(novo)
			.map(apresentacao)
			.forEach(System.out::println);
		
		System.out.println("\n");
		
		Produto p1 = new Produto("Caneta", 7.89, 0.3, true);
		Produto p2 = new Produto("Notebook", 1347.89, 0.2, false);
		Produto p3 = new Produto("Caderno", 17.99, 0.5, true);
		Produto p4 = new Produto("Bolsa", 58.76, 0.3, false);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
		
		Predicate<Produto> desconto = p -> p.desconto >= 0.3;
		Predicate<Produto> freteGratis = p -> p.freteGratis;
		Function<Produto, String> apresentacao2 = p -> p.nome + " " + p.preco + 
													" Frete Grátis\ne com desconto fica: " 
																		+ p.descontao() + "\n";
		
		produtos.stream()
			.filter(desconto)
			.filter(freteGratis)
			.map(apresentacao2)
			.forEach(System.out::println);
	}
}
