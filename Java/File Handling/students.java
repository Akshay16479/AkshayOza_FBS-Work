package practiceworkjava;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class students implements Serializable {
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
	public static void main1(String[] args) {                //write wala code
		try {
			FileOutputStream fos=new FileOutputStream("mydata.txt");
			DataOutputStream dos=new DataOutputStream(fos);
			ObjectOutputStream oos=new ObjectOutputStream(dos);
			oos.writeObject(new students(101,"akshay"));
			System.out.println("written successfully !!!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void main2(String[] args) {                    //read wala code
		try {
			FileInputStream fis=new FileInputStream("mydata.txt");
			DataInputStream dis=new DataInputStream(fis);
			ObjectInputStream ois=new ObjectInputStream(dis);
			students s1=(students) ois.readObject();
			System.out.println(s1);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}	
}

