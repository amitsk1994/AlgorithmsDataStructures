import java.util.ArrayList;

public class TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {0,4,3,0};
		int target=0;
		//int j=0;
		int flag=0;
		int x[]=new int[2];
		//ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			int tmp=nums[i];
			//if(tmp>target)break;
			for(int k=i+1;k<nums.length;k++) {
				int tmp2=nums[k];
				if(tmp+tmp2==target) {
					x[0]=i;
					x[1]=k;
					flag=1;
				}
				
			}
			if(flag==1)break;
		}
		for(int g=0;g<2;g++) {
			System.out.println(x[g]);
		}
		//Integer x[]=a.toArray();
	}

}
