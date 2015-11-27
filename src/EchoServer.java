public class EchoServer {

    private final Console console;

    public EchoServer(Console console) {
        this.console = console;
    }

    private void print(String message) {
       console.print(message);
    }

    private String readUserInput() {
        return console.read();
    }

    public void run() {
        String userInput = "";

        while (!userInput.equals("exit")) {
            userInput = readUserInput();

            if (!userInput.equals("exit")) {
                print(userInput);
            }
        }
    }
}
