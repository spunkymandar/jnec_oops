package serialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 
class Customer implements Serializable {
 
    // member variables for Customer
    transient int customerId;
    String customerName;
    transient String customerSSN;
 
    // 3-arg parameterized constructor for Customer
    public Customer(int customerId, String customerName,
            String customerSSN) {
        super();
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerSSN = customerSSN;
    }
 
    // to print nicely - customer object
    @Override
    public String toString() {
        return "Customer ["
                + "customerId=" + customerId
                + ", customerName=" + customerName
                + ", customerSSN=" + customerSSN
                + "]";
    }
 
    /**
     * this method invoked automatically during serialization process
     *
     * @param objectOutputStream
     * @throws Exception
     */
    private void writeObject(ObjectOutputStream objectOutputStream)
            throws Exception {
 
        // 1st do, save using default serialization for all objects
        objectOutputStream.defaultWriteObject();
 
        // temp variable
        int tempCustId = 333 + customerId;
        String tempCustSSN = "Test" + customerSSN;
 
        // saving customer Id and SSN, in encrypted version
        objectOutputStream.writeInt(tempCustId);
        objectOutputStream.writeObject(tempCustSSN);
    }
 
    /**
     * this method invoked automatically during de-serialization process
     *
     * @param objectInputStream
     * @throws Exception
     */
    private void readObject(ObjectInputStream objectInputStream)
            throws Exception {
 
        // 1st do, restore using default de-serialization for all objects
        objectInputStream.defaultReadObject();
 
        // temp variable
        int tempCustId = objectInputStream.readInt();
        String tempCustSSN = objectInputStream.readObject().toString();
 
        // decrypting and restoring transient variables
        customerId = tempCustId - 333;
        customerSSN = tempCustSSN.substring(4);
    }
}