import java.io.*;


public class BubbleSort	{
	
	int zahl[] = {42, 56, 24, 1, 74, 7, 8, 27, 96, 12};
	public static int a;
	public static int b;
	

	
	/*public void bubblesort()
    {
        // initialise instance variables
      ausgabe();
      sortieren();
      tausche(a, b);
    }  */

    
    public void ausgabe() {
        System.out.print(zahl[0]);
        for (int i=1; i<zahl.length; i++) {
            System.out.print(", ");
            System.out.print(zahl[i]);
        }
        System.out.println();
    }
    
    public void tausche(int a, int b)  {
        int temp = zahl[a];
        zahl[a] = zahl[b];
        zahl[b] = temp;
        ausgabe();
    }
    
    public void sortieren() {
        for (int i=0; i<zahl.length-1; i++) {
            for (int j=0; j<zahl.length-(i+1); j++) {
                if (zahl[j] > zahl[j+1]) tausche(j, j+1);
            }
        }
    }

}
