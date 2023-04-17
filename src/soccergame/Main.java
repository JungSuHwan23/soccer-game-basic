package soccergame;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> attacker1 = new ArrayList<Integer>();
		ArrayList<Integer> attacker2 = new ArrayList<Integer>();
		ArrayList<Integer> goalkeeper = new ArrayList<Integer>();
			
			
	    Scanner in = new Scanner(System.in); 
	    System.out.println("attacker1의 공을 입력해주세요.");
	    for(int i = 0; i < 5; i++) 
	    {
	    	attacker1.add(in.nextInt());
	    } 
	        
	    System.out.println("attacker2의 공을 입력해주세요.");
	    for(int i = 0; i < 5; i++) 
	    {
	    	attacker2.add(in.nextInt());
	    }  
	        
		System.out.println("goalkeeper의 공을 입력해주세요.");
		for(int i = 0; i < 3; i++)
		{
			goalkeeper.add(in.nextInt());	
		} 
		
		    
	}
}