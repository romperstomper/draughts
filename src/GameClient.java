import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.net.Socket;

public class GameClient implements Runnable{
    public void run() {
        try {
            listen();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void listen() throws IOException, InterruptedException {
        Thread.sleep(1000);
        Socket sock = new Socket("127.0.0.1", 5000);
        System.out.println("client socket created");
        InputStreamReader isr = new InputStreamReader(sock.getInputStream());
        BufferedReader reader = new BufferedReader(isr);
        String message = reader.readLine();
        System.out.println("message read: " + message);
        sock.close();
        System.out.println("listen socket closed");
    }
}
