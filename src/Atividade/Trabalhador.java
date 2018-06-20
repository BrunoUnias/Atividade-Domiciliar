package Atividade;

public class Trabalhador implements Estudante{
	private String nome;
	
	public Trabalhador(String nome) {
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
