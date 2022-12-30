//4. WAP to sort an array using Merge Sort Algorithm.
import java.util.*;
public class MergeSort {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number of elements:");
		int n=scan.nextInt();
		int []a=new int[n];
		//int []arr=new int[n];
		
		
		System.out.println("Enter the "+n+" elements:");
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
			
		}
		System.out.println("Sorted array:");
		
		mergeSort(a,0,a.length-1);
		//System.out.println(Arrays.toString(a));
		for(int ele:a) {
			System.out.println(ele);
		}
		

	}
	public static void mergeSort(int []a,int l,int r) {
		if(l<r) {
			
			int m=(l+r)/2;
			mergeSort(a,l,m);
			mergeSort(a,m+1,r);
			merge(a,l,m,r);
			
		}
	}
	
	public static void merge(int []a,int l,int m, int r) {
		
		int nl=m-l+1;
		int nr=r-m;
		int []la=new int[nl];
		int []ra=new int[nr];
		for(int i=0;i<nl;i++) {
			la[i]=a[l+i];
		}
		for(int j=0;j<nr;j++) {
			ra[j]=a[m+1+j];
		}
		int i=0;
		int j=0;
		int k=l;
		while(i<nl && j<nr) {
			if(la[i]<ra[j]) {
				a[k]=la[i];
				i++;
				k++;
			}
			else {
				a[k]=ra[j];
				j++;
				k++;
			}
		}
		while(i<nl) {
			a[k]=la[i];
			k++;
			i++;
		}
		while(j<nr) {
			a[k]=ra[j];
			k++;
			j++;
		}
		
		
		
	}
	
	

}
