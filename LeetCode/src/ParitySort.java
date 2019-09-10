
public class ParitySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {3,1,2,4};
		for(int i=0;i<A.length;i++) {
			if(A[i]%2==0) {
				int temp=A[0];
				A[0]=A[i];
				A[i]=temp;
			}
		}
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]);
		}
	}

}
