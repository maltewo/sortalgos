//Dieses Programm rechnet eine gegebene binäre Zahl ins unäre Zahlensystem um.
import java.io.*;
import java.util.Scanner;


class ConvertToUnary	{
	
	static String binaerzahl = ("110");
	//int dezimal;
	
	/*public static void binaerzahl() throws IOException	{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.print("Bitte Binaerzahl eingeben: ");
    binaerzahl = br.readLine();
    }    */
	
	int dezimal = Integer.parseInt(binaerzahl, 2);  //Hier wird aus dem Binärstring ein Dezimal-Integer erzeugt
	
	public void umrechnung()	{
		for (int i=1; i<=dezimal; i++)	{
			System.out.print(1);
		}
	}
	
	
}



// System.out.println(Integer.toBinaryString(23));
