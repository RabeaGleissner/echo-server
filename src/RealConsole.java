import java.io.InputStream;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class RealConsole implements Console {

    public void print(String message) {
        System.out.println(message);
    }

    public String read() {
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }
}
