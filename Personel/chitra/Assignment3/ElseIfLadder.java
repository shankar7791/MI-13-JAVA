package com.codebind;

import java.util.*;

public class ElseIfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int per;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Percentage: ");
        per = sc.nextInt();
        if(per >= 65 && per <= 100) {
        	System.out.println("Congratulations!! You got distinction.");
        }
        else if(per >= 60 && per <65) {
        	System.out.println("Congratulations!! You got first class.");
        }
        else if(per >= 55 && per <60) {
        	System.out.println("Congratulations!! You got Higher second class.");
        }
        else if(per >= 50 && per <55) {
        	System.out.println("Congratulations!! You got second class.");
        }
        else if(per >= 45 && per <50) {
        	System.out.println("Congratulations!! You are pass.");
        }
        else
        {
        	System.out.println("Better luck next time.");
        }
	}

}
