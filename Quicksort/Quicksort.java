import java.util.Random;

class Quicksort{


	public static void main(String[] args){
		int[] ar = new int[10];
		randomize(ar);
		printArray(ar);

		sort(ar, 0, ar.length - 1);

		printArray(ar);
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
		int i = l - 1;
		int j = r + 1;
		while(true){
			do{ i++; } while(a[i] < p);

			do{ j--; } while(a[j] > p);
			if(i < j){
				exchange(a, i, j);
			} else {
				return j;
			}
		}

	}

	//Die eigentliche Tauschfunktion
	public static void exchange(int[] a, int x, int y){
		int tmp = a[x];
		a[x] = a[y];
		a[y] = tmp;
	}

	public static void printArray(int[] arr){
		for(int i: arr){
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void randomize(int[] a){
		Random r = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(101);
		}
	}
}
