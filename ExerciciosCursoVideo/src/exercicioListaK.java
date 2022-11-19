import java.util.Random;
import java.util.Scanner;

public class exercicioListaK {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("Informe o valor de k, que é a soma a ser verificada(escolha um número entre 0 e 100");
		int k = sc.nextInt(); 
		System.out.println("Informe o tamanho da lista");
		int n = sc.nextInt();
		Random random = new Random();
		int []Lista = new int[n];
		String lista = " ";
		for (int i = 0; i<n; i++) {
			Lista[i]= random.nextInt(100);
			lista+=Lista[i]+" ";
			
		}
		System.out.println("["+lista+"]");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (Lista[i]+Lista[j]==k) {
					System.out.println("A soma dos numeros "+Lista[i]+" e "+Lista[j]+" é igual a "+k);					
				}
			}
		}

	}

}
