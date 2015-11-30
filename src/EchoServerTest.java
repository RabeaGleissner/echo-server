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
    public void printInputGivenByConsole() {
        fakeConsole.provideConsoleInput("alright", "exit");
        echoServer.run();
        assertEquals("alright", fakeConsole.messagePrinted());
    }

    @Test
    public void printNothingIfUserTypesExit() {
        fakeConsole.provideConsoleInput("exit");
        echoServer.run();
        assertEquals("", fakeConsole.messagePrinted());
    }

    @Test
    public void keepPromptingUserUntilExit() {
        fakeConsole.provideConsoleInput("hola", "hello", "exit");
        echoServer.run();
        assertEquals("holahello", fakeConsole.messagePrinted());
    }

    @Test
    public void printsAllWordsOnALine() {
        fakeConsole.provideConsoleInput("here are several words", "exit");
        echoServer.run();
        assertEquals("here are several words", fakeConsole.messagePrinted());
    }

    @Test
    public void printMethodCalledSeveralTimes() {
        fakeConsole.provideConsoleInput("hola", "hello", "hallo", "exit");
        echoServer.run();
        assertEquals(3, fakeConsole.countPrintMethodCalls());
    }

    @Test
    public void countReadMethodCalls() {
        fakeConsole.provideConsoleInput("hola", "hello", "ni hao", "exit");
        echoServer.run();
        assertEquals(4, fakeConsole.countReadMethodCalls());
    }
}