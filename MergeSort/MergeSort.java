import java.util.Random;

class MergeSort{

	public static  void main(String[] args){
		int[] a = new int[10];

		randomize(a);

		printArray(a);
		sort(a , 0, a.length-1);
		printArray(a);
	}




	public static void sort(int[] a, int l, int r){
		if(l < r){
			int m = (l + r) / 2;
			sort(a, l, m);
			sort(a, m + 1, r);

			merge(a, l, m, r);

		}
	}



	private static void merge(int[] a, int l, int m, int r){
		int[] tmp = new int[a.length];

		for(int i = l; i <= m; i++){
			tmp[i] = a[i];
		}
		for (int j = m  + 1; j <= r; j++) {
			tmp[r + m + 1 - j] = a[j];
		}
		int i = l;
		int j = r;

		for(int k = l; k <= r; k++){
			if(tmp[i] <= tmp[j]){
				a[k] = tmp[i];
				i++;
			} else {
				a[k] = tmp[j];
				j--;
			}
		}
	}

	public static void printArray(int[] arr){
		for(int i: arr){
			System.out.println(i);
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
