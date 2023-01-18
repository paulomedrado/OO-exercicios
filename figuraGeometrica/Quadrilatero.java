 package figuraGeometrica;

public class Quadrilatero extends FiguraGeometrica {
	
	private int base;
	
	public Quadrilatero() {
		System.out.println("iniciando o construtor padrao de Quadrilatero");
	}
	
	public Quadrilatero(int b) {
		this();
		System.out.println("iniciando construtor alternativo do quadrilatero");
		base = b;
	}
	
	public float calcularArea() {
		float area = base*base;
		return area;
	}
	public float calcularPerimetro() {
		float perimetro = 4*base;
		return perimetro;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
	
	

}
