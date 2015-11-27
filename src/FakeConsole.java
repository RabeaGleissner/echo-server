import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FakeConsole {
    private String printedMessage;
    private List<String> userInput;
    private int printMethodCalls;

    public FakeConsole() {
        printedMessage = "";
        userInput = new ArrayList<>();
        printMethodCalls = 0;
    }

    public String messagePrinted() {
        return printedMessage;
    }

    public void print(String message) {
        printMethodCalls++;
        printedMessage += message;
    }

    public String read() {
        return userInput.remove(0);
    }

    public void provideConsoleInput(String ... message) {
        userInput.addAll(Arrays.asList(message));
    }

    public int countPrintMethodCalls() {
        return printMethodCalls;
    }
}
