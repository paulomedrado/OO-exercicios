import java.util.Scanner;

public class SomaEntrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, s;
		String resp;
		s=0;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Informe o numero inteiro");
			n = teclado.nextInt();
			s +=n;
			System.out.println("Deseja continuar?[S//N]");
			resp = teclado.next();
		} while(resp.equals("S"));
		System.out.println("A soma de todos os números é: "+s);
	}

}
