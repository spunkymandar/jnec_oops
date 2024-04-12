package networking;

import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) {
        int port = 12345;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started and listening on port " + port);
            
            Socket clientSocket = serverSocket.accept(); // Await client connection
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            
            out.println("Hello from the server side!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
