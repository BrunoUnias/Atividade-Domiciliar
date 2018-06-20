package Atividade;

import java.util.Comparator;

public class Lutador implements Comparable<Lutador> {
	private String nome;
	private int altura;
	private int forca;
	
	public Lutador(String nome, int altura, int forca) {
		this.nome = nome;
		this.altura = altura;
		this.forca = forca;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + getNome() + " Altura: " + getAltura() + " Forca: " + getForca();
		
	}

	@Override
	public int compareTo(Lutador lutador) {
		// TODO Auto-generated method stub
		if(this.getNome() == lutador.getNome()) {
			return 1;
		}
		
		else if(this.getAltura() > lutador.getAltura()) {
			return 2;
			
		}
		
		else if(this.getForca() > lutador.getForca()) {
			return 3;
			
		}
		
		else {
			System.out.println("Lutador inexistente");
		}
		
		return 0;
	}


}
