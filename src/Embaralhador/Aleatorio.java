package Embaralhador;

import java.util.ArrayList;
import java.util.Collections;
import BancoDePalavras.BancoDePalavras;

public class Aleatorio implements Embaralhador {
	
	private BancoDePalavras bdp = new BancoDePalavras();
	private String string = bdp.ler();
	private String newString = "";
	
	@Override
	public String embaralhar() {
		
		ArrayList<Character> embaralhada = new ArrayList<>();
		
		for(int i=0; i<string.length(); i++) {
			char c = string.charAt(i);
			embaralhada.add(c);
		}
		
		Collections.shuffle(embaralhada);
		
		for(int i=0; i<string.length(); i++) {
			newString=newString+embaralhada.get(i);
		}
		
		return newString;
		
	}

	@Override
	public boolean igual(String s) {
		if(getString().equals(s)) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String getString() {
		return this.string;
	}

}
