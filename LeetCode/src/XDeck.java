import java.util.Arrays;
import java.util.HashMap;

public class XDeck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int deck[]= {1,1,2,2,2,2};
		
		Arrays.sort(deck);
		HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
		for(int i=0;i<deck.length;i++) {
			if(h.containsKey(deck[i])) {
				h.put(deck[i], h.get(deck[i])+1);
			}
			else {
				h.put(deck[i], 1);
			}
		}
		//System.out.println(h);
		int k=h.get(deck[0]);
		int flag=0;
		for(int i:h.values()) {
			if(i<2) {
				flag=1;
				break;
			}
			if(i==k)continue;
			else {
				flag=1;
				break;
			}
			
		}
		if(flag==0)System.out.println("true");
		else System.out.println("false");
		
	}

}
