package com.Arrays;

import java.util.Scanner;

public class SmallestandLargest {
public static void main(String [] args) {
	
	int no,i,l,s;
	Scanner ts = new Scanner(System.in);
	
	System.out.println("Set down Array Range");
	no = ts.nextInt();
	
	int [] ra = new int[no];
	System.out.println("Enter Nos");
	
	for(i = 0; i < no; i++) {
		ra[i] = ts.nextInt();
	}
	
	int o = ra.length;
	l = s = ra[0];
	for(i =0; i < o; ++i) {
		if (ra[i]>l) 
			l = ra[i];
		
		if (ra[i]<s)
			s = ra[i];
	}
	
	        System.out.println("Largest no is: " + l);		
			System.out.println("Smallest No is: " + s);	
	ts.close();
}
}
