

import java.io.*;

class Test {
	public static void main (String[] args) {
		int a[] = {1,2,9,8,10,5};
		int[] even = new int[1000];
		int[] odd = new int[1000];
		int ce=0,co=0; //counter for even and odd
		for(int i=0;i<a.length;i++)
		{
		    if(a[i]%2!=0)
		    {
		        odd[co]=a[i];
		        co++;
		    }
		    else{
		      even[ce]=a[i];
		      ce++;
		    }
		}
		
		//sort
		for(int j=0;j<ce;j++)
		{
		    for (int k=j+1;k<ce;k++)
		    {
		        if(even[k]>even[j])
		        {
		            //swap
		            even[k]=even[k]^even[j];
		            even[j]=even[k]^even[j];
		            even[k]=even[k]^even[j];
		        }
		    }
		}
		
		for(int j=0;j<co;j++)
		{
		    for (int k=j+1;k<co;k++)
		    {
		        if(odd[k]>odd[j])
		        {
		            //swap
		            odd[k]=odd[k]^odd[j];
		            odd[j]=odd[k]^odd[j];
		            odd[k]=odd[k]^odd[j];
		        }
		    }
		}
		
		int k=0,i=0,j=0;
		while(i<ce)
		{
		    a[k]=even[i];
		    k++;i++;
		}
		while(j<co)
		{
		    a[k]=odd[j];
		    j++;k++;
		}
		
		for(i=0;i<a.length;i++)
		{
		    System.out.print(a[i]+" ");
		}
	}
}
