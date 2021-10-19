import java.io.*;
import java.lang.Math;



class Test {
	public static void main (String[] args) {
		int a[] = {8,9,10,15,16};
		double sq[] = new double [100];
		int ln = 0;
		for(int i=0;i<a.length;i++)
		{
		    sq[ln]=Math.sqrt(a[i]);
		    ln++;
		}
		double whl[] = new double[100];
		double flt[] = new double[100];
		int cint=0,cflt=0;
		
		for(int i=0;i<ln;i++)
		{
		    if(sq[i]-Math.floor(sq[i])==0.0)
		    {
		        whl[cint]= sq[i];
		        cint++;
		    }
		    else
		    {
		        flt[cflt]=sq[i];
		        cflt++;
		    }
		}
		//sort
		
		for(int j=0;j<cint;j++)
		{
		    for (int k=j+1;k<cint;k++)
		    {
		        if(whl[k]>whl[j])
		        {
		            //swap
		            double temp=whl[k];
		            whl[k]=whl[j];
		            whl[j]=temp;
		            
		        }
		    }
		}
		
		for(int j=0;j<cflt;j++)
		{
		    for (int k=j+1;k<cflt;k++)
		    {
		        if(flt[k]>flt[j])
		        {
		            //swap
		            double temp = flt[k];
		            flt[k]=flt[j];
		            flt[j]=temp;
		            
		        }
		    }
		}
		int k=0,i=0,j=0;
		while(i<cint)
		{
		    sq[k]=whl[i];
		    k++;i++;
		}
		while(j<cflt)
		{
		    sq[k]=flt[j];
		    k++;j++;
		}
		
		for(i=0;i<ln;i++)
		{
		    System.out.print(sq[i]+" ");
		}
		
	}
}	
