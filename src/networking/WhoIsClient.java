package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;

public class WhoIsClient {

    public static void main(String[] args) throws IOException {

    	try (Socket socket = new Socket()) {
    	    socket.connect(new InetSocketAddress("google.com", 80));
    	    String localIpAddress = socket.getLocalAddress().getHostAddress();
    	    System.out.println("Local IP address: " + localIpAddress);
    	    
    	    InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("System IP Address : " +
                          (localhost.getHostAddress()).trim());
            
            
    	} catch (IOException e) {
    	    e.printStackTrace();
    	}
    	
    }
}