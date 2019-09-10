
public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=38;
		int ans;
		if(num==0)ans=0;
        ans= num%9==0?9:num%9;
        System.out.println(ans);
	}

}
