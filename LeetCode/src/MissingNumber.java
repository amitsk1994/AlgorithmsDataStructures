import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {3,0,1};
		int k=0;
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++) {
			if(i!=nums[i]) {
				k=i;
				break;
			}
		}
		System.out.println(k);
	}

}
