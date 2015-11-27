import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FakeConsole implements Console {
    private String printedMessage;
    private List<String> userInput;
    private int printMethodCalls;
    private int readMethodCalls;


    public FakeConsole() {
        printedMessage = "";
        userInput = new ArrayList<>();
        printMethodCalls = 0;
        readMethodCalls = 0;
    }

    public String messagePrinted() {
        return printedMessage;
    }

    public void print(String message) {
        printMethodCalls++;
        printedMessage += message;
    }

    public String read() {
        readMethodCalls++;
        return userInput.remove(0);
    }

    public void provideConsoleInput(String ... message) {
        userInput.addAll(Arrays.asList(message));
    }

    public int countPrintMethodCalls() {
        return printMethodCalls;
    }

    public int countReadMethodCalls() {
        return readMethodCalls;
    }
}
