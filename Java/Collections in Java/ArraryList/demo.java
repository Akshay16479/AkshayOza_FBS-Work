package Arraylist;
import java.util.*;

public class demo {
	public static void main(String[] args) {
		   		ArrayList<Integer> a1=new ArrayList <Integer>();
		   		a1.add(10);
		   		a1.add(30);
		   		a1.add(20);    //add
		   		a1.add(70);
		   		a1.remove(3);    //remove
		   		System.out.println(a1);
		   		
		   		if(a1.contains(30))        //contains
		   		{
		   			System.out.println("FOUND");
		   		}
		   		else
		   		{
		   			System.out.println("NOT FOUND");
		   		}
		   		
		   		
	}
	
//arraylist me sort nhi krega wo as it sequence me dikhayega data	

}
