package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateLlargadaLlistaTest {

	@Test
	void test() {
		LlistaMesos llistaTest = new LlistaMesos();
		assertEquals("agost", llistaTest.getLlistaMesos().get(7));
	}

}
