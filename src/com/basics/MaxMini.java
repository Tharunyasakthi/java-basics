package com.basics;

public class MaxMini {
	public static void main(String args[]) {
		int array[]=new int[] {46,4,20,64,24};
		int max=array[0];
		int min=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
			if(array[i]<min)
			{
				min=array[i];
			}
		}
		System.out.println("maximum value is:"+max);
		System.out.println("minimum value is:"+min);
	
	}

}
