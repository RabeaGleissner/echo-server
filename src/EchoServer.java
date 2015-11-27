public class EchoServer {

    private static final String QUIT_COMMAND = "exit";
    private final Console console;

    public EchoServer(Console console) {
        this.console = console;
    }

    public void run() {
        String userInput = "";

        while (userWantsToContinue(userInput)) {
            userInput = readUserInput();

            if (userWantsToContinue(userInput)) {
                print(userInput);
            }
        }
    }
    private void print(String message) {
       console.print(message);
    }

    private String readUserInput() {
        return console.read();
    }

    private boolean userWantsToContinue(String userInput) {
        if (userInput.equals(QUIT_COMMAND)) {
            return false;
        }
        return true;
    }

}
