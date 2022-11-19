import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
		int num, f, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o numero para calculo do seu fatorial");
		num = sc.nextInt();
		
		i=1;
		f=1;
		while (i<=num) {
			f=f*i;
			i++;
		}
		System.out.println("O valor de "+num+"! é: "+f);
		
		String text = "";
		int fat=1;
		int c=num;
		while (c>=1) {
			fat*=c;
			text=text+"*"+(c);
			c--;
		}
		System.out.println(num+"! = "+text);
	}

}
