import java.util.ArrayList;

public class ArrayFormInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {9,9,9};
		int k=181;
		int act=0;
		int mul=A.length-1;
		for(int i=0;i<A.length;i++) {
			act+=A[i]*Math.pow(10, mul);
			mul--;
		}
		act+=k;
		System.out.println(act);
		ArrayList<Integer>arr=new ArrayList<Integer>();
		while(act!=0) {
			arr.add(0, act%10);
			act/=10;		
		}
		
		System.out.println(arr);
	}

}
