import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,0,0,1};
		int j=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				//j=i;
				nums[j++]=nums[i];
				//nums[i]=0;
			}
		}
		for(int i=0;i<nums.length;i++)
		System.out.println(nums[i]);
	}

}
