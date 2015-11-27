public class EchoServer {

    private final FakeConsole fakeConsole;

    public EchoServer(FakeConsole fakeConsole) {
        this.fakeConsole = fakeConsole;
    }

    private void print(String message) {
       fakeConsole.print(message);
    }

    private String readUserInput() {
        return fakeConsole.read();
    }

    public void run() {
        String userInput = "";
        userInput = readUserInput();

        if (!userInput.equals("exit")) {
            print(userInput);
        }
    }
}
