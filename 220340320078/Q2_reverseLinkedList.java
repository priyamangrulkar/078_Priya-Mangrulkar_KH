import java.util.*;

class Q2_reverseLinkedList
{
	Scanner sc=new Scanner(System.in);
	Node head;
	
	class Node{
		Node next;
		int data;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	public void insert(){
		int n=sc.nextInt();
		for(int i=1; i<=n; i++){
			int d=sc.nextInt();
			Node new_Node=new Node(d);
		if(head==null){
			head=new_Node;
		}
		else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;	
			}
			 temp.next=new_Node;
		}
		}
	}
	public void rev(Node temp){
		if(temp==null){
			return;
		}
		else{
			rev(temp.next);
			System.out.print(temp.data+" ");
		}
	}
	public void reverse(){
		rev(head);
		System.out.println();
	}
	
	public static void main(String[] args){
		Q2_reverseLinkedList q= new Q2_reverseLinkedList();
		q.insert();
		q.reverse();
	}
}
