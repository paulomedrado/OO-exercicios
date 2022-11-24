package exercicio2;

public class Palindromo {
	String str;
	int tamanho;
	boolean resultado;
	
	public Palindromo(String texto) {
		str = texto;
	}
	public Palindromo() {
		
	}
	void setStr(String txt) {
		str = txt;
	}
	String getStr() {
		return str;
	}
	int contarVogais() {
		int numVogais = 0;
        
        str.toLowerCase();
        
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                numVogais++;
        }
        
        return numVogais;
	}
	String inverso() {
		String inv = "";
        
		String str2 = str.toLowerCase();
        
        for (int i = 0; i < str.length(); i++){
            char c = str2.charAt(i);
            inv=c+inv;
        }
        
        return inv;
	}
        
//    boolean resultado() {
//    	
//    	boolean resposta = false;
//    	for (int i = 0; i < (str.length()-1)/2; i++) {
//    		if (str.charAt(i)==str.charAt(str.length()-1-i)) {
//    			resposta = true;
//    		} else {
//    			resposta = false;
//    		}
//    	
//    	return resposta;
//    	}
//    	
//    }
	String resultado() {
		int num = 0;
		String resposta = "";
		
		String str1 = str.toLowerCase();
		
		for (int i = 0; i < (str.length()-1)/2; i++) {
			if (str1.charAt(i)==str1.charAt(str.length()-1-i))
				num++;
		}
		if (num==(str.length()-1)/2)
			resposta = "Sim, é um palindromo";
		else
			resposta = "Não é um palindromo";
		return resposta;
	}

}
