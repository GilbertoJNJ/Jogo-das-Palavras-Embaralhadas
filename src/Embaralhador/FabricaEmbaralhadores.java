package Embaralhador;

import java.util.Random;

public class FabricaEmbaralhadores {

	public Embaralhador tipo() {

		Embaralhador e;
		
		Random r = new Random();
		int n = r.nextInt(100);
		if(n<50) {
			e = new Aleatorio();
		}else {
			e = new ParImpar();
		}
		return e;
	}
}
