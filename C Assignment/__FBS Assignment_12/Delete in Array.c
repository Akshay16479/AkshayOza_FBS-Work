#include <stdio.h>

void main()
{
    char ch;
    char arr[50];
    int i, j, flag = 0;

    printf("Enter String: ");
    scanf("%s", arr);

    printf("Enter Character You want to delete: ");
    scanf(" %c", &ch);

    for (i = 0; arr[i] != '\0'; i++)
    {
        if (arr[i] == ch)
        {
            flag = 1;
            
            for (j = i; arr[j] != '\0'; j++)
            {
                arr[j] = arr[j + 1];
            }
            i--; 
        }
    }

    if (flag == 1)
        printf("Updated String: %s\n", arr);
    else
        printf("Character not found in string\n");
}

