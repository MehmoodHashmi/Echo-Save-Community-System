package entities;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
 
class CollectorTest {

	@Test
	void testCollectorAddress() {

		String address = new String("wah cant");
		assertEquals(address, "wah cant");

	}

	@Test
	void testCollectorPassword() {

		Collector collector = Collector.collectorFactory("12345", "Mehmood ur rehman");

		assertArrayEquals(collector.getUserNameAndPassword().getPassword(), "12345".toCharArray());

	} 
	
	@Test
	void testCollectorName() {

		Collector collector = Collector.collectorFactory("12345", "Mehmood ur rehman");

		assertEquals(collector.getUserNameAndPassword().getUserName(), "Mehmood ur rehman");

	}
}
