package copaDoMundo;

public class Jogador {
	String nome;
	int camisa;
	String posicao;
	boolean apto;
	
	public Jogador(String nome, int camisa, String posicao) {
		this.nome = nome;
		this.camisa = camisa;
		this.posicao = posicao;
		this.apto = true;
	}
	public Jogador() {
		
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected int getCamisa() {
		return camisa;
	}

	protected void setCamisa(int camisa) {
		this.camisa = camisa;
	}

	protected String getPosicao() {
		return posicao;
	}

	protected void setPosicao(String posicao) {
		this.posicao = posicao;
	}
		
	protected boolean getApto() {
		return apto;
	}

	protected void setApto(boolean apto) {
		this.apto = apto;
	}

	public void machucar() {
		this.apto = false;
	}
	
	public void recuperar() {
		this.apto = true;
	}
	

}
