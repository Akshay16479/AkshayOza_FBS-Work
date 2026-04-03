package practiceworkjava;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class code {
	public static void main(String[] args) {

		// Check Palindrome String

//		String str = "akshay";
//		
//		StringBuilder s=new StringBuilder(str).reverse();
//		
//		if(str.equals(new String(s)))    //str.equals(s.toString())  OR  str.contentEquals(s)jab string to strigb compare krenge
//		{
//			System.out.println("palindrome");
//		}
//		else
//			System.out.println(" not palindrome");
//

//		OR
//	
//		
//		String str = "nitin";
//		char[] arr = new char[str.length()];
//		int j = 0;
//		for (int i = str.length() - 1; i >= 0; i--) {
//
//			arr[j] = str.charAt(i);
//			j++;
//
//		}



///////////	///	///////////////////////////////////////////////////////////////////////////////////////////////////////////

		// Reverse a String

//		String str = "Akshay";
//
//		 StringBuilder s=new StringBuilder(str).reverse();
//		 System.out.println(s);
//		 
//		 0R
//
//		char[] arr = new char[str.length()];
//		int j = 0;
//		for (int i = str.length() - 1; i >= 0; i--) {
//
//			arr[j] = str.charAt(i);
//			j++;
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// count vowels in string

//		String str = "akshay";
//		char []arr=new char[str.length()];
//		
//		int count=0;
//		for (int i = 0; i < str.length(); i++) {
//			arr[i]=str.charAt(i);
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//		    if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
//				count++;
//			}
//		}
//		
//		System.out.println("count= " + count);
//		

//		OR
//		
//		String str="akshay";
//	    int count = 0;
//
//		for (int i = 0; i < str.length(); i++) {
//		    char ch = str.charAt(i);
//			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
//		        count++;
//		}
//		System.out.println("count= " + count);
//		

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// count consonants in string

//		String str = "akshay";
//		int count = 0;
//
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//
//			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
//				if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'
//						|| ch == 'I' || ch == 'O' || ch == 'U')) {
//					count++;
//
//				}
//			}
//		}
//
//		System.out.println("consonant count = " + count);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Count characters in String

//		String str = "akshay";
//		int count=0;
//		count=str.length();
//		System.out.println("characters count is :" + count);

		// OR

//		String str = "akshay";
//		int count = 0;
//
//		for (int i = 0; i < str.length(); i++) {
//		    count++;
//		}
//
//		System.out.println(count);

		// OR

//		String str = "akshay";
//		char[] arr = str.toCharArray();
//		int count = arr.length;
//		System.out.println(count);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Remove duplicate characters

//		String str = "akshay";
//		char[] arr = str.toCharArray(); 
//		char[] brr = new char[arr.length]; 
//		int k = 0;
//		for (int i = 0; i < arr.length; i++) {
//
//			int duplicate = 0;
//		    for (int j = 0; j < arr.length; j++) {
//		        if (arr[i] == brr[j]) {
//		            duplicate = 1;
//		            break;
//		        }
//		    }
//
//		    if (duplicate==0) {
//		        brr[k] = arr[i]; 
//		        k++;
//		    }
//		}
//
//		for (int i = 0; i <brr.length; i++) {
//		    System.out.println(brr[i]);
//		}

		

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// Check anagram

//		String s1 = "aksh";
//		String s2 = "hska";
//		char[] c1 = s1.toCharArray();
//		char[] c2 = s2.toCharArray();
//		int flag;
//
//		if (c1.length != c2.length) {
//			System.out.println("not  anagram");
//			return;
//		}
//
//		for (int i = 0; i < c1.length; i++) {
//
//			flag = 0;
//
//			for (int j = 0; j < c2.length; j++) {
//
//				if (c1[i] == c2[j]) {
//					flag = 1;
//					break;
//				}
//
//			}
//			if (flag == 0) {
//				System.out.println(s1 + " and " + s2 + " are not anagrams");
//				return;
//			}
//
//		}
//
//		System.out.println(s1 + " and " + s2 + " are anagrams");

		// OR

//		String s1 = "aksh";
//		String s2 = "hska";
//
//		if(s1.length() != s2.length()) {
//		    System.out.println("Not an anagram");
//		} else {
//		    char[] c1 = s1.toCharArray();
//		    char[] c2 = s2.toCharArray();
//
//		    Arrays.sort(c1);
//		    Arrays.sort(c2);
//
//		    if(Arrays.equals(c1, c2)) {
//		        System.out.println("Anagram");
//		    } else {
//		        System.out.println("Not an anagram");
//		    }
//		}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Reverse words in a sentence

//		String str="my name is akshay";
//		
//		String[] divide=str.split(" ");
//		
//		String res=divide[divide.length-1];
//		
//		StringBuilder sb=new StringBuilder(res).reverse();
//		
//		System.out.println(sb);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Reverse an array

//		int[] arr = { 10, 20, 30, 40, 50 };
//
//		for (int i = arr.length - 1; i >= 0; i--) {
//
//			System.out.println(arr[i]);
//		}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Find max & min element

//		int[] arr = { 130, 240, 20, 4, 50 };
//
//		int min = arr[0];
//		int max = arr[0];
//
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] < min) {
//				min = arr[i];
//			}
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//		}
//
//		System.out.println("Min = " + min);
//		System.out.println("Max = " + max);

		// OR

//		int[] arr = {130, 240, 20, 4, 50};
//
//		Arrays.sort(arr);
//
//		System.out.println("Min = " + arr[0]);
//		System.out.println("Max = " + arr[arr.length - 1]);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Sort an array

//		int[] arr = { 130, 240, 20, 4, 50 };
//
//		Arrays.sort(arr);
//
//		for (int i = arr.length - 1; i >= 0; i--) {
//
//			System.out.println(arr[i]);
//		}

		// OR

//		int[] arr = { 130, 240, 20, 4, 50 };
//
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = 0; j < arr.length - 1 ; j++) {
//				if (arr[j] < arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}
//
//		for (int i = arr.length - 1; i >= 0; i--) {
//
//			System.out.println(arr[i]);
//		}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Find duplicate elements

//		int[] arr = {10, 20, 30, 20, 40, 10, 50};
//
//		for (int i = 0; i < arr.length; i++) {
//		    for (int j = i + 1; j < arr.length; j++) {
//		        if (arr[i] == arr[j]) {
//		            System.out.println("Duplicate: " + arr[i]);
//		            
//		        }
//		    }
//		}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Remove duplicates

//		int[] arr = {10, 20, 30, 20, 40, 10, 50};
//
//		for (int i = 0; i < arr.length; i++) {
//		   int flag=0;
//
//		    for (int j = 0; j <i ; j++) {
//		        if (arr[i] == arr[j]) {
//		            flag=1;
//		            break;
//		        }
//		    }
//
//		    if (flag==0) {
//		        System.out.println(arr[i]);
//		    }
//		}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Sum of array

//		int[] arr = {10, 20, 30, 40};
//		int sum = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//		    sum = sum + arr[i];
//		}
//
//		System.out.println("Sum = " + sum);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Palindrome number
		
		// OR

//		String str = "nitin";
//
//		StringBuilder sb = new StringBuilder(str).reverse();
//
//		if (str.equals(sb.toString())) {
//		    System.out.println("Palindrome");
//		} else {
//		    System.out.println("Not Palindrome");
//		}

		// OR

//		int num = 121;
//		int temp = num;
//		int rev = 0;
//
//		while (num > 0) {
//		    int digit = num % 10;
//		    rev = rev * 10 + digit;
//		    num = num / 10;
//		}
//
//		if (temp == rev) {
//		    System.out.println("Palindrome Number");
//		} else {
//		    System.out.println("Not Palindrome Number");
//		}

		// OR



///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Prime number

//		int num = 19;
//
//		boolean flag = true;
//
//		for (int i = 2; i < num; i++) {
//
//			if (num % i == 0) {
//				flag = false;
//				break;
//			}
//
//		}
//
//		if (flag == true) {
//			System.out.println("num is prime");
//
//		} else
//			System.out.println("num is not prime");

		

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// even-odd

//		int n = 11;
//
//		if (n % 2 == 0) {
//			System.out.println("number is even");
//		} else {
//			System.out.println("number is odd");
//
//		}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// sum of digits

//		int num = 1234;
//        int sum = 0;
//
//        while (num > 0) {
//            sum = sum + (num % 10);
//            num = num / 10;
//        }
//
//        System.out.println("Sum of digits = " + sum);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Reverse a number

//        int num = 1234;
//        int rev = 0;
//
//        while (num > 0) {
//            int digit = num % 10;      
//            rev = rev * 10 + digit;    
//            num = num / 10;            
//        }
//
//        System.out.println("Reversed number = " + rev);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Armstrong Number

//		 int num = 153;
//	        int temp = num;
//	        int sum = 0;
//
//	        while (temp > 0) {
//	            int digit = temp % 10;
//	            sum = sum + (digit * digit * digit);
//	            temp = temp / 10;
//	        }
//
//	        if (sum == num)
//	            System.out.println("Armstrong Number");
//	        else
//	            System.out.println("Not Armstrong Number");	

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// merge two arrays

//		int []arr= {1,3,5};
//		int []brr= {2,4,6};
//
//		int []crr=new int[arr.length+brr.length];
//		
//		for (int i = 0; i < arr.length; i++) {
//			crr[i]=arr[i];
//			
//		}
//		for (int i = 0; i < brr.length; i++) {
//			
//			crr[arr.length+i]=brr[i];
//			
//		}
//for (int i = 0; i < crr.length; i++) {
//	System.out.println(crr[i]);
//}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// largest number from array

//		int []arr= {1,3,5,2,6,12,4,15};
//		
//		int largest=arr[0];
//		
//		for (int i = 0; i < arr.length; i++) {
//			
//			if(arr[i]>largest)
//			{
//				largest=arr[i];
//			}
//		}
//		System.err.println("largest number : " + largest);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// remove duplicates from array

//		int[] arr = { 1, 2, 3, 2, 4, 1, 5 };
//
//		HashSet hs = new HashSet();
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			hs.add(arr[i]);
//		}
//
//		hs.toString();  //also can write loop also for printing
//		System.out.println(hs);

		// OR

//		int[] arr = { 1, 2, 3, 2, 4, 1, 5 };
//		int n = arr.length;
//
//		for (int i = 0; i < n; i++) {
//			for (int j = i + 1; j < n; j++) {
//				if (arr[i] == arr[j]) {
//					// shift elements left to overwrite duplicate
//					for (int k = j; k < n - 1; k++) {
//						arr[k] = arr[k + 1];
//					}
//					n--; // reduce effective array size
//					j--; // stay at same index to check the new element
//				}
//			}
//		}
//
//		// print array without duplicates
//		System.out.println("Array after removing duplicates:");
//		for (int i = 0; i < n; i++) {
//			System.out.print(arr[i] + " ");
//		}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// check number is armstrong

//		int num = 153; 
//        int original = num;
//        int sum = 0;
//
//        while (num > 0) {
//            int digit = num % 10;
//            sum += digit * digit * digit; // cube of digit
//            num = num / 10;
//        }
//
//        if (sum == original) {
//            System.out.println(original + " is an Armstrong number.");
//        } else {
//            System.out.println(original + " is NOT an Armstrong number.");
//        }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Greatest common divisor(GCD or HCF)

//		int a = 50;
//		int b = 60;
//
//		int g = 0;
//
//		for(int i = 1; i <= a; i++){
//		    if(a % i == 0 && b % i == 0){
//		        g = i;  // store latest common divisor
//		    }
//		}
//
//		System.out.println("GCD = " + g);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// count number of digits in number

//		int num = 23134;
//
//		int count = 0;
//
//		while (num != 0) 
//		{
//			num = num / 10;
//			count++;
//		}
//	
//		System.out.println("count is  :" + count);

		// OR

//		String str="23134";
//		
//		int count = 0;
//		
//		for (int i = 0; i < str.length(); i++) {
//			str.charAt(i);
//			count++;
//			
//		}
//		
//		System.out.println("count is  :" + count);

		// OR

//		String str="23134";
//		int count = str.length();
//		System.out.println("count is  :" + count);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// second largest element in array

//		int[] arr = {12, 45, 23, 67, 34, 2};
//
//        // Step 1: Find the largest element
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//
//        // Step 2: Find the largest element smaller than max
//        int secondMax=arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < max && arr[i] > secondMax ) {
//                secondMax = arr[i];
//            }
//        }
//
//        System.out.println("Second largest element is: " + secondMax);

		// OR

//		int[] arr = {12, 45, 23, 67, 34, 2};
//		Arrays.sort(arr);
//		int secondMax = arr[arr.length-2];
//		
//		
//		 System.out.println("Second largest element is: " + secondMax);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// swapping of 2 numbers

//		int a=5,b=10;
//		System.out.println("a is "+ a);
//		System.out.println("b is " + b);
//
//		int temp=a;
//		a=b;
//		b=temp;
//		System.out.println("a is "+ a);
//		System.out.println("b is " + b);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// find sum of digits of number

//		int num=12345;
//		
//		int sum=0;
//		
//		while(num!=0)
//		{
//			int digit=num%10;
//			sum=sum+digit;
//			num=num/10;
//		}
//		
//		System.out.println(sum);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// find length of string

//		String str="akshay";
//				
//		int len=str.length();
//		
//		System.out.println("length is : " + len);

		// OR

//		String str="akshay";
//		int count=0;
//		
//		for (int i = 0; i < str.length(); i++) 
//		{
//			count++;
//			
//		}
//		
//		System.out.println(count);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// check string is empty

//		String str="";	
//		
//		if(str.length()==0)
//		{
//			System.out.println("string is empty");
//		}
//		else
//		{
//			System.out.println("string is not empty");
//
//		}

		// OR

//		String str="";	
//		
//		if(str.isEmpty())
//			{
//				System.out.println("string is empty");
//			}
//			else
//		{
//			System.out.println("string is not empty");
//	
//			}

		// OR

//		String str = "";
//
//		boolean isEmpty = true;
//
//		if (str != null) {
//		    for (int i = 0; i < str.length(); i++) {
//		        isEmpty = false;   // If loop runs even once, string is not empty
//		        break;
//		    }
//		}
//
//		if (isEmpty) {
//		    System.out.println("String is empty");
//		} else {
//		    System.out.println("String is not empty");
//		}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Count Occurrence of a Character in a String

//		        String str = "akshay";
//		        char target = 'a';
//		        int count = 0;
//
//		        for (int i = 0; i < str.length(); i++) {
//		            if (str.charAt(i) == target) {
//		                count++;
//		            }
//		        }
//
//		        System.out.println("Occurrence of " + target + " is: " + count);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// check year is leap or not

//		int year=2026;
//		
//		if(year%4==0 && year%100!=0 || year%400==0)
//		{
//			System.out.println("year is LEAP YEAR ");
//		}
//		else
//		{
//			System.out.println("year is NOT LEAP YEAR ");
//
//		}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// reverse a number

//		int num = 12345;
//		int digit = 0;
//		int res = 0;
//
//		while (num > 0) {
//			digit = num % 10;
//
//			res = res * 10 + digit;
//
//			num = num / 10;
//
//		}
//
//		System.out.println("reverse is : " + res);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Fibonacci series upto n=10

//		int a = 0;
//		int b = 1;
//		int c;
//
//		for (int i = 2; i <= 10; i++) {
//			c = a + b;
//
//			a = b;
//			b = c;
//			System.out.println("Fibonacci series is : " + c);
//
//		}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// greatest common divisor

//		int a = 60;
//		int b = 36;
//		int gcd = 1;
//
//		for (int i = 1; i <= a && i <= b; i++) {
//		    if (a % i == 0 && b % i == 0) {
//		        gcd = i;
//		    }
//		}
//
//		System.out.println("GCD = " + gcd);	

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Perfect number

//		int num = 28;
//		int res = 0;
//		for (int i = 1; i < num; i++) {
//			if (num % i == 0) {
//				res = res + i;
//			}
//
//		}
//
//		if (res == num) {
//			System.out.println("Number is Perfect Number");
//		} else {
//			System.out.println("Number is Not Perfect Number");
//
//		}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Calculate frequency of characters in a string

//		String str = "akshayyy";
//		char[] arr = str.toCharArray();
//
//		for (int i = 0; i < arr.length; i++) {
//
//			int count = 0;
//
//			for (int j = 0; j < arr.length; j++) {
//
//				if (arr[i] == arr[j]) {
//					count++;
//				}
//
//			}
//
//			System.out.println(" character " + str.charAt(i) + " count " + " is " + count);
//
//		}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// year is leap or not

//		int year=2026;
//		
//		if (year % 400 == 0)
//		    System.out.println("year is leap ");
//
//		  else if (year % 4 == 0 && year % 100 != 0)
//			    System.out.println("year is leap ");
//
//		  else
//			    System.out.println("year is not leap ");

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// find non-repeating characters in a string

//		String str = "akshayyy";
//        char[] arr = str.toCharArray();
//
//        for (int i = 0; i < arr.length; i++) {
//
//            int count = 0;
//
//            for (int j = 0; j < arr.length; j++) {
//
//                if (arr[i] == arr[j]) {
//                    count++;
//                }
//            }
//
//            if (count == 1) {
//                System.out.println("Non-repeating: " + arr[i]);
//            }
//        }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// replace a substring in a string.

//		String str = "I like Java";
//		String result = str.replace("Java", "Python");
//
//		System.out.println(result);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// find the factorial of a number.

//		int num=5;
//		int fact=1;
//		
//		for (int i = 1; i <= num; i++) 
//		{
//			fact=fact*i;
//			
//		}
//		System.out.println("factorial is : " + fact);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Armstrong number

//		int num = 123;
//		int x = num;
//		int res;
//		int sum = 0;
//		while (num > 0) {
//			res = num % 10;
//			sum = sum + (res * res * res);
//			num = num / 10;
//
//		}
//
//		if (x == sum) {
//			System.out.println("Num is Armstrong ");
//		}
//		else {
//			System.out.println("Num is Not Armstrong ");
//		}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// minimum number from array

//		int arr[] = {12, 13, 1, 10, 34, 10};
//
//	     int min = arr[0];
//
//	     for(int i=0; i<arr.length;i++){
//	         if(arr[i]<min)
//	    	 {
//	            min = arr[i];
//	         }
//
//	     }
//
//	     System.out.print(min); 

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Reverse array elements

//		int arr[] = {10, 20, 30, 40, 50};
//
//	     for(int i=arr.length-1; i>=0; i--)
//	    {
//	       System.out.print(arr[i]+" "); 
//	    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// String char count - merge count with char - reverse

//		String str = "aabbbccdeeef";
//
//		char[] arr = new char[30];
//		int[] counts = new int[30];
//
//		int count;
//		for (int i = 0; i < str.length(); i++) {
//			count = 0;
//
//			for (int j = 0; j < str.length(); j++) {
//				if (str.charAt(i) == str.charAt(j)) {
//					count++;
//
//				}
//
//			}
//			arr[i] = str.charAt(i);
//			counts[i] = count;
//			System.out.print(arr[i] + "" + counts[i]);
//		}
//		
//		
//		System.out.println();
//
//		for (int i = str.length() - 1; i >= 0; i--) {
//			System.out.print(arr[i] + "" + counts[i]);
//		}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Print all numbers between 1 and N that are divisible by both 3 and 5.

//		int num = 100;
//
//		for (int i = 1; i <= num; i++) {
//
//			if (i % 3 == 0 && i % 5 == 0) {
//				System.out.println("" + i);
//			}
//
//		}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Print all Armstrong numbers between 1 and 1000

//		for(int i=1;i<=1000;i++) 
//		{
//		int temp = i;
//		int sum = 0;
//		
//		while (temp != 0) {
//			int digit = temp % 10;
//			sum = sum + (digit * digit * digit);
//			temp = temp / 10;
//
//		}
//		if(sum == i) 
//			System.out.println(i);
//		}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Count how many even digits a number contains.

//		int num = 123456;
//		int count = 0;
//
//		while (num > 0) {
//			int digit = num % 10;
//
//			if (digit % 2 == 0) {
//				count++;
//			}
//
//			num = num / 10;
//		}
//
//		System.out.println("Even digits count: " + count);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// prime check

//		int num = 17;
//		int flag=0;
//
//		for(int i = 2; i < num; i++) {
//		    if(num % i == 0) {
//		       flag=1;
//		       
//		    }
//		}
//
//		if(flag==0)
//		    System.out.println("Prime Number");
//		else
//		    System.out.println("Not Prime Number");

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// reverse of a numbe
//		int num=12345677;
//		while(num!=0)
//		{
//			int digit=num%10;
//			System.out.print(digit);
//			num=num/10;
//		}

		// OR

//		int num = 12345677;
//		int rev = 0;
//
//		while(num != 0)
//		{
//		    int digit = num % 10;
//		    rev = rev * 10 + digit;
//		    num = num / 10;
//		}
//
//		System.out.println(rev);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Check if a number is palindrome

//		int num = 121;
//		int temp = num;
//		int rev = 0;
//
//		while(num != 0)
//		{
//		    int digit = num % 10;
//		    rev = rev * 10 + digit;
//		    num = num / 10;
//		}
//
//		if(temp == rev)
//		    System.out.println("Palindrome Number");
//		else
//		    System.out.println("Not Palindrome");

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Check if a number is perfect

//		int num = 28;
//		int sum = 0;
//
//		for (int i = 1; i < num; i++) {
//			if (num % i == 0) {
//				sum = sum + i;
//			}
//		}
//
//		if (sum == num)
//			System.out.println("Perfect Number");
//		else
//			System.out.println("Not Perfect Number");

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Factorial of a number

//		int fact=1;
//		for(int i = 1; i <= 5; i++)
//		{
//		    fact = fact * i;
//		}
//
//		System.out.println("Factorial is: " + fact);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Check if two strings are anagrams
//		   String s1 = "listen";
//	        String s2 = "silent";
//
//	        char[] a = s1.toCharArray();
//	        char[] b = s2.toCharArray();
//
//	        Arrays.sort(a);
//	        Arrays.sort(b);
//
//	        if(Arrays.equals(a, b))
//	            System.out.println("Anagram");
//	        else
//	            System.out.println("Not Anagram");

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Count vowels-consonent in each word of a sentence

//		String str = "my name is akshay";
//		int vowelCount = 0;
//		int consonentCount = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
//					|| str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
//					|| str.charAt(i) == 'O' || str.charAt(i) == 'U') 
//			{
//				vowelCount++;
//			} 
//			else if (str.charAt(i) != ' ') 
//			{
//				consonentCount++;
//			}
//
//		}
//		System.out.println("vowel count : " + vowelCount);
//		System.out.println("consonent count : " + consonentCount);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Replace every vowel in a string with its position

//		String str = "my name is akshay";
//
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
//					|| str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
//					|| str.charAt(i) == 'O' || str.charAt(i) == 'U') 
//			{
//				System.out.print(i);
//			} 
//			else 
//			{
//				System.out.print(str.charAt(i));
//			}
//		}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Print characters that appear more than once

//		String str = "AKSHAY";
//
//		for (int i = 0; i < str.length(); i++) 
//		{
//			int count = 0;
//
//			for (int j = 0; j < str.length(); j++) 
//			{
//				if (str.charAt(i) == str.charAt(j)) 
//				{
//					count++;
//				}
//			}
//			if (count > 1) 
//			{
//				System.out.println(str.charAt(i));
//			}
//		}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// remove duplicates from array

//		int[] arr = { 1, 2, 3, 2, 4, 1, 5 };
//
//		for (int i = 0; i < arr.length; i++) {
//			int flag = 1;
//
//			for (int j = 0; j < i; j++) {
//				if (arr[i] == arr[j]) {
//					flag = 0;
//
//				}
//			}
//
//			if (flag == 1) {
//				System.out.print(arr[i]);
//			}
//		}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Find the maximum and minimum element in an array

//		 int[] arr = {10, 5, 20, 8, 25, 3};
//
//	        int max = arr[0];
//	        int min = arr[0];
//
//	        for (int i = 1; i < arr.length; i++) {
//	            
//	            if (arr[i] > max) {
//	                max = arr[i];
//	            }
//
//	            if (arr[i] < min) {
//	                min = arr[i];
//	            }
//	        }
//
//	        System.out.println("Maximum element: " + max);
//	        System.out.println("Minimum element: " + min);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// unique elements from an array

//		 int[] arr = {1, 2, 3, 2, 4, 1, 5};
//
//	        System.out.println("Unique elements are:");
//
//	        for (int i = 0; i < arr.length; i++) {
//
//	            int count = 0;
//
//	            for (int j = 0; j < arr.length; j++) {
//	                if (arr[i] == arr[j]) {
//	                    count++;
//	                }
//	            }
//
//	            if (count == 1) {
//	                System.out.print(arr[i] + " ");
//	            }
//	        }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// reverse array
//		int[] arr = {10, 20, 30, 40, 50};
//
//        System.out.println("Reversed array:");
//
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//        }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Shift all zeros to the end of the array

//		int[] arr = { 0, 1, 0, 3, 12 };
//		int[] result = new int[arr.length];
//
//		int j = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] != 0) {
//
//				result[j] = arr[i];
//				j++;
//			}
//		}
//
//		for (int num : result) {
//			System.out.print(num + " ");
//		}

		// OR

//		int[] arr = { 0, 1, 0, 3, 12 };
//
//		int n = arr.length;
//
//		for (int i = 0; i < n; i++) {
//
//			if (arr[i] == 0) {
//
//				// shift elements left
//				for (int j = i; j < n - 1; j++) {
//					arr[j] = arr[j + 1];
//				}
//
//				// put zero at last position
//				arr[n - 1] = 0;
//
//				i--; // re-check same index
//				n--; // reduce effective size
//			}
//		}
//
//		// print result
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// Merge two arrays into one

//		int[] arr = { 1, 2, 3 };
//		int[] brr = { 4, 5, 6, 7 };
//
//		int[] crr = new int[arr.length + brr.length];
//
//		for (int i = 0; i < arr.length; i++) {
//			crr[i] = arr[i];
//		}
//
//		for (int i = 0; i < brr.length; i++) {
//
//			crr[arr.length + i] = brr[i];
//		}
//
//		for (int i = 0; i < crr.length; i++) {
//			System.out.print(crr[i] + " ");
//		}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
	
		//Second largest print
//		int[] arr = {0, 1, 0, 3, 12};
//
//        for(int i = 0; i < arr.length - 1; i++) {
//
//            for(int j = 0; j < arr.length - 1 - i; j++) {
//
//                if(arr[j] > arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//
//        // print sorted array
//            System.out.print(arr.length-2 + " ");
        
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		//Replace all vowels with ‘*’/ same logic for replace with space ' '
		
//		 String str = "Hello Akshay";
//	        char arr[] = str.toCharArray();
//
//	        for(int i = 0; i < arr.length; i++) {
//
//	            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||
//	               arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U') {
//
//	                arr[i] = '*';
//	            }
//	        }
//
//	        System.out.println(arr);
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
	
		
		
		
		
		
		
		
		
		
	}

}
