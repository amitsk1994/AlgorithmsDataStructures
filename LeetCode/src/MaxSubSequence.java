
public class MaxSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
		
		int subSum=mSS(arr,0,arr.length-1);
		System.out.println(subSum);
	}
	static int mSS(int a[],int low,int high) {
		
		if(low==high) {
			return a[low];
		}
			int mid=(low+high)/2;
			int left=mSS(a,low,mid);
			int right=mSS(a,mid+1,high);
			int center=maxSpan(a,low,mid,high);
			int m= Math.max(Math.max(left,right), center);
			
			return m;
		
	}
	
	static int maxSpan(int a[],int low,int mid,int high) {
		int sum = 0; 
        int left_sum = Integer.MIN_VALUE; 
        for (int i = mid; i >= low; i--) 
        { 
            sum = sum + a[i]; 
            if (sum > left_sum) 
            left_sum = sum; 
        } 
  
        // Include elements on right of mid 
        sum = 0; 
        int right_sum = Integer.MIN_VALUE; 
        for (int i = mid + 1; i <= high; i++) 
        { 
            sum = sum + a[i]; 
            if (sum > right_sum) 
            right_sum = sum; 
        } 
  
        // Return sum of elements on left 
        // and right of mid 
        return left_sum + right_sum;
	}

}
