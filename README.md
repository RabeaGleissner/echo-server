# Echo Server

The console reads user input and prints it to the console. 

In order to use TDD to develop this application, I created a FakeConsole class as a test double. The FakeConsole class has read() and print() methods that call helper methods. These helper methods update a variable rather than actually reading or writing to and from the console. The tests can then assert that the variables have the correct values.

Both the FakeConsole and the RealConsole class implement the interface Console which includes the read() and print() methods. The main logic is in the EchoServer class which receives the interface when it is initialised.

## How to run...

#### ..the tests

- Open files in IntelliJ. 
- Click green play button in EchoServerTest.java.

#### ...the application

- Open files in IntelliJ.
- Click console window button in Main.java to run.
- You will see nothing in the console.
- Type a word and it will be printed to the console.
- Type the word exit and the application stops running.

