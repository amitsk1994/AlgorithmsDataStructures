
public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1= {1,2,3,0,0,0};
		int m=3;
		int[] nums2= {5,6,7};
		int n=3;
		int[] L=new int[m];
		int[] R=new int[n];
		int i=0,j=0;
		for(i=0;i<m;i++) {
			L[i]=nums1[i];
		}
		for(j=0;j<m;j++) {
			R[j]=nums2[j];
		}
		int k=0;
		i=0;
		j=0;
		while(i<m && j<n) {
			if(L[i]<=R[j]) {
				nums1[k]=L[i];
				i++;
			}
			else {
				nums1[k]=R[j];
				j++;
			}
			k++;
		}
		 /* Copy remaining elements of L[] if any */
        while (i < m) 
        { 
            nums1[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n) 
        { 
            nums1[k] = R[j]; 
            j++; 
            k++; 
        } 
        for(int l=0;l<nums1.length;l++) {
        	System.out.println(nums1[l]);
        }
	}

}
