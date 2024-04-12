package serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
 
// class implementing Externalizable interface
class Customer1 implements Externalizable {
 
    // member variables for Customer
    int customerId;
    String customerName;
    int customerAge;
    String customerSSN;
 
    // default public no-arg constructor
    public Customer1() {
        System.out.println("public no-arg constructor is must for "
                + "Externalizable, "
                + "while restoring object back from file storage");
    }
 
    // 4-arg parameterized constructor for Customer
    public Customer1(int customerId, String customerName,
            int customerAge, String customerSSN) {
        super();
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.customerSSN = customerSSN;
    }
 
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
 
        // saving to file storage
        out.writeInt(customerId);
        out.writeObject(customerName);
    }
 
    @Override
    public void readExternal(ObjectInput in)
            throws IOException, ClassNotFoundException {
 
        // restoring variables, as per order of serialization
        int tempCustId = in.readInt();
        String tempCustName = (String) in.readObject();
 
        // assigning restored values to member variables
        customerId = tempCustId;
        customerName = tempCustName;
    }
 
    // to print nicely - customer object
    @Override
    public String toString() {
        return "Customer [customerId=" + customerId
                + ", customerName=" + customerName
                + ", customerSSN=" + customerSSN
                + ", customerAge=" + customerAge
                + "]";
    }
}