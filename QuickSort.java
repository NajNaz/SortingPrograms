//2. WAP to sort an array using Quick Sort Algorithm.
import java.util.*;
public class QuickSort {
	
	void quick(int[] a,int lb,int ub) {
		if(lb<ub) {
			int loc=partition(a,lb,ub);
			quick(a,lb,loc-1);
			quick(a,loc+1,ub);	
		}
		
	}
	int partition(int[] a,int lb,int ub) {
		int pivot= a[lb];
		int start=lb;
		int end=ub;
		while(start<end) {
			while(a[start]<=pivot && start<end) {
				start+=1;
			}
			while(a[end]>pivot) {
				end-=1;
			}
			if(start<end) {
				int temp=a[start];
				a[start]=a[end];
				a[end]=temp;
			}
		}
		a[lb]=a[end];
		a[end]=pivot;
		return end;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=scanner.nextInt();
		int []a=new int[n];
		System.out.println("Enter "+n+" elements:");
		for(int i=0;i<n;i++) {
			a[i]=scanner.nextInt();
		}
		QuickSort q=new QuickSort();
		q.quick(a,0,a.length-1);
		System.out.println("The sorted elements are:");
		for(int ele:a) {
			System.out.println(ele);
		}
		

	}
	
	

}
