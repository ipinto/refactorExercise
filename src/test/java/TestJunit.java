import org.junit.Test;

import static org.junit.Assert.*;

public class TestJunit {

    String message = "Hello World";

    @Test
    public void testPrintMessage() {
        assertEquals(message, "Hello World");
    }
}