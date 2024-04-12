package networking;

//TCP/IP Server Program                                                        
import java.io.*;
import java.net.*;

class Server {
public static void main(String args[])throws Exception                       
{                                                                            
     try                                                                     
     {                                                                       
             String line, newLine;                                           
             ServerSocket ss=new ServerSocket(6789);                         
             // Communication Endpoint for the client and server.            
             while(true)                                                     
             {                                                               
               // Waiting for socket connection                              
               Socket s=ss.accept();                                         
               System.out.println("Server Started...");                      
               // DataInputStream to read data from input stream             
               DataInputStream inp=new DataInputStream(s.getInputStream());  
               // DataOutputStream to write data on outut stream             
               DataOutputStream out = new DataOutputStream(s.getOutputStream());
               DataInputStream in=new DataInputStream(System.in);            
               // Rads a line text                                           
               while(true) {                                                 
                System.out.println("Press 'q' if you want to exit server");  
                line = inp.readLine();                                       
                // Writes in output stream as bytes                          
                //out.writeBytes(line +'\n');                                  
                System.out.println("Received from client: " + line);         
                newLine = in.readLine();                                     
                if (newLine.equals("q")) {                                   
                 out.writeBytes("Server is down..." +'\n');                  
                 return;                                                     
                } else {                                                     
                  out.writeBytes(newLine + '\n');                            
                }                                                            
               }                                                             
             }                                                               
     }                                                                       
     catch(Exception e)                                                      
     {                                                                       
                                                                             
     }
	}
}
