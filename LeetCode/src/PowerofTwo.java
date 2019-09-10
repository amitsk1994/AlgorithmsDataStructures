
public class PowerofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1048576;
		int a=n%2;
		int b=n/2;
		int flag=0;
		//if(a==0) {
			
				for(int i=0;i<=Math.sqrt(n)+1;i++) {
					//System.out.println("hi");
					if(Math.pow(2, i)==n) {
						flag=1;
						break;
					}
				}
			
		
		if(flag==1)System.out.println("true");
		else System.out.println("false");
	}

}
