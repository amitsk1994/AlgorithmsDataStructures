import java.util.ArrayList;

public class ReverseLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="Test1ng-Leet=code-Q!";
		ArrayList<Integer>arr=new ArrayList<Integer>();
		StringBuffer o=new StringBuffer(S);
		StringBuffer str=new StringBuffer();
		int j=0;
		for(int i=0;i<S.length();i++) {
			if((S.charAt(i)>=65&&S.charAt(i)<=90)||(S.charAt(i)>=97&&S.charAt(i)<=122)){
				str.append(S.charAt(i));
				arr.add(i);
			}
		}
		str.reverse();
		System.out.println(o);
		System.out.println(arr);
		
		for(int i=0;i<arr.size();i++) {
			int k=arr.get(i);
			o.setCharAt(k, str.charAt(j));
			j++;
		}
		System.out.println(o.toString());
	}

}
