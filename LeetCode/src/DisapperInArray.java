import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DisapperInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {4,3,2,5,7,8,2,3,1};
		ArrayList<Integer>l=new ArrayList<Integer>();	
		int i=0;
		for(i=0;i<nums.length;i++) {
			l.add(nums[i]);
		}
		//System.out.println(l);
		int j=0;
		for(i=1;i<=nums.length;i++) {
			if(l.contains(i)) {
				continue;
			}
			else {
				nums[j++]=i;
			}
		}
		l.clear();
		for(i=0;i<j;i++) {
			l.add(nums[i]);
		}
		System.out.println(l);
	}
}
	
