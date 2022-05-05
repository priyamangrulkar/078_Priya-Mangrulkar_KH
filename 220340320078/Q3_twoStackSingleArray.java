class Q3_twoStackSingleArray
{  
    class stacks{
		int arr[];
		int Top1;
		int Top2;
		int n;
		
		stacks(int n){
			arr[]=new int[n];   //n is size of array
			Top1=-1;
			Top2=n;
		}
	}
	
	void push1(int data){
		if(Top1<Top2){
			arr[++Top1]=data;
		}
		else
			return;
	}
	
	void push2(int data){
		if(Top1<Top2){
			arr[--Top2]=data;
		}
		else
			return;
	}
	
	int pop1(){
		if(Top1>=0)
		{
			int temp=arr[Top1];
		  Top1--;
		  return temp;
		}
	    else
			return;
	}
	
	int pop2(){
		if(Top1<=size)
		{
		  int temp=arr[Top2];
		  Top2++;
		  return temp;
		}
	    else
			return;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Q3_twoStackSingleArray s=new Q3_twoStackSingleArray(n);
		
		s.push1(5);
		s.push2(10);
		s.push2(15);
		s.push1(11);
		s.push2(7);
		s.push2(40);
		
		System.out.println("Popped element from stack1 is "+ s.pop1() );
		System.out.println("Popped element from stack1 is "+ s.pop2() );
		
	}
}