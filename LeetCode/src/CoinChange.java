import java.util.Arrays;

public class CoinChange{

    public static void main(String[] args) {
    	int[] coins = {186,419,83,408};
    	                
    			int amount=6249;
    	//int amount=11;
		//System.out.println(coinChange(arr,11));
		int cnt=0;
		Arrays.sort(coins);
    	for(int i=coins.length-1;i>=0;i--) {
    		while(amount>0) {
    		if(coins[i]<=amount) {
    			amount-=coins[i];
    			cnt++;
    		}
    		if(amount<coins[i]) {
    			break;
    		}
    		}
//    		if(amount<coins[i]) {
//    			break;
//    		}
    	}
    	 if(amount!=0)cnt=-1;
        System.out.println(cnt);
	}
}
