package Atividade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
	    int a = 10;
		long b = a;
		
		float r = 1.2f;
		double t = r;
		
		Universitario universitario = new Universitario("guto");
		Object universidade = universitario;
		
		
		Pessoa pessoa = new Pessoa("Paulo", 18);
		Object sociedade = (Pessoa) pessoa;
		
		
		
		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();
		scanner.nextLine();
		
		exibirMenu();
		
		while(opcao != 0 ) {
			if(opcao == 1) {
				exibirPessoa();
				
			}
			
			else if(opcao == 2) {
				trabalhadorEstudante();
			}
			
			else if(opcao == 3) {
				Familia();
			}
			
			else if(opcao == 4){
				ordenarLutador();
				
			}
		}
	
		
	}
	
	private static void exibirMenu() {
		System.out.println("--Menu--");
		System.out.println("1 -exibir pessoa.");
		System.out.println("2 - trabalhador e estudante.");
		System.out.println("3 - Familia.");
		System.out.println("4 ordenar lutador.");
		
	}
	
	private static void exibirPessoa() {
		ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();
		Pessoa pessoa = new Pessoa("Juliana", 18);
		listaPessoa.add(pessoa);
		String s = null;
		
		for(int i = 0; i <= listaPessoa.size(); i++) {
			System.out.println(pessoa.exibirInformacao());
			
		}
		
		for (Pessoa pessoa1 : listaPessoa) {
			System.out.println(pessoa1.exibirInformacao());
			
		}
		
		listaPessoa.forEach(S -> System.out.println(S.exibirInformacao()));

		
	}
	
	private static void trabalhadorEstudante() {
		ArrayList<Estudante> listaEstudante = new ArrayList<Estudante>();
		Universitario universitario = new Universitario("Rafael");
		Trabalhador trabalhador = new Trabalhador("Lucas");
		
		listaEstudante.add(universitario);
		listaEstudante.add(trabalhador);
		
		
		for (Estudante estudante : listaEstudante) {
			System.out.println(estudante.estudar());
			
		}
	}
	
	private static void Familia() {
		ArrayList<Familia> familia = new ArrayList<Familia>();
		
		
	}
	
	private static void ordenarLutador() {
		ArrayList<Lutador> lutadores = new ArrayList<Lutador>();
		Lutador lutador = new Lutador("Julio", 190, 200);
		
		lutadores.add(lutador);
		
		Comparator<Lutador> comparatorPorNome = new Comparator<Lutador>() {

			@Override
			public int compare(Lutador o1, Lutador o2) {
				// TODO Auto-generated method stub
				return o1.getNome().compareTo(o2.getNome());
				
			}
			
		};
		
		Comparator<Lutador> comparatorPorAltura = new Comparator<Lutador>() {

			@Override
			public int compare(Lutador o1, Lutador o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getAltura(), o2.getAltura());
			}
			
		};
		
		Comparator<Lutador> comparatorPorForca = new Comparator<Lutador>(){

			@Override
			public int compare(Lutador o1, Lutador o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getForca(), o2.getForca());
			}
			
		};
		
		Collections.sort(lutadores, comparatorPorNome);
		System.out.println(lutadores);
		
		Collections.sort(lutadores, comparatorPorAltura);
		System.out.println(lutadores);
		
		Collections.sort(lutadores, comparatorPorForca);
		
		
	}

}
