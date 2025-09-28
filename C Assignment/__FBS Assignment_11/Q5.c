#include <stdio.h>
void mystrncpy(char*,char*,int);
void main()
{
	char arr[30]="Helloworld";
	char brr[30];
	mystrncpy(arr,brr,4);
}
void mystrncpy(char*arr,char*brr,int num)
{
	int i=0;

	
	while(i<num && arr[i]!='\0')
	{
		
		brr[i]=arr[i];
		i++;
	}
	
	printf("%s",brr);
	
}