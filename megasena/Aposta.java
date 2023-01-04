package megasena;

public class Aposta {
	private float	valor;
	private String	apostador;
	private int	n1;
	private int	n2;
	private int	n3;
	private int	n4;
	private int	n5;
	private int	n6;
	
	public Aposta(String apostador, Numero n1, Numero n2, Numero n3, Numero n4, Numero n5, Numero n6) {
		this.apostador = apostador;
		this.n1 = n1.getN();
		this.n2 = n2.getN();
		this.n3 = n3.getN();
		this.n4 = n4.getN();
		this.n5 = n5.getN();
		this.n6 = n6.getN();
		this.valor = 4.5f;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getApostador() {
		return apostador;
	}

	public void setApostador(String apostador) {
		this.apostador = apostador;
	}
	

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getN3() {
		return n3;
	}

	public void setN3(int n3) {
		this.n3 = n3;
	}

	public int getN4() {
		return n4;
	}

	public void setN4(int n4) {
		this.n4 = n4;
	}

	public int getN5() {
		return n5;
	}

	public void setN5(int n5) {
		this.n5 = n5;
	}

	public int getN6() {
		return n6;
	}

	public void setN6(int n6) {
		this.n6 = n6;
	}

	@Override
	public String toString() {
		return "Aposta [valor da aposta=R$" + valor + ", apostador=" + apostador + ", números escolhidos:" + n1 + "," + n2 + "," + n3
				+ "," + n4 + "," + n5 + "," + n6 + "]";
	}

	
	
	
	

}
