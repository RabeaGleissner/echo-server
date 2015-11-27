public class EchoServer {

    private final FakeConsole fakeConsole;

    public EchoServer(FakeConsole fakeConsole) {
        this.fakeConsole = fakeConsole;
    }

    public void print(String message) {
       fakeConsole.print(message);
    }

    public String readUserInput() {
        return fakeConsole.read();
    }

    public void run() {
        print(readUserInput());
    }
}
