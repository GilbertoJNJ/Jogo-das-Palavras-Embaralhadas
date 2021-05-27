package BancoDePalavras;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class BancoDePalavras {
	
	private ArrayList<String> palavra = new ArrayList<>();
	
	public String ler() {
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("Arquivo/Strings.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String linha;
		
		try {
			while((linha = br.readLine()) != null) {
				palavra.add(linha);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Random r = new Random();
		int n = r.nextInt(palavra.size());
		String p = palavra.get(n);
		
		return p;
	}

}
