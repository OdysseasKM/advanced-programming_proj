package gr.upatras.junit.proj;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyClassTest {
	
	@Test
	void testSubtract() {
		MyClass tester = new MyClass();
		assertEquals("POSITIVE", tester.subtract(15, 5), "15 - 5 must show Positive");
	}
	
	@Test
	void testSubtractneg() {
		MyClass tester = new MyClass();
		assertEquals("NEGATIVE", tester.subtract(5, 15), "5 - 15 must show NEGATIVE");
	}
	
	@Test
	void testSubtractzero() {
		MyClass tester = new MyClass();
		assertEquals("ZERO", tester.subtract(15, 15), "15 - 15 must show ZERO");
	}
}
