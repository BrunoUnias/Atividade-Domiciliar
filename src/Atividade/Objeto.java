package Atividade;

public class Objeto {
	private String nome;
	private String descricao;
	
	public Objeto() {
		this.nome =nome;
		this.descricao = descricao;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void exibirObjeto() {
		System.out.println("Nome : " + getNome() + " Descricao : " + getDescricao());
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + getNome() + " Descricao: " + getDescricao();
		
	}
	
	
	
}
