#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Book {
	int id;
	char name[50];
	char author[50];
	char category[30];
	int price;
	int rating;
} Book;

Book* addBook(Book *, int *, int *);
void removeBook(Book *, int *);
void searchBook(Book *, int );
void updateBook(Book *, int );
void sortBook(Book *, int );
void display(Book *, int );

int main() {
	int capacity = 10;
	int n = 10;

Book* arr= (Book*)malloc(capacity*sizeof(Book));

	arr[0].id = 101;
	strcpy(arr[0].name, "The Palace of Illusions");
	strcpy(arr[0].author, "Chitra Banerjee Divakaruni");
	strcpy(arr[0].category, "Fiction");
	arr[0].price = 350;
	arr[0].rating = 5;
	arr[1].id = 102;
	strcpy(arr[1].name, "India After Gandhi");
	strcpy(arr[1].author, "Ramachandra Guha");
	strcpy(arr[1].category, "History");
	arr[1].price = 500;
	arr[1].rating = 5;
	arr[2].id = 103;
	strcpy(arr[2].name, "The White Tiger");
	strcpy(arr[2].author, "Aravind Adiga");
	strcpy(arr[2].category, "Fiction");
	arr[2].price = 400;
	arr[2].rating = 5;
	arr[3].id = 104;
	strcpy(arr[3].name, "Wings of Fire");
	strcpy(arr[3].author, "A.P.J. Abdul Kalam");
	strcpy(arr[3].category, "Autobiography");
	arr[3].price = 450;
	arr[3].rating = 5;
	arr[4].id = 105;
	strcpy(arr[4].name, "The Immortals of Meluha");
	strcpy(arr[4].author, "Amish Tripathi");
	strcpy(arr[4].category, "Mythology");
	arr[4].price = 380;
	arr[4].rating = 4;
	arr[5].id = 106;
	strcpy(arr[5].name, "Sapiens");
	strcpy(arr[5].author, "Yuval Noah Harari");
	strcpy(arr[5].category, "History");
	arr[5].price = 480;
	arr[5].rating = 5;
	arr[6].id = 107;
	strcpy(arr[6].name, "The Habit of Winning");
	strcpy(arr[6].author, "Prakash Iyer");
	strcpy(arr[6].category, "Self-Help");
	arr[6].price = 320;
	arr[6].rating = 4;
	arr[7].id = 108;
	strcpy(arr[7].name, "One Indian Girl");
	strcpy(arr[7].author, "Chetan Bhagat");
	strcpy(arr[7].category, "Fiction");
	arr[7].price = 300;
	arr[7].rating = 4;
	arr[8].id = 109;
	strcpy(arr[8].name, "Chanakya Neeti");
	strcpy(arr[8].author, "Chanakya");
	strcpy(arr[8].category, "Philosophy");
	arr[8].price = 250;
	arr[8].rating = 4;
	arr[9].id = 110;
	strcpy(arr[9].name, "The Shiva Trilogy");
	strcpy(arr[9].author, "Amish Tripathi");
	strcpy(arr[9].category, "Mythology");
	arr[9].price = 550;
	arr[9].rating = 5;

	int choice;

	while (1) {
		printf("\nBook Management Menu:\n");
		printf("1. Add Book\n");
		printf("2. Remove Book\n");
		printf("3. Search Book\n");
		printf("4. Update Book\n");
		printf("5. Sort Books\n");
		printf("6. Display All\n");
		printf("7. Exit\n");

		printf("Enter your choice: ");
		scanf("%d", &choice);

		switch(choice) {
			case 1:
				arr= addBook(arr, &n, &capacity);
				break;

			case 2:
				removeBook(arr, &n);
				break;

			case 3:
				searchBook(arr, n);
				break;

			case 4:
				updateBook(arr, n);
				break;

			case 5:
				sortBook(arr, n);
				break;

			case 6:
				display(arr, n);
				break;

			case 7:
				free(arr);
				return 0;

			default:
				printf("Invalid choice\n");
		}
	}
}
Book* addBook(Book *arr, int *n, int *capacity) {
	if (*n >= *capacity) {
		*capacity = *capacity * 2;
		arr=realloc(arr, (*capacity) * sizeof(Book));

	}

	printf("Enter book details:\n");

	printf("ID: ");
	scanf("%d", &arr[*n].id);

	printf("Name: ");
	scanf(" %[^\n]", arr[*n].name);

	printf("Author: ");
	scanf(" %[^\n]", arr[*n].author);

	printf("Category: ");
	scanf(" %[^\n]", arr[*n].category);

	printf("Price: ");
	scanf("%d", &arr[*n].price);

	printf("Rating: ");
	scanf("%d", &arr[*n].rating);

	(*n)++;

	printf("Book added successfully\n");

	return arr;
}


// Remove book by ID, Name
void removeBook(Book *arr, int *n) {
	int subChoice;
	int i, found = 0;
	int id, rating;
	char name[50];

	printf("Remove by:\n1. ID\n2. Name \nEnter choice: ");
	scanf("%d", &subChoice);

	if (subChoice == 1) {
		printf("Enter ID: ");
		scanf("%d", &id);
		for (i = 0; i < *n; i++) {
			if (arr[i].id == id) {
				found = 1;
				break;
			}
		}
	} else if (subChoice == 2) {
		printf("Enter Name: ");
		scanf(" %[^\n]", name);
		for (i = 0; i < *n; i++) {
			if (strcmp(arr[i].name, name) == 0) {
				found = 1;
				break;
			}
		}
	}  else {
		printf("Invalid choice\n");
		return;
	}

	if (found==1) {
		for (int j = i; j < *n - 1; j++) {
			arr[j] = arr[j + 1];
		}
		(*n)--;
		printf("Book removed successfully!\n");
	} else {
		printf("Book not found\n");
	}
}

// Search book by Name, Author, or Category
void searchBook(Book *arr, int n) {
	int subChoice;
	char str[50];
	int found = 0;

	printf("Search by:\n1. Name\n2. Author\n3. Category\nEnter choice: ");
	scanf("%d", &subChoice);

	if (subChoice == 1) {
		printf("Enter Name: ");
		scanf(" %[^\n]", str);
		for (int i = 0; i < n; i++) {
			if (strcmp(arr[i].name, str) == 0) {
				printf("%d  %s  %s  %s  %d  %d\n",
				       arr[i].id, arr[i].name, arr[i].author, arr[i].category, arr[i].price, arr[i].rating);
				found = 1;
			}
		}
	} else if (subChoice == 2) {
		printf("Enter Author: ");
		scanf(" %[^\n]", str);
		for (int i = 0; i < n; i++) {
			if (strcmp(arr[i].author, str) == 0) {
				printf("%d  %s  %s  %s  %d  %d\n",
				       arr[i].id, arr[i].name, arr[i].author, arr[i].category, arr[i].price, arr[i].rating);
				found = 1;
			}
		}
	} else if (subChoice == 3) {
		printf("Enter Category: ");
		scanf(" %[^\n]", str);
		for (int i = 0; i < n; i++) {
			if (strcmp(arr[i].category, str) == 0) {
				printf("%d  %s  %s  %s  %d  %d\n",
				       arr[i].id, arr[i].name, arr[i].author, arr[i].category, arr[i].price, arr[i].rating);
				found = 1;
			}
		}
	} else {
		printf("Invalid choice\n");
		return;
	}
      int choice;
	if (found==0) {
		printf("No books found\n");
		printf("do you want to search again? \nEnter 1.Search again \n Enter 2.exit");
		scanf("%d",&choice);
		if(choice==1)
		{
			searchBook(arr,n);
		}
		else
		{
			printf("Exited");
		}
		
	}
	
}

// Update price or rating
void updateBook(Book *arr, int n) {
	int id, index = -1;
	printf("Enter ID of book to update: ");
	scanf("%d", &id);

	for (int i = 0; i < n; i++) {
		if (arr[i].id == id) {
			index = i;
			break;
		}
	}

	if (index == -1) {
		printf("Book not found\n");
		return;
	}

	int subChoice;
	printf("Update:\n1. Price\n2. Rating\nEnter choice: ");
	scanf("%d", &subChoice);

	if (subChoice == 1) {
		printf("Enter new price: ");
		scanf("%d", &arr[index].price);
	} else if (subChoice == 2) {
		printf("Enter new rating: ");
		scanf("%d", &arr[index].rating);
	} else {
		printf("Invalid choice\n");
	}
}

// Sort by rating or price
void sortBook(Book *arr, int n) {
	int subChoice;
	printf("Sort by:\n1. Rating\n2. Price\nEnter choice: ");
	scanf("%d", &subChoice);

	Book temp;
	for (int i = 0; i < n - 1; i++) {
		for (int j = i + 1; j < n; j++) {
			int swap = 0;

			if (subChoice == 1) {
				if (arr[i].rating > arr[j].rating)  
					swap = 1;
			}

			if (subChoice == 2) {
				if (arr[i].price > arr[j].price)  
					swap = 1;
			}


			if (swap==1) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
}

// Display all books
void display(Book *arr, int n) {
	printf("\nBook List:\n");
	printf("ID  Name  Author  Category  Price  Rating\n");
	for (int i = 0; i < n; i++) {
		printf("%d  %s  %s  %s  %d  %d\n",
		       arr[i].id, arr[i].name, arr[i].author, arr[i].category, arr[i].price, arr[i].rating);
	}
}
