import java.io.*;


public class BubbleSort2	{
	
	public int zahl[] = {42, 56, 24, 1, 74, 7, 8, 27, 96, 12};
	
	public int[] sort()	{
		int k;
		for (int i = 0; i < zahl.length-1; i++)	{
			if (zahl[i] > zahl[i+1])	{
				k = zahl[i];
				zahl[i] = zahl[i+1];
				zahl[i+1] = k;
				ausgabe();
				sort();	
			}
			
		}
		return zahl;
		
	}
	public void ausgabe()	{
		for (int i=0; i<zahl.length; i++)	{
				System.out.print(zahl[i]+"  ");
		}
	System.out.print("\n");
	}
	
}
