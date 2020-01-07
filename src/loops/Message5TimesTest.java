package loops;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Message5TimesTest {

	@Test
	void test() {
		assertEquals("Message", Message5Times.message5Times("Message"));
	}

}
