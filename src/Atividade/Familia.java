package Atividade;

import java.util.ArrayList;
import java.util.HashMap;

public class Familia {
	
	private String auxnome;
	private String auxobjeto;
	private Objeto objeto;
	
	private ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();
	
	private HashMap<Pessoa, Objeto> passavel = new HashMap<Pessoa, Objeto>();
	
	public void exibirTudoFamilia() {
		for (Pessoa pessoa : listaPessoa) {
			pessoa.exibirInformacao();
			
		}
		
	}
	
	public void transferirObjetoPessoa(String auxnome, Objeto objeto) {
		for (int i = 0; i < listaPessoa.size(); i++) {
			if(auxnome.equals(listaPessoa.get(i).getNome())) {
				if(auxobjeto.equals(objeto.getNome())) {
					
				}
				
			}
		}
		
	}
	
	

}
