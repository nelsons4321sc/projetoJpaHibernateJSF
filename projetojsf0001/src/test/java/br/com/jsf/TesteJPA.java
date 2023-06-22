package br.com.jsf;

import javax.persistence.Persistence;



public class TesteJPA {
	
	public static void main(String[] args) {
		
		Persistence.createEntityManagerFactory("projetojsf0001");
	}

}
