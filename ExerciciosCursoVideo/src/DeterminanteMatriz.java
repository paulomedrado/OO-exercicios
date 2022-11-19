import java.util.Scanner;

import javax.swing.JOptionPane;

public class DeterminanteMatriz {
	static int matriz(int o) {
		int A[][]=new int[o][o];
		return A[o][o];
	}
	static int lerInteiros(int linha, int coluna) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Informe %do valor da %da linha : ", linha + 1, coluna + 1);
		int valor = sc.nextInt();
		return valor;
	}
	
	public static void main(String[] args) {
		int n, Det;
		System.out.println("Vamos calcular o determinante da matriz A de ordem n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor de n");
		n = sc.nextInt();
		
		if (n==1) {
			Det = n;
		}
		
		if (n==2) {
			int A[][]= new int[2][2];
			for (int i=0; i<n; i++) {
				for (int j=0; j<n; j++) {
					A[i][j]=lerInteiros(i,j);
				}
			} 
			Det = (A[1][1]*A[2][2])-(A[1][2]*A[2][1]);
		}
		
	}

}
