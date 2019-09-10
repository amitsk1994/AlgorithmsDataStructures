import java.util.Arrays;

public class AddStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1="20";
		String num2="8";
		String temp1=num1;
		String temp2=num2;
		int flag=0;
		if(num1.charAt(0)=='-'&& num2.charAt(0)!='-') {
			num1.substring(1);
			flag=1;
		}
		else if(num1.charAt(0)!='-'&& num2.charAt(0)=='-') {
			num2.substring(1);
			flag=1;
		}
		else if(num1.charAt(0)=='-'&& num2.charAt(0)=='-') {
			num1.substring(1);
			num2.substring(1);
		}
		String s1= new StringBuffer(num1).reverse().toString();
		String s2=new StringBuffer(num2).reverse().toString();
		int[] m = new int[s1.length()>s2.length()?s1.length():s2.length()]; 
		for(int i=0;i<s1.length();i++) {
			m[i]=s1.charAt(i)-'0';
		}
		for (int j = 0; j < s2.length(); j++){
			if(flag==0) {
			m[j] = m[j]+(s2.charAt(j)-'0');
			}
			else m[j] = m[j]-(s2.charAt(j)-'0');
				
			} 
		
		String product=Arrays.toString(m);
		System.out.println(product);
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
		System.out.println(product);
	}

}
