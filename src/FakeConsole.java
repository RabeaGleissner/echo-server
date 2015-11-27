import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FakeConsole {
    private String printedMessage;
    private List<String> userInput;

    public FakeConsole() {
        printedMessage = "";
        userInput = new ArrayList<>();
    }

    public String messagePrinted() {
        return printedMessage;

    }

    public void print(String message) {
        printedMessage += message;
    }

    public String read() {
        return userInput.remove(0);
    }

    public void provideConsoleInput(String ... message) {
        userInput.addAll(Arrays.asList(message));
    }
}
