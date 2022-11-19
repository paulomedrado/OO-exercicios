import javax.swing.JOptionPane;

public class numerosTipos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strnum;
		int s, tv=0, p=0, i=0, cem=0, num;
		float media;
		strnum = JOptionPane.showInputDialog("Informe um numero");
		num = Integer.parseInt(strnum);
		s=num;
		while (num!=0) {
			strnum = JOptionPane.showInputDialog("Informe um numero");
			num = Integer.parseInt(strnum);
			tv++;
			if (num>100) {
				cem++;
			}
			if (num%2==0) {
				p++;
			} else {
				i++;
			}
			s=s+num;
		}
		media = s/tv;
		JOptionPane.showMessageDialog(null, "total de valores: "+tv+"\n"+"numeros impares; "+i+"\n"+"numeros pares: "+p
				+"\n"+"A média é: "+media+"\n"+"maiores que 100: "+cem);
	}

}
