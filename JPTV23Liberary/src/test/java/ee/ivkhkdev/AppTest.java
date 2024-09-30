package ee.ivkhkdev;

import ee.ivkhkdev.interfaces.Input;
import ee.ivkhkdev.model.Customer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class AppTest {
    private Input inputMock;
    private ByteArrayOutputStream outContent;
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        inputMock = Mockito.mock(Input.class);
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testExitProgram() {
        when(inputMock.nextInt()).thenReturn(0);

        App app = new App(inputMock);
        app.run();

        assertTrue(outContent.toString().contains("bye"));
    }

    @Test
    public void testInvalidTaskNumber() {
        when(inputMock.nextInt()).thenReturn(99, 0);

        App app = new App(inputMock);
        app.run();

        assertTrue(outContent.toString().contains("Invalid task number"));
    }

    @Test
    public void testInvalidNumber() {
        when(inputMock.nextInt()).thenReturn(5, 0);

        App app = new App(inputMock);
        app.run();

        assertTrue(outContent.toString().contains("Please pick something valid"));
    }

    @Test
    public void testAddCustomer() {
        when(inputMock.nextInt()).thenReturn(1, 0);

        App app = new App(inputMock);
        Customer expected = new Customer("Иван", "Иваноа", "34256476");
        app.run();

        assertTrue(outContent.toString().contains("Customer Ivan added") && outContent.toString().contains("bye"));
    }

    private String normalizeString(String input) {
        return input.trim().replaceAll("\r\n", "Иван").replaceAll("\\s+$", ""); // Adjusted regex
    }
}
