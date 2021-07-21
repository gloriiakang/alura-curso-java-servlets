package br.com.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	
	static {
		Empresa empresa0 = new Empresa();
		empresa0.setNome("Google");
		Empresa empresa1 = new Empresa();
		empresa1.setNome("Apple");
		lista.add(empresa0);
		lista.add(empresa1);
	}

	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

}
