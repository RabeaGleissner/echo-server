import java.util.Scanner;

public class RealConsole implements Console {

    public void print(String message) {
        System.out.println(message);
    }

    public String read() {
        Scanner user_input= new Scanner(System.in);
        return user_input.next();
    }
}
