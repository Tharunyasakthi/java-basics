package com.basics;

public class isPerfect {
            public static void main(String args[])
            {
            	isPerfect factor=new isPerfect();
            	System.out.println(factor.number(6));
            }
            public boolean number(int number)
            {
            	int sum=0;
            	for(int i=1;i<=number/2;i++)
            	{
            		{
            			sum=sum+i;
            		}
            	}
            		if(sum==number)
            		{
            			return true;
            			
            		}
            		else
            		{
            			return false;
            		}
            	
            	
            }
}
