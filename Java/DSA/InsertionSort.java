package Sorting;

public class demo4 {                       //insertion sort
	public static void main(String[] args) {

		int[] arr = { 10, 98, 45, 5, 9, 77, 21 };

		insertionsort(arr);

	}
	                                              //insertion sort
	static void insertionsort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {   //consider arr[0] is sorted

			int x = arr[i];
			int j = i - 1;

			while (j >= 0) {
				if (arr[j] > x) {
					arr[j + 1] = arr[j];         //shifting not swapping
					j--;
				} else
					break;
			}                                    
			arr[j + 1] = x;

		}

		System.out.println("sorted array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");

		}

	}

}
