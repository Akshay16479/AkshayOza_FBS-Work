package Sorting;

public class demo5 {                 //mergesort

	public static void main(String[] args) {
		
		int [] arr= {94,56,49,7,18,70};
		int start = 0;
		int end = arr.length - 1;
		mergesort(arr,start,end);
		
		
		System.out.println("Sorted array : ");
	      for (int n : arr) {
	          System.out.print(n + " ");
	      }
		  
	
	}//main ends here
	                                                 //mergesort
	
	static void mergesort(int[] arr,int start,int end) 
	{
		if(start!=end)
		{
			int mid=(start+end)/2;
			
			mergesort(arr, start, mid);
			mergesort(arr, mid+1, end);
			
			combine(arr,start,mid,end);
			
		}
	}//mergesort ends here

	
	
	  static void combine(int[] arr, int start, int mid, int end) 
	{
		  int i=start;
		  int j=mid+1;
		  int k=0;
		  int [] brr =new int[end-start+1];
		  
		  
		  while(i<=mid && j<=end)
		  {
			  if(arr[i] < arr[j]) 
			  {
				  brr[k]=arr[i];
				  k++;
				  i++;
			  }
			  else 
			  {
				  brr[k]=arr[j];
				  k++;
				  j++;
			  }	  
		  }//loop1 ends 
		  
		  
		  while (i<=mid)
		{
			  brr[k]=arr[i];
			  k++;
			  i++;
		}//loop2 ends
		  
		  
		  while(j<=end)
		  {
			  brr[k]=arr[j];
			  j++;
			  k++;
			  
		  }//loop3 ends
		  
		  
		  int y=start;
		  for (int x = 0; x < brr.length; x++) 
		{
			  arr[y]=brr[x];
			  y++;
		}
		  
	}//combine ends here
	  
}//class demo5 ends 
