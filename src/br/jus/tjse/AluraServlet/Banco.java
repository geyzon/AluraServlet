package br.jus.tjse.AluraServlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	
	static {
		Empresa empresa1 = new Empresa();
		empresa1.setNome("Google");
		lista.add(empresa1);
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Alura");
		lista.add(empresa2);
	}

	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
}
