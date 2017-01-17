class Quicksort{
	public static void main(String[] args){

	}

	//Die Sortierfunktion
	public static void sort(int[] a, int l, int r){
		if(l < r){
			int m = partition(a, l, r);
			sort(a, l, m);
			sort(a, m + 1, r);
		}
	}
	//Teilt den übergebenen Bereich und gibt das Pivotelement zurück
	public static int partition(int[] a, int l, int r){
		int p = a[(l + r) / 2]; 							//Ermitteln des Pivotelements
		
	}

	//Die eigentliche Tauschfunktion
	public static void exchange(int[] a, int x, int y){
		int tmp = a[x];
		a[x] = a[y];
		a[y] = tmp;
	}
}
