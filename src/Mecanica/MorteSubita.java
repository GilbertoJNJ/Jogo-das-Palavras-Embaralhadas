package Mecanica;

import java.util.Scanner;

import Embaralhador.Embaralhador;
import Embaralhador.FabricaEmbaralhadores;

public class MorteSubita implements MecanicaDoJogo {

	private int pontos = 0;
	
	@Override
	public void start() {

		System.out.println("----- Modo de Jogo: Morte Subita -----");
		andamento();
	}

	@Override
	public void gameOver() {
		System.out.println("FIM DE JOGO");
		System.out.println("Pontua??o: "+getPontos());
		
	}

	@Override
	public int getPontos() {
		return pontos;
	}
	
	@Override
	public void andamento() {
		
		FabricaEmbaralhadores fe = new FabricaEmbaralhadores();
		Embaralhador e = fe.tipo();
		System.out.println(e.embaralhar());
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		if(e.igual(s)) {
			pontos += 100;
			System.out.println("ACERTOU!");
			System.out.println(" ");
			andamento();
		}else {
			gameOver();
		}
		
		sc.close();
		
	}

}
