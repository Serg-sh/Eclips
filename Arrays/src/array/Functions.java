package array;

public class Functions {
	static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}

		}
	}

	static void outElemArray(int[] arr) {
		System.out.println();
		System.out.print("Имеем массив: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(+arr[i] + " ");
		}
	}

	static void outElemArrayChar(char[] arr) {
		System.out.println();
		System.out.print("Имеем массив: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((char) arr[i] + " ");
		}
		System.out.println();
	}

	static int findChar(char[] arr, char elem) {

		int n = arr.length / 2;
		int m = arr.length;
		if (elem<arr[0]||elem>arr[arr.length-1]){
			return -1;
		}
		while (elem != arr[n]) {
			if(elem < arr[n]&elem>arr[n-1]){
				return -1;
			}
			if (elem < arr[n]){
				m=n;
				n/=2;
			}else{
				 n=(m+n)/2;
				
			}

		}
		return n;
	}
}
