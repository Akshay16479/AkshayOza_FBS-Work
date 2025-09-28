#include <stdio.h>
#include <string.h>

void main()
{
    char arr[] = "Hello World";
    char brr[] = "World";

    char *result = strstr(arr, brr);  

    if(result != NULL)
        printf("Substring found\n ");
    else
        printf("Substring not found\n");
}
