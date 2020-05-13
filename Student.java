package javacollectionframework;

public class Student 
{
    int rollno;
    String name;
    Student()
    {
    	rollno=0;
    	name=" ";
    }
    Student(int r,String n)
    {
    	this.rollno=r;
    	this.name=n;
    }
    void display()
    {
    	System.out.println("RollNo: "+rollno+"  "+"Name: "+name);
    }
}
