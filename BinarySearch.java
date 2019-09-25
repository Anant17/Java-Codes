import java.util.*;

class BinarySearch 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter Number of Elements");
		int n=sc.nextInt();
		int[] el=new int[n];
		System.out.println("Enter "+n+" Integer values");
        for(i=0;i<=n-1;i++){
			el[i]=sc.nextInt();
        }
		System.out.println("List is:");
		System.out.println(Arrays.toString(el));    
		Arrays.sort(el);
		System.out.println("Sorted List is");
        System.out.println(Arrays.toString(el));
		System.out.println("Enter Number you want to search");
		int se=sc.nextInt();
		int li=0, hi=n-1;
		int c=(li+hi)/2;
		while(li<=hi){
		    if(se==el[c]){
				System.out.println("Searching Element Index is: "+c);
				break;
			}
			else if(se>el[c]){
				li=c+1;
			}
			else{
				hi=c-1;
			}
		
		c=(li+hi)/2;
		}
	
	}
}
