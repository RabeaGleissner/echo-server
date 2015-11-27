public class FakeConsole {
    private String printedMessage;
    private String userInput;

    public FakeConsole() {
        printedMessage = "";
        userInput = "";
    }

    public String messagePrinted() {
        return printedMessage;

    }

    public void print(String message) {
        printedMessage = message;
    }

    public String read() {
        return userInput;
    }

    public void provideConsoleInput(String message) {
        userInput = message;
    }
}
