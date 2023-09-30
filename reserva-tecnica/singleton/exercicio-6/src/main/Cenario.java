package main;

public class Cenario {
	private static Cenario cenario = null;
	
	private Cenario() {}
	
	public static Cenario getCenario() {
		if(cenario == null) {
			cenario = new Cenario();
			cenario.configuracoes();
		}
		
		return cenario;
	}
	
	public void configuracoes() {
		System.out.println("Hello, world!");
	}

}
