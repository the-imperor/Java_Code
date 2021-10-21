import java.io.*;
import java.util.*;
import java.lang.*;


public class User{
    int id;
    String name;
    int salary;
    List<String> list = new ArrayList<String>();
    public User (int id, String name, int salary,List<String> l)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.list = l;
    }
    
}

class Project{
    int id;
    String name;
    int salary;
    
    public Project(int id,String name,int salary)
    {
        this.id= id;
        this.name= name;
        this.salary=salary;
    }
    
    public String toString()
    {
        return this.id + " " + this.name + " " + this.salary ;
    }
    
}

class Test {
    
	public static void main (String[] args) {
	    User u1 = new User(1,"User1",100 , List.of("Prj1","ATT","1000"));
	    User u2 = new User(2,"User2",150,List.of("Prj2","Google","320"));
	    User u3 = new User(3,"User3",500,List.of("Prj1","ATT","1000"));
	    
	    List <User> finlist = new ArrayList<>();
	    finlist.add(u1);
	    finlist.add(u2);
	    finlist.add(u3);
	   

	   Map<String,List<Project>> map = new HashMap<>();
	   for(User l:finlist)
	   {
	       if(map.get(l.list.get(0))== null)
	       {
	           
	           map.put(l.list.get(0),new ArrayList<Project>());
	       }
	       
	           Project p = new Project(l.id,l.name,l.salary);
	           map.get(l.list.get(0)).add(p);
	           
	       
	   }
	   
	   for(Map.Entry<String,List<Project>> entry : map.entrySet())
	    {
	        System.out.println(entry.getKey() + ": " + entry.getValue());
	    }
	   
	   
	}
	
}
