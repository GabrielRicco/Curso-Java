package oo.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Pedro","Amoedo", 46);
		p1.setIdade(-40);;
		
		System.out.println(p1);
		
		System.out.println("");
		System.out.println(p1.getNome());
		System.out.println(p1.getNomeCompleto());
		System.out.println(p1.getIdade());
	}
}
