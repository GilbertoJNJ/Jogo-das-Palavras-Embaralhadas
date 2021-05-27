package Mecanica;

import java.util.Random;

public class FabricaMecanicaDoJogo {

	public MecanicaDoJogo modo() {
		
		MecanicaDoJogo mj;
		
		Random r = new Random();
		int n = r.nextInt(100);
		if(n<50) {
			mj = new MorteSubita();
		}else {
			mj = new TresVidas();
		}
		return mj;
	}
}
