package Atividade;

public class Universitario implements Estudante {
	private String nome;
	
	public Universitario(String nome) {
		this.nome = nome;
		
	}
	
	public String getNome() {
		return nome;
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}



	@Override
	public void estudar() {
		// TODO Auto-generated method stub
		System.out.println("estou estudando");
		
	}

}
