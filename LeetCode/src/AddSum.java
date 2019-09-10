
public class AddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=3;
		
		while (b != 0) 
	    { 
	        int c = a & b;   
	        a = a ^ b;  
	        b = c << 1; 
	    } 
	    //return x; 
		System.out.println(a);
	}

}
