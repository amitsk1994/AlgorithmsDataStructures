import java.util.ArrayList;
import java.util.Arrays;

public class SortedSquareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {-4,-1,0,3,10};
		ArrayList<Integer>arr=new ArrayList<Integer>();
		int k=0;
		for(int i=0;i<A.length;i++) {
			k=(int) Math.pow(A[i], 2);
			A[i]=k;
		}
		Arrays.sort(A);
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]);
		}
	}

}
