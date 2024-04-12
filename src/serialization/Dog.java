package serialization;

public class Dog extends Animal{
	void sleep() {
		
	}
	public static void main(String[] args) {
		Animal d=new Dog();
		d.talk();
		d.sleep();
	}
}
