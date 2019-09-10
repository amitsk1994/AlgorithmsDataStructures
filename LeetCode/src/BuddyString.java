import java.util.Arrays;

public class BuddyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A="aaaaaaabc";
		String B="aaaaaaacb";
		char C[]=A.toCharArray();
		char D[]=B.toCharArray();
		int flag=0;
		if(A.length()!=B.length())flag=1;
		Arrays.sort(C);
		Arrays.sort(D);
		boolean ans=Arrays.equals(C, D);
		System.out.println(ans);
	}

}
