import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class WriterThread extends Thread {
    private PipedOutputStream output;

    public WriterThread(PipedOutputStream output) {
        this.output = output;
    }

    public void run() {
        try {
            String message = "Hello from Writer Thread!";
            output.write(message.getBytes());
            output.close(); // Important: close to signal EOF
        } catch (IOException e) {
            System.err.println("WriterThread IOException: " + e.getMessage());
        }
    }
}

class ReaderThread extends Thread {
    private PipedInputStream input;

    public ReaderThread(PipedInputStream input) {
        this.input = input;
    }

    public void run() {
        try {
            int data;
            System.out.print("Reader received: ");
            while ((data = input.read()) != -1) {
                System.out.print((char) data);
            }
            input.close();
        } catch (IOException e) {
            System.err.println("ReaderThread IOException: " + e.getMessage());
        }
    }
}

public class PipedStreamExample {
    public static void main(String[] args) {
        try {
            PipedOutputStream output = new PipedOutputStream();
            PipedInputStream input = new PipedInputStream(output); // Connect the streams

            WriterThread writer = new WriterThread(output);
            ReaderThread reader = new ReaderThread(input);

            writer.start();
            reader.start();

            writer.join();
            reader.join();

        } catch (IOException | InterruptedException e) {
            System.err.println("Main Exception: " + e.getMessage());
        }
    }
}