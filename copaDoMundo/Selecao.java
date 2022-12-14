package copaDoMundo;


public class Selecao {
	String	nome,
			cor;
	int		ranking,
			pontuacao;
	Grupo	grupo;
	Jogador J[];
	public Selecao(String nome, Jogador[] j, String cor, int ranking) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.ranking = ranking;
		this.pontuacao = 0;
		this.J = j;
	}
	
	public Selecao() {
		
	}
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected String getCor1() {
		return cor;
	}
	protected void setCor1(String cor) {
		this.cor = cor;
	}
	protected int getRanking() {
		return ranking;
	}
	protected void setRanking(int ranking) {
		this.ranking = ranking;
	}
	protected int getPontuacao() {
		return pontuacao;
	}
	protected void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	protected Grupo getGrupo() {
		return grupo;
	}
	protected void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
//	public void SelecionarJogadores() {
//		this.J = new Jogador[5];
//		for (int k=0; k<5; k++) {
//			J[k] = ;
//		}
//	}
	
	
	
	

}
