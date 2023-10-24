package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data data1 = new Data(26, 07, 2023);
		
		var data2 = new Data();
		
		System.out.println(data1.obterDataFormatada());
		System.out.println(data2.obterDataFormatada());
	}
}
