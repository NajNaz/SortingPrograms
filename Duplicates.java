//1. WAP to find the duplicates present in an array.
import java.util.*;
public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=scanner.nextInt();
		int flag=0;
		int []a=new int[n];
		System.out.println("Enter the "+n+" elements:");
		for (int i=0;i<n;i++) {
			a[i]=scanner.nextInt();
		}
		
		System.out.print("Duplicate values are: ");
		for (int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[j]==a[i]) {
					System.out.print(a[i]+" ");
					flag=1;
				}
			}
		}
		if (flag==0) {
			System.out.print("Nil");
		}
		

	}

}
