package sorting;

class array{
	public static void printArray(int arr[]) {
		for(int i=0 ;i<arr.length ; i++) {
			System.err.println(arr[i]);
		}
	}
}
public class selectoin_sort {

	public static void main(String[] args) {
		int arr[]= {7,8,3,1,2};
		for(int i=0 ; i<arr.length-1;i++) {
			int smallest=i;
			for(int j=i+1 ; j<arr.length;j++) {
				if(arr[smallest]>arr[j]) {
					smallest=j;
				}
			}
			int temp = arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
		array.printArray(arr);
	}

}
