public class EchoServer {

    private static final String QUIT_COMMAND = "exit";
    private final Console console;

    public EchoServer(Console console) {
        this.console = console;
    }

    public void run() {

        while (true) {
            String userInput = readUserInput();

            if (userWantsToExit(userInput)) {
                break;
            }
            print(userInput);
        }
    }

    private void print(String message) {
        console.print(message);
    }

    private String readUserInput() {
        return console.read();
    }

    private boolean userWantsToExit(String userInput) {
        return userInput.equals(QUIT_COMMAND);
    }

}
