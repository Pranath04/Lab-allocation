package prac;

import java.util.Arrays;
import java.util.Scanner;

public class Labs{
	public static void main(String args[]) {
		Scanner scan= new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		int z=scan.nextInt();
		int n=scan.nextInt();
		int c=0;
		int arr[]= {x,y,z};
		Arrays.sort(arr);
		if(n<=arr[0]) {
			c=arr[0];
		}
		else if(n>arr[0]&&n<arr[1]) {
			c=arr[1];
		}
		else {
			c=arr[3];
		}
		if(c==x) {
			System.out.println("L1");
		}
		else if(c==y) {
			System.out.println("L2");
		}
		else {
			System.out.println("L3");
		}
		
		
	}
}