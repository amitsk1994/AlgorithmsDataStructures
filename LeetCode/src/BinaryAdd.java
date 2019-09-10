
public class BinaryAdd {
	 
	    public String addBinary(String a, String b) {
	        int a1=0,b1=0;
	        int j=0,k=0;
	        for(int i=a.length()-1;i>=0;i--){
	            char ch=a.charAt(i);
	            
	            if(ch=='1'){
	            	
	                a1+=(Math.pow(2,j));
	                
	            }
	            j++;
	        }
	        for(int i=b.length()-1;i>=0;i--){
	            char ch=b.charAt(i);
	            
	            if(ch=='1'){
	            	
	                b1+=(Math.pow(2,k));
	                
	            }
	            k++;
	        }
	        int sum=a1+b1;
	        return Integer.toBinaryString(sum);
	    }
	
}
