package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
	public static void main(String[] args) {
		Civic civic = new Civic();
		civic.acelerar();
		civic.acelerar();
		
		System.out.println(civic);
		
		Ferrari ferrari = new Ferrari();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		
		ferrari.ligarTurbo();
		ferrari.ligarAr();
		ferrari.acelerar();
		ferrari.acelerar();
		
		ferrari.desligarTurbo();
		ferrari.acelerar();
		
		System.out.println(ferrari);
	}
}
