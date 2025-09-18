#include<stdio.h>
#include<string.h>

void main () 
{
	char arr[20]="akshay";
    int res =strlen(arr);                                             //strlen
	printf("%d",res); 
	
	char arr[20]="My Name Is Lakhan";
	char brr[20];
	strcpy(brr,arr);                                                   //strcpy
	printf("%s",brr);
	
	char arr[20]="akshay";
	strupr(arr);                                                      //strupr
	printf("%s",arr);
	
	char arr[20]="AKSHAY";
	strlwr(arr);                                                      //strlwr
	printf("%s",arr);  
    
	char arr[20]="Akshay";
	char brr[20]="Akshay";
	int res =strcmp(arr,brr);                                        //strcmp
	printf("%d",res);
	
    
	char str[50] = "Hello World How Are You Doing";
    char *p = strchr(str, 'o');   // find first 'o'                    //strchr
 
    if(p)
    printf("%s \n", p);   // prints from first 'o' ? "o World"
    else
    printf("Not found");
    
    
	char arr[20]="My Name Is Lakhan";
	char brr[20];
	strncpy(brr,arr,7);                                                   //strncpy
	printf("%s",brr);
	
	
	char arr[20]="Hello ";
	char brr[20]="Akshay";
	strcat(arr,brr);                                                     //strcat
    printf("%s", arr);
    
    char arr[20]="Hello ";
	char brr[20]="Akshay";
	strncat(arr,brr,4);                                                   //strncat
    printf("%s", arr);
    
    char arr[20]="Akshay";
	char brr[20]="Amit";
	int res =strncmp(arr,brr,3); //cmp first 3 characters                  //strcmp
	printf("%d",res);
	
	
	char str[50] = "Hello World How Are You Doing";
    char *p = strrchr(str, 'o');   // find first 'o'                      //strrchr
 
    if(p)
    printf("%s \n", p);   // prints from last 'o' 
    else
    printf("Not found");
    
  
    char arr[20] = "Hello Akshay";
    char brr[20] = "Hello";
    char *res = strstr(arr, brr);                                        //strstr

    if (res != NULL)
    printf("Substring found: %s\n", res);
    else
    printf("Substring not found\n");
    
    
    char arr[50]="my name is akshay and i am c learner";
    int res= strspn(arr,"is");                                       //strspn
    printf("%u",res);
    
    
    char arr[50] = "my name is akshay and i am c learner";
    char *res = strtok(arr, " ");  //Took gpt help in this function     //strtok    

    while (res!= NULL) 
	{
        printf("%s\n",res);  // print each word
        res = strtok(NULL, " ");  // get next token
    }
    
    

    char arr[20] = "Akshay";
    char*res = strrev(arr);                                           //strrev
    printf("%s",arr);
    
    
    char arr[20] = "Akshay";
    // duplicate string
    char *res = strdup(arr);                                           //strdup
    printf("%s",res);
}
