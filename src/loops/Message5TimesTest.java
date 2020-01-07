package loops;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class Message5TimesTest {

	
	@Test
	void message5TimesTest() {
		assertEquals(5,Message5Times.message5Times("Message"));
	}
	/*
	 * Below from https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println/21216342#21216342 
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void restoreStreams() {
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	}
	
	@Test
	public void out() {
	    System.out.print("hello");
	    assertEquals("hello", outContent.toString());
	}

	@Test
	public void err() {
	    System.err.print("hello again");
	    assertEquals("hello again", errContent.toString());
	}
*/
}
