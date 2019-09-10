import java.util.ArrayList;

public class BannedWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String []banned = {"hit"};
		ArrayList<String>a=new ArrayList<String>();
		String arr[]=paragraph.split("[\\s@&.,?$+-]+");
		
		for(int i=0;i<banned.length;i++) {
			String chk=banned[i];
			for(int j=0;j<arr.length;j++) {
				String checkVar;
				if(arr[j].length()>chk.length()) {
					 checkVar=arr[j].substring(0,chk.length());
				}
				else {
					checkVar=arr[j];
				}
				if(checkVar.equals(chk)) {
					arr[j]=null;
				}
			}
		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		int maxC=0;
		String ans=new String();
		for(int j=0;j<arr.length;j++) {
			String max=arr[j];
			int cnt=0;
			if(max==null)continue;
		for(int i=j;i<arr.length;i++) {
			if(arr[i]==null)continue;
			
			if(arr[i].equalsIgnoreCase(max)) {
				cnt++;
				if(i>j) {
					arr[i]=null;
				}
				
			}	
		}
		if(cnt>maxC) {
			maxC=cnt;
			ans=arr[j];
		}
		
		
		}
		
		System.out.println(ans);
		
		
	}

}
