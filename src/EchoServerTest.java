import org.junit.Test;
import static org.junit.Assert.*;

public class EchoServerTest {

    @Test
    public void printMessageToConsole() {
        FakeConsole fakeConsole = new FakeConsole();
        EchoServer echoServer = new EchoServer(fakeConsole);
        echoServer.print("hello");
        assertEquals("hello", fakeConsole.messagePrinted());
    }
}