package megasena;

public class Concurso {
	private	int	id;
	private int	premio;
	private int	s1;
	private int	s2;
	private int	s3;
	private int	s4;
	private int	s5;
	private int	s6;
	Aposta jogo1;
	
		
	public Concurso(int s1, int s2, int s3, int s4, int s5, int s6) {
		int c[];
		c = new int[6];
		this.s1 = s1;
		c[0] = this.s1;
		this.s2 = s2;
		c[1] = this.s2;
		this.s3 = s3;
		c[2] = this.s3;
		this.s4 = s4;
		c[3] = this.s4;
		this.s5 = s5;
		c[4] = this.s5;
		this.s6 = s6;
		c[5] = this.s6;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPremio() {
		return premio;
	}
	public void setPremio(int premio) {
		this.premio = premio;
	}
	
	public void verificarVencedor(Aposta jogo) {
		if ((jogo.getN1()==this.s1) && (jogo.getN2()==this.s2) && (jogo.getN3()==this.s3)
		&& (jogo.getN4()==this.s4) && (jogo.getN5()==this.s5) && (jogo.getN6()==this.s6)) {
			System.out.println("Aposta vencedora");
		} else {
			System.out.println("Não venceu");
		}
		
	}
	
	

}
