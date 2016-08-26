package numeros;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConversaoTest {

	@Test
	public void converteNumeroInferiorOuIgualA3() {
		Conversao c = new Conversao();
		assertEquals("III", c.converte(3));

	}

	@Test
	public void converteSuperiorQue3InferiorOuIgual5() {
		Conversao c = new Conversao();
		assertEquals("V", c.converte(5));
	}

	@Test
	public void converteSuperiorQue5eMenorOuIgual8() {
		Conversao c = new Conversao();
		assertEquals("VIII", c.converte(8));

	}

	@Test
	public void converteSuperiorQue8Inferior10() {
		Conversao c = new Conversao();
		assertEquals("X", c.converte(10));
	}

	// Testes para dezenas

	@Test(expected = RuntimeException.class)
	public void naoDeveAceitarNumerosNegativos() {
		Conversao c = new Conversao();
		c.converte(0);
	}

	@Test(expected = RuntimeException.class)
	public void naoDeveAceitarNumerosSuperioresA3999() {
		Conversao c = new Conversao();
		c.converte(4000);
	}
	
	@Test
	public void converteSuperiorQue10EMultiploDe10() {
		Conversao c = new Conversao();
		assertEquals("XX", c.converte(20));
	}

	@Test
	public void converteSuperiorQue10Inferior39() {
		Conversao c = new Conversao();
		assertEquals("XXIV", c.converte(24));
	}

	@Test
	public void converteSuperiorQue39InferiorQue59() {
		Conversao c = new Conversao();
		assertEquals("XLIX", c.converte(49));
	}

	@Test
	public void converteSuperiorQue59Inferior89() {
		Conversao c = new Conversao();
		assertEquals("LXXVII", c.converte(77));
	}

	@Test
	public void converteSuperiorA89InferiorOuIgualA100() {
		Conversao c = new Conversao();
		assertEquals("XCVI", c.converte(96));
		assertEquals("C", c.converte(100));

	}

	// Testes para centenas
	@Test
	public void superiorA100eInferiorOuIgualA399() {
		Conversao c = new Conversao();
		assertEquals("CCLIX", c.converte(259));
		assertEquals("CCCXCIX", c.converte(399));
	}

	@Test
	public void superiorA399eInferiorouIgualA599() {
		Conversao c = new Conversao();
		assertEquals("CDLXXIII", c.converte(473));
		assertEquals("DXCIX", c.converte(599));
	}
	
	@Test
	public void superiorA599eInferiorOuIgualA899() {
		Conversao c = new Conversao();
		assertEquals("DCCXXXII", c.converte(732));
		assertEquals("DCCCXCIX", c.converte(899));
	}
	
	@Test
	public void superiorA899eInferiorOuIgualA1000() {
		Conversao c = new Conversao();
		assertEquals("CMLV", c.converte(955));
		assertEquals("M", c.converte(1000));
	}

}
