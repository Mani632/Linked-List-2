// { Driver Code Starts
import java.util.*;

class Node
{
	int data ;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class Delete_Node
{
	Node head;
	Node tail;
	
	void printList(Node head)
	{
		Node tnode = head;
		while(tnode != null)
		{
			System.out.print(tnode.data+ " ");
			tnode = tnode.next;
		}
		System.out.println();
	}
	
	void addToTheLast(Node node)
	{
		
		if(head == null)
		{
			head = node;
			tail = node;
		}
		else
		{
		    tail.next = node;
		    tail = node;
		}
	}
	
	Node search_Node(Node head, int k)
	{
		Node current = head;
		while(current != null)
		{
			if(current.data == k)
				break;
			current = current.next;
		}
	return current;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			Delete_Node llist = new Delete_Node();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
			
			int k = sc.nextInt();
			Node del = llist.search_Node(llist.head,k);
			
			Solution g = new Solution();
			if(del != null && del.next != null)
			{
				g.deleteNode(del);
			}
			llist.printList(llist.head);
		t--;
		}
	}
}


// } Driver Code Ends


/*
class Node
{
	int data ;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/

// This function should delete node from linked list. The function
// may assume that node exists in linked list and is not last node
// node: reference to the node which is to be deleted

//Time complexity:O(1)
//Space complexity:O(1)
class Solution
{
    void deleteNode(Node node)
    {
         // Your code here
         node.data = node.next.data;	//Assigning next value to present node.
         node.next = node.next.next;	//assigning next as next of next;
    }
}

