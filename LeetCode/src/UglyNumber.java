import java.util.ArrayList;

public class UglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=11;
		ArrayList<Integer>f=new ArrayList<Integer>();
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				if(i==2||i==3||i==5) {
					continue;
				}
				else if(!(i%2==0 || i%3==0)){
					f.add(i);
				}
			}
		}
		if(!(num%2==0 || num%3==0) ){
			System.out.println("false");
		}
		if(f.isEmpty()) {
			System.out.println("true");
		}
		else System.out.println("false");
		
	}

}
