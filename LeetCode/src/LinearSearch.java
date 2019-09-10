
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5};
		int index=search(arr,0,5);
		System.out.println(index);
	}

	private static int search(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		if(i>arr.length) {
			System.out.println("-1");
			return -1;
		}
		else if(arr[i]==j){
			System.out.println("equals");
			return i;
		}
		else {
			
			int x= search(arr,i+1,j);
			System.out.println("recurr call");
			return x;
		}
	}

}
