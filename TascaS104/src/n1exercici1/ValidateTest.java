package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateTest {

	@Test
	void test() {
		
		LlistaMesos llistaTest = new LlistaMesos();
		assertEquals(12, llistaTest.getLlistaMesos().size());
	}

}
