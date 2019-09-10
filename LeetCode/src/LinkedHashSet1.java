import java.util.LinkedHashSet;
public class LinkedHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		lh.add("Amit");
		lh.add("Kishan");
		lh.add("Adwait");
		System.out.println(lh);
		for(String s:lh) {
			System.out.println(s);
		}
	}
 
}
