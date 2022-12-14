package copaDoMundo;

public class Grupo {
	String nome;
	Selecao S[];
	
	public Grupo() {
		
	}
	
	public Grupo(String nome, Selecao[] s) {
		this.nome = nome;
		S = s;
	}
	
	public void cadastrarSelecao(Selecao selecao) {
		S = new Selecao[4];
		int i=0;
		do {
			System.out.println("Cadastre uma seleção");
			this.S[i] = selecao;
			System.out.println(this.S[i]);
			i++;
		} while (i<4);
	}
	
}
