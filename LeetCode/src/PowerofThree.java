
public class PowerofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=59049;
		int a=n%3;
		int b=n/3;
		int flag=0;
		//if(a==0) {
			
				for(int i=0;i<=Math.sqrt(n)+1;i++) {
					//System.out.println("hi");
					if(Math.pow(3, i)==n) {
						flag=1;
						break;
					}
				}
			
		
		if(flag==1)System.out.println("true");
		else System.out.println("false");
	}

}
