public class EchoServer {

    private final FakeConsole fakeConsole;

    public EchoServer(FakeConsole fakeConsole) {
        this.fakeConsole = fakeConsole;
    }

    public void print(String message) {
       fakeConsole.print(message);
    }
}
