import java.util.HashMap;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {4};
		
		int r=0;
		HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
		
		map.put(nums[0], 1);
		for(int i=1;i<nums.length;i++) {
			if(map.containsKey(nums[i])) {
				int k=map.get(nums[i]);
				map.put(nums[i], k+1);
			}
			else{
				map.put(nums[i], 1);
			}
		}
		for(int i:map.keySet()) {
			if(map.get(i)==1) {
				r=i;
				break;
			}
			
		}
		System.out.println(r);
	}

}
