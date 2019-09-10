import java.util.ArrayList;

public class JewelsStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String J="z";
		String S="ZZ";
		ArrayList<Character>l=new ArrayList<Character>();
		for(int i=0;i<J.length();i++) {
			l.add(J.charAt(i));
		}
		int cnt=0;
		for(int i=0;i<S.length();i++) {
			if(l.contains(S.charAt(i))){
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
