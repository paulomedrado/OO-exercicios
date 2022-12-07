package relacionamentoClasses;

public class Principal {

	public static void main(String[] args) {
		Lutador L[];
		L = new Lutador[6];
		L[0] = new Lutador();
		L[0].setIdade(41);
		L[0].setAltura(1.82f);
		L[0].setDerrotas(2);
		L[0].setEmpates(3);
		L[0].setPeso(82);
		L[0].setVitorias(13);
		L[0].setNacionalidade("brasiliero");
		L[0].setNome("Popó");
		L[0].getPeso();
		L[0].getCategoria();
		
		L[0].status();
		L[1] = new Lutador("Paulo", "Brasileiro", 41, 13, 1, 3, 82.2f, 1.88f);
		L[1].getPeso();
		L[1].getCategoria();
		L[1].status();
		
	}

}
