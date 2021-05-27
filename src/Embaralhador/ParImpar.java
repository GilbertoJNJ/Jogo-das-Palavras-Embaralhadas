package Embaralhador;


import java.util.ArrayList;
import BancoDePalavras.BancoDePalavras;

public class ParImpar implements Embaralhador {

	private BancoDePalavras bdp = new BancoDePalavras();
	private String string = bdp.ler();
	private String newString = "";
	
	@Override
	public String embaralhar() {

		ArrayList<Character> embaralhada = new ArrayList<>();
		
		for(int i=0; i<string.length(); i+=2) {
			char c=string.charAt(i);
			embaralhada.add(c);
		}
		
		for(int i=1; i<string.length(); i+=2) {
			char c=string.charAt(i);
			embaralhada.add(c);
		}
		
		for(int i=0; i<string.length(); i++) {
			newString = newString + embaralhada.get(i).toString();
		}
		
		return newString;
		
	}

	@Override
	public boolean igual(String s) {
		if(getString().equals(s)) {
			return true;
		}else{
			return false;
		}
	}

	@Override
	public String getString() {
		return this.string;
	}

}
