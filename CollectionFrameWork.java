
/*abstract data type stack arraylist and linkedlist*/
package javacollectionframework;
import java.util.*;
public class CollectionFrameWork {

	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		int ch,chh;
		do
		{
			System.out.println("1.ArrayList");
			System.out.println("2.Stack");
			System.out.println("3.LinkedList");
			System.out.println("Enter your choice");
			ch=s.nextInt();
			switch(ch)
			{
			case 1: System.out.println("1.IntegerType");
			        System.out.println("2.StringType");
			        System.out.println("3.ADType(Student)");
			        System.out.println("Enter your choice");
			        chh=s.nextInt();
			        switch(chh)
			        {
			        case 1: ArrayList<Integer> al = new ArrayList<Integer>(); 
			                al.add(1);al.add(2); al.add(3); al.add(4);al.add(5);
			                System.out.println("elements of array list"+al);
			                System.out.println("Size of array list: "+ al.size());
			                al.remove(3);
			                System.out.println("size after removal: "+al.size());
			                System.out.println("elements of array list after removal"+al);break;
			        case 2: ArrayList<String> sl = new ArrayList<String>();
			                sl.add("java"); sl.add("is");sl.add("easy");sl.add("langauge");sl.add("to learn");
			                System.out.println("String is: "+sl);
			                System.out.println("Size is: "+sl.size());
			                sl.remove(2);
			                System.out.println("String after removal is: "+sl);
			                System.out.println("Size after removal is: "+sl.size());break;
			        case 3: Student s1=new Student(1,"Prateeksha");
			                Student s2=new Student(2,"Disha");
			                Student s3=new Student(3,"Neha");
			                Student s4=new Student(4,"Prachi");
			                Student s5=new Student(5,"Pranita");
			                ArrayList<Student> st = new ArrayList<Student>();
			                st.add(s1); st.add(s2);st.add(s3);st.add(s4);st.add(s5);
			                System.out.println("Students rollno and name are: ");
			                Iterator<Student> it=st.iterator();
			                while(it.hasNext())
			                {
			                	s1=it.next();
			                	s1.display();
			                }
			                Student[]ala=new Student[st.size()];
			                ala=st.toArray(ala);
			                for(Student i:ala)
			                {
			                	i.display();
			                }break;
			        }
			case 2: 	System.out.println("1.IntegerType");
	                    System.out.println("2.StringType");
	                    System.out.println("3.ADType(Student)");
	                    System.out.println("Enter your choice");  
	                    int n;
	                    n=s.nextInt();
	                    switch(n)
	                    {
	                    case 1: Stack<Integer> st=new Stack<Integer>();
	                            st.push(1);st.push(2);st.push(3);st.push(4);st.push(5);
	                            System.out.println("Size is: "+ st.size());
	                            System.out.println("Stack is: "+st);
	                            st.pop();st.pop();
	                            System.out.println("Size after popping is: "+ st.size());
	                            System.out.println("Stack after popping is: "+st);break;
	                    case 2: Stack<String> str=new Stack<String>();  
	                            str.add("Prat"); str.add("Dish"); str.add("Neha"); str.add("Prach"); str.add("Pran");
	                            System.out.println("Size is: "+ str.size());
	                            System.out.println("Stack is: "+str);
	                            str.pop();str.pop();
	                            System.out.println("Size after popping is: "+ str.size());
	                            System.out.println("Stack after popping is: "+str);break;
	                            
	                    case 3: Stack<Student> stack=new Stack<Student>();
	                            Student s1=new Student(1,"Prateeksha");
		                        Student s2=new Student(2,"Disha");
		                        Student s3=new Student(3,"Neha");
		                        Student s4=new Student(4,"Prachi");
		                        Student s5=new Student(5,"Pranita");
		                        stack.add(s1);stack.add(s2);stack.add(s3);stack.add(s4);stack.add(s5);
		                        System.out.println("Size is: "+ stack.size());
		                        System.out.println("Students rollno and name are: ");
		                        Iterator<Student> it=stack.iterator();
		                        while(it.hasNext())
		                        {
		                        	s1=it.next();
		                        	s1.display(); 
		                        }break;
	                    }
			case 3:   System.out.println("1.IntegerType");
                      System.out.println("2.StringType");
                      System.out.println("3.ADType(Student)");
                      System.out.println("Enter your choice");  
                      int n1;
                      n1=s.nextInt();  
                      switch(n1)
                      {
                      case 1: LinkedList<Integer> li=new LinkedList<Integer>();
                              li.add(1); li.add(2);li.add(3);li.add(4);li.add(5);
                              System.out.println("Size is: "+ li.size());
                              System.out.println("List is:"+ li);
                              li.addFirst(0);
                              li.removeLast();
                              System.out.println("Size after manupulation is: "+ li.size());
                              System.out.println("List after manupulation is:"+ li);break;
                      case 2: LinkedList<String> ls=new LinkedList<String>();  
                              ls.add("Prat"); ls.add("Dish");ls.add("Neha");ls.add("Prach");ls.add("Pran");
                              System.out.println("Size is: "+ ls.size());
                              System.out.println("List is:"+ ls);
                              ls.addLast("Vaish");
                              ls.removeLast();ls.removeLast();
                              System.out.println("Size after manupulation is: "+ ls.size());
                              System.out.println("List after manupulation  is:"+ ls);break;
                      case 3: LinkedList<Student> lss=new LinkedList<Student>();
                              Student s1=new Student(1,"Prateeksha");
                              Student s2=new Student(2,"Disha");
                              Student s3=new Student(3,"Neha");
                              Student s4=new Student(4,"Prachi");
                              Student s5=new Student(5,"Pranita"); 
                              lss.add(s1);lss.add(s2);lss.add(s3);lss.add(s4);lss.add(s5);
                              System.out.println("Size is: "+ lss.size());
		                      System.out.println("Students rollno and name are: ");
		                      Iterator<Student> list=lss.iterator();
		                      while(list.hasNext())
		                      {
		                    	  s1=list.next();
		                    	  s1.display();
		                      }break;
                      }
			        
			}
		}while(ch>0&&ch<=3);
	}

}
//output
/*
1.ArrayList
2.Stack
3.LinkedList
Enter your choice
1
1.IntegerType
2.StringType
3.ADType(Student) 
Enter your choice
1
elements of array list[1, 2, 3, 4, 5]
Size of array list: 5
size after removal: 4
elements of array list after removal[1, 2, 3, 5]
1.IntegerType
2.StringType
3.ADType(Student)
Enter your choice
2
Size is: 5
Stack is: [Prat, Dish, Neha, Prach, Pran]
Size after popping is: 3
Stack after popping is: [Prat, Dish, Neha]
1.IntegerType
2.StringType
3.ADType(Student)
Enter your choice
3
Size is: 5
Students rollno and name are: 
RollNo: 1  Name: Prateeksha
RollNo: 2  Name: Disha
RollNo: 3  Name: Neha
RollNo: 4  Name: Prachi
RollNo: 5  Name: Pranita
1.ArrayList
2.Stack
3.LinkedList
Enter your choice
2
1.IntegerType
2.StringType
3.ADType(Student)
Enter your choice
1
Size is: 5
Stack is: [1, 2, 3, 4, 5]
Size after popping is: 3
Stack after popping is: [1, 2, 3]
1.IntegerType
2.StringType
3.ADType(Student)
Enter your choice
2
Size is: 5
List is:[Prat, Dish, Neha, Prach, Pran]
Size after manupulation is: 4
List after manupulation  is:[Prat, Dish, Neha, Prach]
1.ArrayList
2.Stack
3.LinkedList
Enter your choice
3
1.IntegerType
2.StringType
3.ADType(Student)
Enter your choice
3
Size is: 5
Students rollno and name are: 
RollNo: 1  Name: Prateeksha
RollNo: 2  Name: Disha
RollNo: 3  Name: Neha
RollNo: 4  Name: Prachi
RollNo: 5  Name: Pranita
1.ArrayList
2.Stack
3.LinkedList
Enter your choice
1
1.IntegerType
2.StringType
3.ADType(Student)
Enter your choice
2
String is: [java, is, easy, langauge, to learn]
Size is: 5
String after removal is: [java, is, langauge, to learn]
Size after removal is: 4
1.IntegerType
2.StringType
3.ADType(Student)
Enter your choice
3
Size is: 5
Students rollno and name are: 
RollNo: 1  Name: Prateeksha
RollNo: 2  Name: Disha
RollNo: 3  Name: Neha
RollNo: 4  Name: Prachi
RollNo: 5  Name: Pranita
1.IntegerType
2.StringType
3.ADType(Student)
Enter your choice
*/