package numeros;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConversaoTest {
	
	@Test
	public void converteNumeroInferiorOuIgualA3() {
		Conversao c=new Conversao();
		assertEquals("III", c.converteUnidades(3));
		
	}
	
	@Test
	public void converteSuperiorQue3InferiorOuIgual5(){
		Conversao c=new Conversao();
		assertEquals("V", c.converteUnidades(5));
	}
	
	@Test
	public void converteSuperiorQue5eMenorOuIgual8(){
		Conversao c=new Conversao();
		assertEquals("VIII", c.converteUnidades(8));
		
	}
	
	@Test
	public void converteSuperiorQue8Inferior10(){
		Conversao c=new Conversao();
		assertEquals("X", c.converteUnidades(10));
	}
	
	@Test(expected=RuntimeException.class)
	public void naoDeveAceitarNumerosNegativos(){
		Conversao c=new Conversao();
		c.converteUnidades(-1);
	}

}
