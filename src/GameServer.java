import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class GameServer {
    public static void main(String[] args) {
        Runnable threadjob = new GameClient();
        Thread mythread = new Thread(threadjob);
        mythread.start();
        System.out.println("started client");
        GameServer game = new GameServer();
        game.serverstart();
        System.out.println("stopped server");
    }

    public void serverstart() {
        try {
            ServerSocket server = new ServerSocket(5000);

            while (true) {
                Socket sock = server.accept();
                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String message = "hello";
                writer.println(message);
                writer.close();
                System.out.println("sent: " + message);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
