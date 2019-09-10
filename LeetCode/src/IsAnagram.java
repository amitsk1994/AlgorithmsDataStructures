import java.util.Arrays;

public class IsAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="anagram";
		String t="nagaram";
		char arr1[]=s.toCharArray();
		char arr2[]=t.toCharArray();
		int flag=0;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==arr2[i]) {
				continue;
			}
			else {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("false");
		}
		else {
			System.out.println("true");
		}
	}

}
