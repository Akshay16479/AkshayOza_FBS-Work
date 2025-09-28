#include <stdio.h>
void mystrcpy(char*,char*);
void main()
{
	char arr[6]="Hello";
	char brr[6];
	mystrcpy(arr,brr);
}
void mystrcpy(char*arr,char*brr)
{
	int i=0;

	
	while(arr[i]!='\0')
	{
		brr[i]=arr[i];
		i++;
	}
	
	printf("%s",brr);
	
}