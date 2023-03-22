package n1exercici1;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ ValidateLlargadaLlistaTest.class, ValidateLlistaNull.class, ValidateTest.class })
public class AllTests {

}
