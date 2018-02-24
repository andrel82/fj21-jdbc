package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.*;


public class TestaInsere {
	
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Caelum");
		contato.setEmail("contato@caelum.com.br");
		contato.setEndereco("Rua Vergueiro 3185 cj57");
		contato.setDataNascimento(Calendar.getInstance());
		
		//grava a conexão
		ContatoDao dao = new ContatoDao();
		
		dao.adiciona(contato);
		System.out.println("Gravado");
		
	}
}
