package javaProject1.pack1;

import java.util.Scanner;

public class Bubble_Sort_Nested_for_loop {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int len=sn.nextInt();
		int[] ar=new int[len];
		for(int i=0; i<len; i++)
			ar[i]=sn.nextInt();
		for(int i=0; i<len; i++) {
			for(int j=i; j<len; j++) {
				if(ar[i]>ar[j]){
					ar[i]=ar[i]+ar[j];
					ar[j]=ar[i]-ar[j];
					ar[i]=ar[i]-ar[j];
				}	
			}
		}
		for(int i:ar)
			System.out.print(i+" ");

	}

}
