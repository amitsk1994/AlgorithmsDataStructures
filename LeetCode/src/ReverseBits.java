
public class ReverseBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=43261596;
		String x=Integer.toBinaryString(n);
		StringBuffer f=new StringBuffer(x);
		System.out.println(f);
		f.reverse();
		String ans=f.toString();
		int ans1=Integer.parseInt(ans,2);
		System.out.println(f);
		System.out.println(ans1);
	}

}
