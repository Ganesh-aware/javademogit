package Assignment1;

import java.util.Scanner;

public class SmallestKelementArray {

	public static void main(String[] args) {
		
		Scanner ob = new Scanner(System.in);
		
		int a[]= {5,2,6,8,1,45,90,4};
		
		int temp;
		
		for (int i = 0; i < a.length-1; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if (a[i] > a[j]) {
					temp =a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				
			}
			
		}
		
		System.out.println("Enter the k element: ");
		
		int k = ob.nextInt();
		
		System.out.print("given smallest number from array: " + a[k]);
		
	}
}
