#include <stdio.h>
void mystrupr(char*);
void main()
{
	char arr[]="akshay";
	
	mystrupr(arr);
}

void mystrupr(char*arr)
{
	int i=0;
	while(arr[i]!='\0')
	{
		arr[i]=arr[i]-32;
		i++;
	}
	
	printf("%s",arr);
}