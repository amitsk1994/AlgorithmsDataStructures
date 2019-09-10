
public class FirstUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="";
		int j=0;
		//int flag2=0;
		for(int i=1;i<s.length();i++) {
			int flag=0;
			if(j<s.length()&&s.charAt(j)==s.charAt(i)&& i!=j) {
				j++;
				i=-1;
				flag=1;
				//flag2=flag;
			}
			if(i==s.length()-1 && flag==0) {
				break;
			}
		}
		if(j>=s.length()) {
			j=-1;
			}
		//if(flag2==1)j=-1;
		System.out.println(j);
	}

}
