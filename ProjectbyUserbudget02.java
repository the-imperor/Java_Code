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
    int budget;
    
    public Project(int id,String name,int budget)
    {
        this.id= id;
        this.name= name;
        this.budget=budget;
    }
    
    public String toString()
    {
        return this.id + " " + this.name + " " + this.budget ;
    }
    
}

class Test {
    
	public static void main (String[] args) {
	    User u1 = new User(1,"User1",100 , List.of("Prj1","ATT","1000"));
	    User u2 = new User(2,"User2",450,List.of("Prj2","Google","320"));
	    User u3 = new User(3,"User3",500,List.of("Prj1","ATT","1000"));
	    
	    List <User> finlist = new ArrayList<>();
	    finlist.add(u1);
	    finlist.add(u2);
	    finlist.add(u3);
	   

	   Map<String,List<Project>> map = new HashMap<>();
	   List<Object> OutofBudget = new ArrayList<>();
	   for(User l:finlist)
	   {
	       int flag=1;
	       if(map.get(l.list.get(0))== null)
	       {
	           int s = Integer.parseInt(l.list.get(2));
	           double f = s  + s/10.0 ;
	           if(f>l.salary)
	           {
	             map.put(l.list.get(0),new ArrayList<Project>());
	           }
	           else{
	               OutofBudget.add(List.of(l.id,l.name,l.salary,List.of(l.list.get(0),l.list.get(1),l.list.get(2))));
	               flag=0;
	           }
	       }
	       
	       if(flag==1){
	           Project p = new Project(l.id,l.name,l.salary);
	           map.get(l.list.get(0)).add(p);
	       }
	       flag=1;
	       
	   }
	   
	   System.out.println("InBudget:");
	   for(Map.Entry<String,List<Project>> entry : map.entrySet())
	    {
	        System.out.println(entry.getKey() + ": " + entry.getValue());
	    }
	   
	   if(OutofBudget.size()!=0){
	        System.out.println("\nOutofBudget:");
            for (Object o:OutofBudget)
            {
               System.out.println(o);
            }
	   }
	}
	
}
