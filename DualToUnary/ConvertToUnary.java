//Dieses Programm rechnet eine gegebene binäre Zahl ins unäre Zahlensystem um.
import java.io.*;


class ConvertToUnary{

	public static String binaerzahl;
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

	//Rechnet die Binärzahl direkt in eine Unäre Zahl um und gibt diese aus (Malte M)
	public static void umrechnung2(){
		String unar = "";
		int l = binaerzahl.length();
		for(int i = 0; i < l; i++){
			if(binaerzahl.charAt(i) == '1'){
				for(int j = 0; j < Math.pow(2, i); j++){

					unar += '1';
				}
			}
		}
		System.out.println();
		System.out.println("Die direkte Umrechnung ergibt:");
		System.out.println(unar);
	}


}
