
public class RotateRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2};
		//int arr[]=new int[nums.length];
		int k=3;
		//int j=0;
		int cnt=0;
		while(cnt<k) {
			int temp=nums[nums.length-1];
			for(int i=nums.length-1;i>0;i--) {
				nums[i]=nums[i-1];
			}
			nums[0]=temp;
			cnt++;
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}

}
