import java.util.ArrayList;

public class RemoveDuplictes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,1,2,2,3,3,4,4,5,5,6,6,6,6};
		ArrayList <Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(!arr.contains(nums[i])) {
				arr.add(nums[i]);
			}
		}
		int k=0;
		for(Integer a:arr) {
			nums[k]=a;
			k++;
		}
		System.out.println(arr.size());
	}

}
