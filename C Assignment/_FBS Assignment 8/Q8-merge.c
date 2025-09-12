#include <stdio.h>

void main() {
    int n;
    printf("Enter array size: ");
    scanf("%d", &n);

    int arr[n], brr[n], crr[2 * n];

    // Input first array
    printf("Enter array1 elements: ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // Input second array
    printf("Enter array2 elements: ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &brr[i]);
    }

    printf("Merged array elements are:\n");

    // Merge first array and print immediately
    for (int i = 0; i < n; i++) {
        crr[i] = arr[i];
        printf("%d\n", crr[i]);
    }

    // Merge second array and print immediately
    for (int i = 0; i < n; i++) {
        crr[i + n] = brr[i];
        printf("%d\n", crr[i + n]);
    }
}
