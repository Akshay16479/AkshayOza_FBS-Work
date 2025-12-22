package Sorting;

public class demo2 {                   //Selection sort

	public static void main(String[] args) {

		int[] arr = { 5, 33, 12, 9, 18, 17 };

		Selectionsort(arr);

	}                                         //Selection sort

	static void Selectionsort(int[] arr) {

		int i = 0, j = 0;

		for (i = 0; i < arr.length - 1; i++) { 

			int min = arr[i];
			int min_indexValue = i;                    

			for (j = i + 1; j < arr.length; j++) {     //loops for getting min element      

				if (min > arr[j]) {
					min = arr[j];
					min_indexValue = j;
				}

			}

			arr[min_indexValue] = arr[i];          //swapping elements
			arr[i] = min;

		}

		System.out.println("sorted array is : ");
		for (int x : arr) {

			System.out.print(x + " ");

		}

	}

}
