import java.io.*;
import java.util.Scanner;

class Main	{
	
	
	public static void main(String[] args) throws IOException	{
			
		BubbleSort bubblesort = new BubbleSort();
		
		bubblesort.sortieren(); 
		bubblesort.tausche(BubbleSort.a, BubbleSort.b);
		//bubblesort.ausgabe();
	
	}
	
} 
