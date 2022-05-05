import java.util.*;
class Q1_insertionSort{
	
	void insertion_sort(int a1[]){
		int n=a1.length;
		for(int i=n-1; i>0 ; i--){
			int k=a1[i];
			int j=i-1;
			while(j>=0 && a1[j]>k){
				a1[j+1]=a1[j];
				j=j-1;
				display(a1);
			}
			a1[j+1]=k;
		}
	}
	
    void display(int a1[]){
		for(int i=0; i<a1.length;i++){
			System.out.print(a1[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		Q1_insertionSort q=new Q1_insertionSort();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a1[]=new int[n];
		for(int i=0;i<n;i++){
			a1[i]=sc.nextInt();
		}
        q.insertion_sort(a1);
		q.display(a1); 
		
	}
}