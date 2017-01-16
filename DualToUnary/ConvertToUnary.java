//Dieses Programm rechnet eine gegebene binäre Zahl ins unäre Zahlensystem um.
import java.io.*;


class ConvertToUnary	{
	
	static String binaerzahl;
	public static int dezimal;

//Eingabemethode	
	public static void eingabe() throws IOException	{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.print("Bitte Binärzahl eingeben: ");
    binaerzahl = br.readLine();
	dezimal = Integer.parseInt(binaerzahl, 2);  //Hier wird aus dem Binärstring ein Dezimal-Integer erzeugt
    }    
	

//Die Methode "Umrechnung" rechnet den Dezimal-Intger in eine unäre Zahl um und gibt das Ergebnis aus
	public void umrechnung()	{
		System.out.println("Die binäre Zahl " + binaerzahl + " lautet im Unärsystem: ");
		for (int i=1; i<=dezimal; i++)	{
			System.out.print(1);
		}
	}
}

