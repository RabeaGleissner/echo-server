public class Main {
    public static void main(String[] args) {
        EchoServer echoServer = new EchoServer(new RealConsole());
        echoServer.run();
    }
}
