package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateLlistaNull {

	@Test
	void test() {
		LlistaMesos llistaTest = new LlistaMesos();
		assertNotEquals(null, llistaTest.getLlistaMesos());
	}

}
