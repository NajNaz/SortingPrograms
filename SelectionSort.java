//5. WAP to sort an array using Selection Sort Algorithm.
import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=scan.nextInt();
		System.out.println("Enter the "+n+" elements:");
		int []a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		selection(a);
		System.out.println("After Sorting:");
		for(int ele:a) {
			System.out.println(ele);
		}
		

	}
	public static void selection(int []a) {
		
		for(int i=0;i<a.length-1;i++) {
			int min=i;
			for(int j=i+1;j<a.length-1;j++) {
				if(a[j]<=a[min]) {
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
						
		}
	}

}
