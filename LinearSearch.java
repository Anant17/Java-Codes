import java.util.*;

class LinearSearch 
{
	Scanner sc=new Scanner(System.in);
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
		/*Arrays.sort(el);
		System.out.println("Sorted List is");
        System.out.println(Arrays.toString(el));*/
		System.out.println("Enter Number you want to search");
		int se=sc.nextInt();
		for(i=0;i<=n-1;i++){
		    if(se==el[i]){
				System.out.println("Index Of Element "+se+" is: "+i);
				i++;
		    }	
		}
	}
}
