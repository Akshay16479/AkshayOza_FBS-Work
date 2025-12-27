package Sorting;

public class demo6 {                        //quickSort
	
	public static void main(String[] args) {
		
		int[]arr={78,53,28,17,98,100,110};
		
		int start = 0;
		int end = arr.length - 1;
		
		quickSort(arr,start,end);
		
		System.out.println("Sorted array : ");
		for (int x : arr) {
	        System.out.print(x + " ");
	    }
		
	}
	
	static int dividePoint(int[]arr,int start,int end)
	{
		int pivot=arr[start];
		int i=start+1;
		int j=end;
		
		while(i<=j)
		{
			while(i<=end && arr[i]<pivot)
			{
				i++;
			}
			while(j>=0 && arr[j]>pivot)
			{
				j--;
			}
			
			if(i<j)
			{
				int temp = arr[i];
		        arr[i] = arr[j];
		        arr[j] = temp;

			}
		}
		
		int temp = arr[start];
		arr[start] = arr[j];
		arr[j] = temp;

		
		return j;
			
	}
	
	static void quickSort(int[]arr,int start,int end)            //quickSort
	{
		if(start<end)
		{
			int d=dividePoint(arr,start,end);
			
			quickSort(arr,start,d-1);
			quickSort(arr,d+1,end);
		}
	}


}
