package copaDoMundo;

import java.util.Random;

public class Partida {
	String nome;
	int dia;
	String local;
	boolean autorizacao;
	Selecao mandante;
	Selecao visitante;
	
	public Partida(String nome, int dia, Selecao mandante, Selecao visitante) {
		this.nome = nome;
		this.dia = dia;
		this.mandante = mandante;
		this.visitante = visitante;
		this.autorizacao = false;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected int getDia() {
		return dia;
	}

	protected void setDia(int dia) {
		this.dia = dia;
	}

	protected String getLocal() {
		return local;
	}

	protected void setLocal(String local) {
		this.local = local;
	}

	protected boolean getAutorizacao() {
		return autorizacao;
	}

	protected void setAutorizacao(boolean autorizacao) {
		this.autorizacao = autorizacao;
	}

	protected Selecao getMandante() {
		return mandante;
	}

	protected void setMandante(Selecao mandante) {
		this.mandante = mandante;
	}

	protected Selecao getVisitante() {
		return visitante;
	}

	protected void setVisitante(Selecao visitante) {
		this.visitante = visitante;
	}
	
	public void autorizarPartida(Selecao mandante, Selecao visitante) {
		if (mandante.cor == visitante.cor) {
			System.out.println("A cor do uniforme da equipe visitante deve ser trocada");
			setAutorizacao(false);
		} else {
			System.out.println("A partida está autorizada");
			setAutorizacao(true);
		}
	}
	public void resultado() {
		if (getAutorizacao()==true) {
			Random m = new Random();
			int a = m.nextInt(4);
			Random v = new Random();
			int b = v.nextInt(4);
			if (a == b) {
				this.mandante.setPontuacao(mandante.getPontuacao()+1);
				this.visitante.setPontuacao(visitante.getPontuacao()+1);
				this.mandante.getPontuacao();
				this.visitante.getPontuacao();
			} else if (a>b) {
				this.mandante.setPontuacao(mandante.getPontuacao()+3);
				this.mandante.getPontuacao();
				this.visitante.getPontuacao();
			} else {
				this.visitante.setPontuacao(visitante.getPontuacao()+3);
			}
			
			
		}
		System.out.println(this.mandante.getPontuacao());
		System.out.println(this.visitante.getPontuacao());
	}
	
	

}
