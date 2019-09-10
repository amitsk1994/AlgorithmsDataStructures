
public class ValidPalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "A man, a plan, a canal: Panaa";
		//s = s.replaceAll("[-+.^:,]","");
		
		
		StringBuffer str=new StringBuffer();
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='0'&&s.charAt(i)<='9')) {
				
				str.append(Character.toString(s.charAt(i)));
			}
			else {
				continue;
			}
		}
		System.out.println(str);
		System.out.println(str.reverse());
		if(str.toString().equalsIgnoreCase(str.reverse().toString())) {
			System.out.println("true");
		}
		else System.out.println("false");
	}

}
