
public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="1010";
		String b="1011";
		String temp1=a;
		String temp2=b;
//		if(num1.charAt(0)=='-'&& num2.charAt(0)!='-') {
//			num1.substring(1);
//		}
//		else if(num1.charAt(0)!='-'&& num2.charAt(0)=='-') {
//			num2.substring(1);
//		}
//		else if(num1.charAt(0)=='-'&& num2.charAt(0)=='-') {
//			num1.substring(1);
//			num2.substring(1);
//		}
		
		String s1= new StringBuffer(a).reverse().toString();
		String s2=new StringBuffer(b).reverse().toString();
		int[] m = new int[s1.length()+s2.length()]; 
		for (int i = 0; i < s1.length(); i++){ 
			for (int j = 0; j < s2.length(); j++){ 
				m[i+j] = m[i+j]+(s1.charAt(i)-'0')*(s2.charAt(j)-'0');
				} 
		}
		String product="";
		for (int i = 0; i < m.length; i++){ 
			int digit = m[i]%10; 
			int carry = m[i]/10; 
			if(i+1<m.length){ 
			m[i+1] = m[i+1] + carry; 
			}
			product= digit+product;
			}
		while(product.length()>1 && product.charAt(0) == '0') 
        { 
            product = product.substring(1); 
        } 
		if(temp1.charAt(0)=='-'&& temp2.charAt(0)!='-') {
			product=new StringBuffer(product).insert(0, '-').toString();
		}
		else if(temp1.charAt(0)!='-'&& temp2.charAt(0)=='-') {
			product=new StringBuffer(product).insert(0, '-').toString();
		}
		else if(temp1.charAt(0)=='-'&& temp2.charAt(0)=='-') {
			product=product;
		}
	}

}
