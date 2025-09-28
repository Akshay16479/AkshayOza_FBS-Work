#include <stdio.h>

void main()
{
    char arr[50];
    printf("Enter a string: ");
    scanf("%s",arr);  

    int j = 0;  

    for (int i =0; arr[i] != '\0'; i++) 
	{
        if (i % 2 == 0)
		{
            arr[j] = arr[i];
            j++;
        }
        
    }

        arr[j]='\0';

    printf("String after removing odd index characters: %s\n", arr);

   
}
