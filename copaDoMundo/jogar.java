package copaDoMundo;

public class jogar {

	public static void main(String[] args) {
		Selecao S[] = new Selecao[4];
		
//		Jogador teste = new Jogador("Fuleiro", 20, "nao sabe");
//		Selecao testeS = new Selecao();
//		testeS.cadastrarJogador(teste);
		
		Jogador B[] = new Jogador[5];
		B[0] = new Jogador("Paulo", 10, "atacante");
		B[1] = new Jogador("Andre", 8, "meio de campo");
		B[2] = new Jogador("Felipe", 4, "zagueiro");
		B[3] = new Jogador("Marcia", 6, "lateral");
		B[4] = new Jogador("Charle", 1, "goleiro");
		S[0] = new Selecao("Brasil", B, "amarela", 5);
		
		
		Jogador A[] = new Jogador[5];
		A[0] = new Jogador("Paulo", 10, "atacante");
		A[1] = new Jogador("Andre", 8, "meio de campo");
		A[2] = new Jogador("Felipe", 4, "zagueiro");
		A[3] = new Jogador("Marcia", 6, "lateral");
		A[4] = new Jogador("Charle", 1, "goleiro");
		S[1] = new Selecao("Argentina", A, "branca", 7);
		
		
		Jogador C[] = new Jogador[5];
		C[0] = new Jogador("Paulo", 10, "atacante");
		C[1] = new Jogador("Andre", 8, "meio de campo");
		C[2] = new Jogador("Felipe", 4, "zagueiro");
		C[3] = new Jogador("Marcia", 6, "lateral");
		C[4] = new Jogador("Charle", 1, "goleiro");
		S[2] = new Selecao("Canada", C, "vermelha", 10);
		
		
		Jogador I[] = new Jogador[5];
		I[0] = new Jogador("Paulo", 10, "atacante");
		I[1] = new Jogador("Andre", 8, "meio de campo");
		I[2] = new Jogador("Felipe", 4, "zagueiro");
		I[3] = new Jogador("Marcia", 6, "lateral");
		I[4] = new Jogador("Charle", 1, "goleiro");
		S[3] = new Selecao("Italia", I, "azul", 5);
		
		Grupo AA = new Grupo("A", S);
//		System.out.println(AA.nome);
//		System.out.println(AA.S[0].J[0].nome);
		Partida p1 = new Partida("A1", 1, S[0], S[2]);
		p1.autorizarPartida(S[0], S[2]);
		p1.resultado();
		Partida p2 = new Partida("A1", 1, S[1], S[3]);
		p2.resultado();
		Partida p3 = new Partida("A1", 1, S[0], S[1]);
		p3.resultado();
		Partida p4 = new Partida("A1", 1, S[3], S[2]);
		p4.resultado();
		Partida p5 = new Partida("A1", 1, S[3], S[0]);
		p5.resultado();
		Partida p6 = new Partida("A1", 1, S[2], S[1]);
		p6.resultado();
		
		System.out.println(AA.S[0].getPontuacao());
		System.out.println(AA.S[1].getPontuacao());
		System.out.println(AA.S[2].getPontuacao());
		System.out.println(AA.S[3].getPontuacao());
		
		
			
		
	}

}
