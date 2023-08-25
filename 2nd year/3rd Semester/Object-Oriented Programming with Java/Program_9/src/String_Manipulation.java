package CollectionFrameWork;

import java.util.*;
public class String_Manipulation {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		
		int choice;
		int index;
		String str;
		System.out.println("\tString Manipulation");
		System.out.println("1.Append\n2.Insert\n3.Search element\n4.List\n5.Size of array \n6.remove an element \n7.sort\n8.Display\n9.Exit");
	
		for(;;)
		{
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1: 
				System.out.print("Enter a String : ");
				str = sc.next();
				arr.add(str);
				break;
				
			case 2: 
				System.out.print("Enter a String :");
				str = sc.next();
				System.out.print("Enter a index : ");
				index = sc.nextInt();
				arr.add(index, str);
				break;
			case 3:
				System.out.print("Enter a String to be searched :");
				str = sc.next();
				if(arr.indexOf(str) == -1)
				{
					System.out.print("Element not found ");
					break;
				}
				System.out.print("Element found at "+ arr.indexOf(str));
				break;
			case 4: 
				System.out.println("Enter the String :");
				String ch = sc.next();
				for(int i=0;i<arr.size() ;i++)
				{
					str =arr.get(i);
					if(str.startsWith(ch))
					{
						System.out.print(str);
					}
				}
				break;
			case 5: System.out.print("Length of arraylist : "+ arr.size());
				break;
			case 6:
				System.out.print("Enter a string to remove : ");
				str = sc.next();
				arr.remove(str.indexOf(str));
				break;
			case 7: Collections.sort(arr);
				break;
			case 8: System.out.print("ELements are : " +arr);
				break;
			case 9: System.exit(0);
				break;
			}
		}
	}
}
