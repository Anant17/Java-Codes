import java.util.*;
class StackImpl
{
	static int n;
	static Scanner sc=new Scanner(System.in);
	static ArrayList<Integer> al=new ArrayList<Integer>();
	public static void main(String[] args){
        StackImpl si=new StackImpl();

		System.out.println("Enter number of stack elements");
		n=sc.nextInt();
		
		System.out.println("Enter The Elements in the stack");
		for (int i=0;i<=n-1 ;i++ )
		{
			al.add(sc.nextInt());
			
		}
		System.out.println("your Stack is: ");
		System.out.println(al);

		System.out.println("Do You want to perform Operation  on the  stack :");
		System.out.println("Enter Y if Yes or N if No: ");
		String ans=sc.next();
		if(ans.equalsIgnoreCase("y")){
			System.out.println("Which Operatio You Want To perform:");
		    System.out.println("Enter insert if Want to add Element or delete if want to remove the element: ");
			String op=sc.next();
			if(op.equalsIgnoreCase("insert"))
				si.push();
			else
				si.pop();
		System.out.println("After Operation your Stack is: ");
		System.out.println(al);
		}
		else{
			System.out.println("Thanks For Using The App");
		}
		

	}
	public void push(){
	    System.out.println("Enter The Number To Add In The Stack: ");
		int j=sc.nextInt();
		al.add(n,j);
	}
	public void pop(){
		al.remove(n-1);
	}
	
}
