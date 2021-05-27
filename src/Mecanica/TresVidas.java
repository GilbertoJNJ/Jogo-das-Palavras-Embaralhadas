package Mecanica;

import java.util.Scanner;

import Embaralhador.Embaralhador;
import Embaralhador.FabricaEmbaralhadores;

public class TresVidas implements MecanicaDoJogo {

	private int pontos = 0;
	private int contador = 3;
	
	@Override
	public void start() {
		
		System.out.println("----- Modo de Jogo: Três Vidas -----");
		andamento();
		
	}

	@Override
	public void gameOver() {
		contador--;
		if(contador==0) {
			System.out.println("FIM DE JOGO");
			System.out.println("Pontuação: "+getPontos());
		}else {
			System.out.println("Tentativas: " + contador);
			System.out.println(" ");
			andamento();
		}
		
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
