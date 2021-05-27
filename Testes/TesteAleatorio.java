import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Embaralhador.Aleatorio;
import Embaralhador.Embaralhador;

class TesteAleatorio {

	Embaralhador e = new Aleatorio();
	
	@Test
	void testRecebeuPalavraDoBancoDeDados() {
		assertNotNull(e.getString());
	}
	
	@Test
	void testEmbaralhar() {
		assertNotEquals(e.embaralhar(),e.getString());
	}

	
}
