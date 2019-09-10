import java.util.HashMap;

public class TownJudge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=4;
		int trust[][]= {{1,3},{1,4},{2,3},{2,4},{4,3}};
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		for(int i=0;i<N;i++) {
			for(int j=0;j<2;j++) {
				if(h.containsKey(trust[i][0])) {
					h.put(trust[i][0], h.get(trust[i][0])+1);
				}
				else h.put(trust[i][0], 1);
			}
		}
		System.out.println(h);
	for(Integer key:h.keySet()) {
		if(h.get(key)==0)System.out.println(key);
	}
	}

}
