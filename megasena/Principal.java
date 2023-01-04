package megasena;

import javax.swing.JOptionPane;
import megasena.Numero;

public class Principal {
	
	

	public static void main(String[] args) {
		Numero[] N = new Numero[6];
		int i=0;
		do {
			N[i] = new Numero();
			String stra = JOptionPane.showInputDialog("Informe um numero:");
			int a = Integer.parseInt(stra);
			N[i].setN(a);
			i++;
		} while(i<6);
		
		Aposta jogo1;
		jogo1 = new Aposta("Paulo", N[0], N[1], N[2], N[3], N[4], N[5]);
		Concurso c1;
		c1 = new Concurso(1, 12, 23, 34, 45, 56);
		System.out.println(jogo1.toString());
		c1.verificarVencedor(jogo1);
		
	}

}
