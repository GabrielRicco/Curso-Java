package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		String s = "Texto";
		s.toUpperCase();
		
		// Wrappers são a versão objeto dos tipos primiitivos!
		int a = 123;
		System.out.println(a);
	}
}
