import java.util.ArrayList;

public class ArrangingCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		ArrayList<Integer>l=new ArrayList<Integer>();
		for(int i=1;i<=n;i++) {
			l.add(i);
			n=n-i;
		}
		
		System.out.println(l);
	}

}
