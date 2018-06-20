package Atividade;

import java.util.ArrayList;
import java.util.HashMap;

public class Pessoa {
	private String nome;
	private int idade;
	
	private ArrayList<Objeto> listaObjeto = new ArrayList<Objeto>();
	
	private HashMap<Objeto, String> objetos = new HashMap<Objeto, String>();
	
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		
	}
	
	public String getNome() {
		return nome;
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	public int getIdade() {
		return idade;
		
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
		
	}
	
	public String exibirInformacao() {
		String nome = getNome();
		String idade = getIdade() + "";
		String objeto = getListaObjeto() + "";
		
		return "Nome: " + nome + " idade: " + idade + "objeto" + objeto;
		
	}

	public ArrayList<Objeto> getListaObjeto() {
		return listaObjeto;
	}

	public void setListaObjeto(Objeto objeto) {
		this.listaObjeto.add(objeto);
		
	}
	
	public void transferirObjeto(Objeto objeto) {
		if(objetos.containsKey(objeto.getNome())) {
			Objeto passado = objetos.get(objeto.getNome());
		}
		
		
	}
	
	public void exibirObjetoNoMap(Objeto objeto) {
		if(objetoExistente(objeto)) {
			Objeto objetoEncontrado = localizarObjeto(objeto);
			System.out.println(objetoEncontrado);
		}
	}
	
	private Objeto localizarObjeto(Objeto objeto) {
		// TODO Auto-generated method stub
		return objetos.get(objeto.getNome());
		
	}

	private boolean objetoExistente(Objeto objeto) {
		return objetos.containsKey(objeto.getNome());
		
	}
	
	
	
}
