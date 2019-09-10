
public class DetectCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="leetcode";
		int count=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)>='A'&&word.charAt(i)<='Z') {
				count++;
			}
		}
		if(count==1 && (word.charAt(0)>='A'||word.charAt(0)<='Z')) {
			System.out.println("true");
		}
		else if(count==word.length()) {
			System.out.println("true");
		}
		else if(count==0) {
			System.out.println("true");
		}
		else System.out.println("false");
	}

}
