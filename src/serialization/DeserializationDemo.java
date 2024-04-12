package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fis=new FileInputStream("emp.dat");
			
		   ObjectInputStream ooi = new ObjectInputStream(fis);
		   //Read the object back
		   Employee readEmpInfo = (Employee)ooi.readObject();
		   System.out.println(readEmpInfo.getFirstName());
		   System.out.println(readEmpInfo.getLastName());
		   System.out.println(readEmpInfo.getConfidentialInfo());
		   ooi.close();
		} catch (Exception e)
		{
		   System.out.println(e);
		}
	}

}
