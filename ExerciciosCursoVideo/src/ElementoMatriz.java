import java.util.Scanner;

public class ElementoMatriz {
	static int elemento(int linha, int coluna) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor de A["+linha+"]["+coluna+"]");
		int valor = sc.nextInt();
		return valor;		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor de n, que é a ordem da matriz quadrada");
		int n = sc.nextInt();
		int A[][] = new int[n][n];
		
		if (n==2) {		
			A[0][0]=elemento(0,0);
			A[0][1]=elemento(0,1);
			A[1][0]=elemento(1,0);
			A[1][1]=elemento(1,1);
			int Det= (A[0][0]*A[1][1]-A[0][1]*A[1][0]);
			System.out.println("Det A="+Det);
		
		} else if (n==3) {
			A[0][0]=elemento(0,0);
			A[0][1]=elemento(0,1);
			A[0][2]=elemento(0,2);
			A[1][0]=elemento(1,0);
			A[1][1]=elemento(1,1);
			A[1][2]=elemento(1,2);
			A[2][0]=elemento(2,0);
			A[2][1]=elemento(2,1);
			A[2][2]=elemento(2,2);
			int Det= (A[0][0]*A[1][1]*A[2][2]+A[0][1]*A[1][2]*A[2][0]+A[0][2]*A[1][0]*A[2][1]-(A[0][2]*A[1][1]*A[2][0]+A[0][0]*A[1][2]*A[2][1]+A[0][1]*A[1][0]*A[2][2]));
			System.out.println("Det A="+Det);
		} else {
			//calculo do menor complementar
			int B[][] = new int[n][n];
			for (int c=0; c<=n; c++) {
				if (c==0) {
					
				}
			}
		}
	}

}
