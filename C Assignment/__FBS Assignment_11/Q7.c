#include <stdio.h>
void mystrlwr(char*);
void main()
{
	char arr[]="AKSHAY";
	
	mystrlwr(arr);
}

void mystrlwr(char*arr)
{
	int i=0;
	while(arr[i]!='\0')
	{
		arr[i]=arr[i]+32;
		i++;
	}
	
	printf("%s",arr);
}