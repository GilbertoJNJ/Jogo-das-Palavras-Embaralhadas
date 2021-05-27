import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Embaralhador.Embaralhador;
import Embaralhador.ParImpar;

class TesteParImpar {
	
	Embaralhador e = new ParImpar();
	
	@Test
	void testRecebeuPalavraDoBancoDeDados() {
		assertNotNull(e.getString());
	}
	
	@Test
	void testEmbaralhar() {
		assertNotEquals(e.embaralhar(),e.getString());
	}

}
