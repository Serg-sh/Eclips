package array;


public class SortArr {

	public static void main(String[] args) {
		int[] arr1 = { 9, 7, 3, 5, -6, 8 };
		char[] arr2 = {'a','c','d','e','f','g','h','i','k','l'};
		char[] arr3 = {'f','a','g','y','w','k','t','l','e','b'};
		char elm ='a';
		
		Functions.outElemArray(arr1);
		Functions.sort(arr1);
		Functions.outElemArray(arr1);
		Functions.outElemArrayChar(arr2);
		for (char c : arr3) {
			System.out.println("Элемент "+ c + " находится в ячейке № "+Functions.findChar(arr2, c));
		}
		
		


	}
}
