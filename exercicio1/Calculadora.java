package exercicio1;

public class Calculadora {
	int op1,
		op2,
		resultado;
	
	public Calculadora(int a, int b) {
		op1 = a;
		op2 = b;
	}
	public Calculadora() {
		
	}
		
	void setOp1(int op) {
		op1 = op;
	}
	void setOp2(int op) {
		op2 = op;
	}
	int getResultado() {
		return resultado;
	}
	int getOp1() {
		return op1;
	}
	int getOp2() {
		return op2;
	}
	int somar() {
		resultado = op1+op2;
		return resultado;
	}
	int subtrair() {
		resultado = Math.abs(op1-op2);
		return resultado;
	}
	int multiplicar() {
		resultado = op1*op2;
		return resultado;
	}
	float dividir() {
		resultado = op1/op2;
		return resultado;
	}

}
