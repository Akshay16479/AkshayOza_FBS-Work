package Sorting;

import java.util.*;

public class demo { // Bubble Sort
	public static void main(String[] args) {

		int[] arr = { 2, 54, 63, 75, 21, 17, 85 };

		BubbleSort(arr); // Bubble Sort

	}

	static void BubbleSort(int[] arr) { // Bubble Sort
		int temp;
		int swap = 0;


		for (int i = 0; i < arr.length - 1; i++) {
			boolean exit=false;

			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swap++;
					exit=true;
				}
			}
			if(exit==false)
			{                       //optimization early exit no extra iterations
				break;
			}
			

		}
		System.out.println("total swaps are : " + swap);

		System.out.print("sorted array : ");

		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

}
