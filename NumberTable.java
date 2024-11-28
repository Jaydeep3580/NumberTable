package com.jdp;

import java.util.Scanner;

public class NumberTable {
	
	void Table() {
		
		System.out.println("Enter Number:");
		Scanner sc = new Scanner(System.in);
		int Num = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(Num + "*"+i+"="+Num*i);
		}
	}

}
