
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   char s[]= {'h','e','l','l','o'};
   int j=s.length-1;
   char temp;
   for(int i=0;i<s.length/2;i++) {
	   temp=s[i];
	   s[i]=s[j];
	   s[j]=temp;
	   j--;
	   
	   
   }
   for(int i=0;i<s.length;i++) {
	   System.out.print(s[i]);
   }
	}

}
