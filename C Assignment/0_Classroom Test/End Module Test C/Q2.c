#include <stdio.h>
#include <string.h>

void main() {
    char arr[20];
    int count;

    printf("Enter a string: ");
    scanf("%[^\n]", arr);

   for(int i = 0; arr[i] != '\0'; i++) 
   { 
        count = 0;
        for(int j = 0; arr[j] != '\0'; j++) 
		{
            if(arr[i] == arr[j]) 
			{
                count++;
            }
        }
        printf("%c %d\n", arr[i], count);
    }


}
