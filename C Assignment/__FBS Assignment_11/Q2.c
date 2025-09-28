#include <stdio.h>
void mystrlen(char*);
void main()
{
	char arr[]="akshay";
	
	mystrlen(arr);
}

void mystrlen(char*arr)
{
	int i=0,count=0;
	
	while(arr[i]!='\0')
	{
	   count++;
	   i++;	
	}
	printf("%d",count);	
	
	
}