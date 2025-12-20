package BinarySearch;

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
        
       Arrays.sort(arr);
        
        BinarySearch(arr,x);
		
	}

	static void BinarySearch(int arr[] ,int x )
	{
		
		int start=0;
		int end=arr.length-1;
		int mid;
		int flag=0;
		while(start<=end)
		{
			 mid=(start+end)/2;
			 
			 if(arr[mid]==x)
			 {
				 flag=1;
	             System.out.println("Element found at index: " + mid);
				 break;

			 }
			 else if(arr[mid]>x)
			 {
				 end=mid-1;
			 }
			 else
				 start=mid+1;
			
		}
		
		if (flag == 0) {
            System.out.println("Element not found");
        }
	}
	
	
}
