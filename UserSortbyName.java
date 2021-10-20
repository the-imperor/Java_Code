import java.io.*;
import java.util.*;
import java.lang.*;


public class User{
    int id;
    String name;
    int salary;
    public User (int id, String name, int salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    
    public String toString()
    {
        return this.id + " " + this.name + " "
            + this.salary;
    }
    
}

class SortbyName implements Comparator<User>{
    public int compare(User A,User B)
    {
        return A.name.compareTo(B.name);
    }
}

class Test {
    
	public static void main (String[] args) {
	    User u1 = new User(1,"User1",1000);
	    User u2 = new User(4,"User3",400);
	    User u4 = new User(2,"User2",600);
	    
	    List <User> list = new ArrayList<>();
	    list.add(u1);
	    list.add(u2);
	    list.add(u4);
	    
	    Collections.sort(list, new SortbyName());
	    
	    for(int i=0;i<list.size();i++)
	    System.out.println(list.get(i));
	}
	
}
