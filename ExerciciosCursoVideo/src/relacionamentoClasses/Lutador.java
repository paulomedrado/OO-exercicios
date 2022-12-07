package relacionamentoClasses;

public class Lutador {
	private String	nome,
			nacionalidade,
			categoria;
	private int		idade,
			vitorias,
			derrotas,
			empates;
	private float	peso,
			altura;
	public Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas,
			int empates, float peso, float altura) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
		this.peso = peso;
		this.altura = altura;
	}
	public Lutador() {
	}
	public void apresentar() {
		System.out.println("O lutador "+getNome()+", "+
							getNacionalidade()+", com "+getIdade()+
							" anos. Com "+getAltura()+"m e pesando "+
							getPeso()+"kg. Possui "+getVitorias()+
							" vitórias, "+getDerrotas()+" e "+
							getEmpates()+" empates.");
	}
	public void status() {
		System.out.println("Nome: "+getNome()+"; "+
				getNacionalidade()+". Idade: "+getIdade()+
				" anos. Altura "+getAltura()+"m. Peso "+
				getPeso()+"kg."+"\n"+"É um peso "+getCategoria()+" e possui "+getVitorias()+
				" vitórias, "+getDerrotas()+" e "+
				getEmpates()+" empates.");
	}
	public void ganharLuta() {
		this.setVitorias(getVitorias()+1);
	}
	public void perderLuta() {
		this.setDerrotas(getDerrotas()+1);
	}
	public void empatarLuta() {
		this.setEmpates(getEmpates()+1);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if (this.peso<52.2) {
			this.categoria = "Invalido";
		} else if (this.peso<=70.3) {
			this.categoria = "Leve";
		} else if (this.peso<=83.9) {
			this.categoria = "Medio";
		} else if (this.peso<=120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Invalido";
		}
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	

}
