package practiceworkjava;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class students implements Serializable{
	int roll;
	String name;
	public students(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	@Override
	public String toString() {
		return "students [roll=" + roll + ", name=" + name + "]";
	}
	
}

class teststud{
	public static void main1(String[] args) {            //write code
		
		try {
			FileOutputStream fos =new FileOutputStream("mydataa.txt");
			DataOutputStream dos =new DataOutputStream(fos);
			ObjectOutputStream oos=new ObjectOutputStream(dos);
			oos.writeObject(new students(777,"thala"));
			System.out.println("written successfully !");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {                      //read code
		
		try {
			FileInputStream fis=new FileInputStream("mydataa.txt");
			DataInputStream dis=new DataInputStream(fis);
			ObjectInputStream ois=new ObjectInputStream(dis);
			students s1 =(students) ois.readObject();
			System.out.println(s1);

			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}



