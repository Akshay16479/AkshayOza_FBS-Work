package LinearSearch;
import java.util.*;

public class demo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter size of Array");
		int n=sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter array elements");
		
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter element u want to search in array");
        int x = sc.nextInt();
			
			linearsearch(arr,x);

	}
	
	static void linearsearch(int arr[],int x)
	{
		
	int flag=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
            	flag=1;
	}
 }     
     if(flag==1)
         System.out.println("Element found");
     else
         System.out.println("Element not found");

}
}