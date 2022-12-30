//3. WAP to sort an array using Bubble Sort Algorithm.
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of elements:");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []a=new int[n];
		System.out.println("Enter the "+n+" elements:");
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		//Bubble Sort
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		System.out.println("After sorting:");
		for(int ele:a) {
			System.out.println(ele);
		}
	}

}
