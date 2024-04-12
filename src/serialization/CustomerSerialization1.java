package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
 
public class CustomerSerialization1 {
 
    public static void main(String[] args) {
 
        // create an customer object using 4-arg constructor
        Customer1 serializeCustomer =
                new Customer1(102, "NK", 19, "SSN-78087");
 
        // creating output stream variables
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
 
        // creating input stream variables
        FileInputStream fis = null;
        ObjectInputStream ois = null;
 
        // creating customer object reference
        // to hold values after de-serialization
        Customer1 deSerializeCustomer = null;
 
        try {
            // for writing or saving binary data
            fos = new FileOutputStream("Customer.ser");
 
            // converting java-object to binary-format
            oos = new ObjectOutputStream(fos);
 
            // writing or saving customer object's value to stream
            oos.writeObject(serializeCustomer);
            oos.flush();
            oos.close();
 
            System.out.println("Externalization: "
                    + "Customer object saved to Customer.ser file\n");
 
            // reading binary data
            fis = new FileInputStream("Customer.ser");
 
            // converting binary-data to java-object
            ois = new ObjectInputStream(fis);
 
            // reading object's value and casting to Customer class
            deSerializeCustomer = (Customer1) ois.readObject();
            ois.close();
 
            System.out.println("Externalization: Customer object "
                    + "de-serialized from Customer.ser file\n");
        }
        catch (FileNotFoundException fnfex) {
            fnfex.printStackTrace();
        }
        catch (IOException ioex) {
            ioex.printStackTrace();
        }
        catch (ClassNotFoundException ccex) {
            ccex.printStackTrace();
        }
 
        // printing customer object to console using toString() method
        System.out.println("Printing customer values from "
                + "de-serialized object... \n" + deSerializeCustomer);
    }
}