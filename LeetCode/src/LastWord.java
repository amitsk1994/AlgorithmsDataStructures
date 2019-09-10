
public class LastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p;
		String s="Hello World";
		StringBuffer str=new StringBuffer();
//		if(!(str.contains(" "))) {
//			System.out.println("0");
//		}
		//else {
			for(int i=s.length()-1;i>=0;i--) {
				if(s.charAt(i)==' ') {
					continue;
				}
				else {
					str.append(s.charAt(i));
					if(i!=0 && s.charAt(i-1)==' ')break;
				}
			}
		//}
		System.out.println(str.length());
		
	}

}
