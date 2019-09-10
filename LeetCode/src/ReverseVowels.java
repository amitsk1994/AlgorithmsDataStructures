import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class ReverseVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Sore was I ere I saw Eros.";
		
		LinkedHashMap<Integer,Character>m=new LinkedHashMap<Integer,Character>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||
					s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
				m.put(i, s.charAt(i));
			}
		}
		System.out.println(m);
		ArrayList<Integer>a=new ArrayList<Integer>();
		
		for(int i:m.keySet()) {
			a.add(i);
		}
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
		StringBuffer str=new StringBuffer(s);
		int j=0;
		for(int i=0;i<str.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||
					s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
				str.replace(i, i+1, Character.toString(s.charAt(a.get(j))));
				j++;
			}
		}
		System.out.println(str);
		
	}

}
