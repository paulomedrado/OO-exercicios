package exercicio1;

public class Principal {

	public static void main(String[] args) {
		Calculadora c1,
					c2,
					c3,
					c4;
		c1 = new Calculadora(8, 4);
		System.out.println("o valor da soma de "+ c1.getOp1()+" e "+c1.getOp2()+" é "+c1.somar());
		
		c2 = new Calculadora();
		c2.setOp1(16);
		c2.setOp2(8);
		System.out.println("o valor da divisão de "+ c2.getOp1()+" e "+c2.getOp2()+" é "+c2.dividir());
		
		c3 = new Calculadora(10,13);
		System.out.println("A diferença entre "+ c3.getOp1()+" e "+c3.getOp2()+" é "+c3.subtrair());
		
		c4 = new Calculadora();
		c4.setOp1(6);
		c4.setOp2(3);
		System.out.println("o valor da multiplicação de "+ c4.getOp1()+" e "+c4.getOp2()+" é "+c4.multiplicar());
		
	}

}
