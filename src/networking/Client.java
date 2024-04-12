package networking;

//TCP/IP Client program                                                        
import java.io.*;                                                               
import java.net.*;                                                              
class Client                                                                    
{                                                                               
     public static void main(String args[])throws Exception                  
     {                                                                       
             String line, newLine;                                           
             try                                                             
             {                                                               
                     DataInputStream in=new DataInputStream(System.in);      
                     // Communication Endpoint for client and server         
                     Socket cs=new Socket("LocalHost",6789);                 
                     System.out.println("Client Started...");          
                     // DataInputStream to read data from input stream       
                     DataInputStream inp=new DataInputStream (cs.getInputStream());
                     // DataOutputStream to write data on outut stream   
                     DataOutputStream out=new DataOutputStream(cs.getOutputStream());
                     while(true) {                                           
                      newLine = in.readLine();                               
                      if (newLine.equals("q")) {  
                    	  out.writeBytes("Client is down..." +'\n');          
                          return;                                             
                       } else {                                               
                         out.writeBytes(newLine + '\n');                      
                       }                                                      
                       line = inp.readLine();                                 
                       System.out.println("Received from server: "+line);     
                      }                                                       
              }                                                               
              catch(Exception e)                                              
              {                                                               
              }                                                               
      }                                                                       
}     
                    