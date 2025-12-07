package Treeset;
import java.util.*;

public class demo {
	public static void main(String[] args) {
		   		TreeSet<Integer> a1=new TreeSet<Integer> (); //check that only integer type data must go inside
		   		a1.add(10);
		   		a1.add(30);
		   		a1.add(20);    //add
		   		a1.add(70);
		   		a1.remove(70);    //remove
		   		System.out.println(a1);
		   		
		   		if(a1.contains(30))        //contains
		   		{
		   			System.out.println("FOUND");
		   		}
		   		else
		   		{
		   			System.out.println("NOT FOUND");
		   		} 
		   	//treeset me sort krega wo and then dikhayega data	

	}
}