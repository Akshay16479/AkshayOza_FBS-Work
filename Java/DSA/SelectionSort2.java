package Sorting;

public class demo3 {

	public static void main(String[] args) {

		int[] arr = { 5, 33, 12, 9, 18, 17 };

		selectionSort(arr);
	}

	static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			int minIndex = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			// Swap
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		
		System.out.print("sorted array is : ");
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}
}
