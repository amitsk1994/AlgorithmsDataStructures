import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MonotonicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {3,2,4,2,1};
		Integer[] B = ( Arrays.stream( A )).boxed().toArray( Integer[]::new );
		ArrayList<Integer>l=new ArrayList<Integer>();
		for(int i=0;i<A.length;i++) {
			l.add(A[i]);
		}
		l.sort(null);
		if(Arrays.equals(B,l.toArray())) {
			System.out.println("true");
		}
		Collections.reverse(l);
		
	    if(Arrays.equals(B,l.toArray())) {
	    	System.out.println("true");
		}
	    else System.out.println("false");
		System.out.println(l);
	}

}
