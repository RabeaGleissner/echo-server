import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EchoServerTest {

    private EchoServer echoServer;
    private FakeConsole fakeConsole;

    @Before
    public void setup() {
        fakeConsole = new FakeConsole();
        echoServer = new EchoServer(fakeConsole);
    }

    @Test
    public void printMessageToConsole() {
        echoServer.print("hello");
        assertEquals("hello", fakeConsole.messagePrinted());
    }

    @Test
    public void readConsoleInput() {
        fakeConsole.provideConsoleInput("hola");
        assertEquals("hola", echoServer.readUserInput());
    }

    @Test
    public void printInputGivenByConsole() {
        fakeConsole.provideConsoleInput("alright");
        echoServer.run();
        assertEquals("alright", fakeConsole.messagePrinted());
    }
}