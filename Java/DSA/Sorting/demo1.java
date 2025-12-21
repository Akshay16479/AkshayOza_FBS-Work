package Sorting;

import java.util.*;                  //bubble sort on string

public class demo1 {
	public static void main(String[] args) {

		String arr = "2546375211785";         //bubble sort on string
		char[] ch = arr.toCharArray();

		System.out.println("len is :" + ch.length);
		char temp;
		
		for (int i = 0; i < ch.length - 1; i++) {
			for (int j = 0; j < ch.length - 1; j++) {
				if (ch[j] > ch[j + 1]) {
					temp = ch[j];
					ch[j] = ch[j + 1];             //bubble sort on string
					ch[j + 1] = temp;
				}
			}
		}

		System.out.println(new String(ch));
	}
}
