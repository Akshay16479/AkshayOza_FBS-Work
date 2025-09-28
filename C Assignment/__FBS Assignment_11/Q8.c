#include <stdio.h>
#include<string.h>
void mystrrev(char*);
void main()
{
	char arr[]="akshay";
	
	mystrrev(arr);
}

void mystrrev(char*arr)
{
    int res = strlen(arr);
	int i=0,temp;
	
	while(i<res/2)
	{
		temp=arr[i];
		arr[i]=arr[res-1-i];
		arr[res-1-i]=temp;
		i++;
	}
        printf("%s",arr);
}