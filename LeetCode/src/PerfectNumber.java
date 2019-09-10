import java.util.ArrayList;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=28;
		ArrayList<Integer>a=new ArrayList<Integer>();
		for(int i=1;i<n/2+1;i++) {
			if(n%i==0) {
				a.add(i);
			}
		}
		int sum=0;
		for(int k:a) {
			sum+=k;
		}
		System.out.println(sum);
	}

}
