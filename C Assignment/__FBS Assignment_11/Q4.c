#include <stdio.h>
void mystrcat(char*,char*,char*);
void main()
{
	char arr[20]="Akshay";
	char brr[20]="Oza";
	char crr[40];
	mystrcat(arr,brr,crr);

}

void mystrcat(char*arr,char*brr,char*crr)
{
	int i,j;
for(i = 0; arr[i] != '\0'; i++)
    {
        crr[i] = arr[i];
    }
    
    
 for(j = 0; brr[j] != '\0'; j++)
    {
        crr[i + j] = brr[j];
    }
    
    printf("%s\n", crr);
}