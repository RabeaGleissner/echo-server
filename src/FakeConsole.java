public class FakeConsole {
    private String printedMessage;

    public FakeConsole() {
        printedMessage = "";
    }

    public String messagePrinted() {
        return printedMessage;

    }

    public void print(String message) {
        printedMessage = message;
    }
}
