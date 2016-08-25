package numeros;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConversaoTest {
	
	@Test
	public void converteNumeroInferiorOuIgualA3() {
		Conversao c=new Conversao();
		assertEquals("III", c.converte(3));
		
	}
	
	@Test
	public void converteSuperiorQue3InferiorOuIgual5(){
		Conversao c=new Conversao();
		assertEquals("V", c.converte(5));
	}
	
	@Test
	public void converteSuperiorQue5eMenorOuIgual8(){
		Conversao c=new Conversao();
		assertEquals("VIII", c.converte(8));
		
	}
	
	@Test
	public void converteSuperiorQue8Inferior10(){
		Conversao c=new Conversao();
		assertEquals("X", c.converte(10));
	}
	
	@Test(expected=RuntimeException.class)
	public void naoDeveAceitarNumerosNegativos(){
		Conversao c=new Conversao();
		c.converte(-1);
	}

	@Test
	public void converteSuperiorQue10EMultiploDe10(){
		Conversao c=new Conversao();
		assertEquals("XX", c.converte(20));
	}
	
	@Test
	public void converteSuperiorQue10Inferior30(){
		Conversao c=new Conversao();
		assertEquals("XXIV", c.converte(24));
	}
	
	@Test
	public void converteSuperiorQue30InferiorQue50(){
		Conversao c=new Conversao();
		assertEquals("XLIX", c.converte(49));
	}
	
	@Test
	public void converteSuperiorQue50Inferior80(){
		Conversao c=new Conversao();
		assertEquals("LXXVII", c.converte(77));
	}
	
	@Test
	public void converteSuperiorA80InferiorOuIgualA100(){
		Conversao c=new Conversao();
		assertEquals("XCVI", c.converte(96));
		assertEquals("C", c.converte(100));
		
	}
}
