package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Employee emp = new Employee("Alan","Doe","JohnDoe123");
			/*
			 * 1. create the object of the serializable class
			 * 2. Open the file in the write mode
			 * 3. Create objectoutputstream and pass the object 
			 */
			FileOutputStream fos=new FileOutputStream("emp.dat");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empInfo.ser"));
		   
		  
		   //Serialize the object
		   oos.writeObject(emp);
		   oos.close();
		   System.out.println("Object serialized");
		} catch (Exception e)
		{
		   System.out.println(e);
		}

	}

}
