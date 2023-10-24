package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3);
		double c = Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c);
		
		int expressao1 = (6 * (3 + 2));
		int expressao1ao2 = (int) Math.pow(expressao1, 2);
		int expressao1total = expressao1ao2 / (3 * 2);
		
		int expressao2 = ((1 - 5) * (2 - 7)) / 2;
		int expressao2ao2 = (int) Math.pow(expressao2, 2);
		
		int menosExpressao = expressao1total - expressao2ao2;
		int expressaoCubo = (int) Math.pow(menosExpressao, 3);
		int dezCubo = (int) Math.pow(10, 3);
		System.out.println(expressaoCubo / dezCubo);
	}
}
