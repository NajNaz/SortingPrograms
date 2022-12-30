//6. WAP to check whether an array is a subset of another array.
import java.util.*;
public class SubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements in main array:");
		int n=scan.nextInt();
		int []a=new int[n];
		System.out.println("Enter the "+n+" array elements:");
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("Enter the number of elements in second array:");
		int m=scan.nextInt();
		int []b=new int[n];
		System.out.println("Enter the "+m+" array elements:");
		for(int i=0;i<m;i++) {
			b[i]=scan.nextInt();
		}
		int k=0;
		int flag=0;		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(b[i]==a[j]) {
					k++;
					break;
				}
			}
		}
		if(k==m) {
			System.out.println("Second array is a subset of main array");
		}
		else {
			System.out.println("Second array is NOT a subset of main array");
		}
		
		

	}

}
