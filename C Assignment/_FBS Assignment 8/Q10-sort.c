#include <stdio.h>
void main() {
	int arr[5], temp;

	printf("Enter 5 elements: ");
	for(int i = 0; i < 5; i++) {
		scanf("%d", &arr[i]);
	}
	for(int j=0; j<4; j++) {

		for(int i = 0; i < 4; i++) {
			if(arr[i] > arr[i+1]) {
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
	}
	printf("Sorted array is: ");
	for(int j = 0; j < 5; j++) {
		printf("%d ", arr[j]);
	}

}
