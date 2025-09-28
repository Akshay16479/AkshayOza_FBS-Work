#include <stdio.h>
#include <string.h>

void main() 
{
    char arr[50],brr[50];

    printf("Enter a string: ");
    scanf("%s", arr);  

    strcpy(brr, arr);

    strrev(brr);

    // Compare original and reversed strings
    if (strcmp(arr,brr) == 0)
        printf("The string is a palindrome.\n");
    else
        printf("The string is not a palindrome.\n");

    
}
