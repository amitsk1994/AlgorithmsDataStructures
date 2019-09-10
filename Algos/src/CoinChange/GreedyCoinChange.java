package CoinChange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//http://cse.unl.edu/~choueiry/S06-235/files/Algorithms.pdf
public class GreedyCoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer coins[] = {1,2,4,8}; 
		Arrays.sort(coins,Collections.reverseOrder());
        int len = coins.length; 
        int c = 22; 
        ArrayList<Integer> answer=changeCoins(coins, len, c);
        System.out.println ( "Greedy Algorithm: Optimal number of coins: ");
        System.out.println();
        for(int i=0;i<coins.length;i++) {
        	int cnt=0;
        	for(int j=0;j<answer.size();j++) {
        		if(coins[i]==answer.get(j)) {
        			cnt++;
        		}
        	}
        	if(cnt!=0) {
        		System.out.println(cnt+" coins of denomination "+coins[i]);
        	}
        	
        }
	}

	private static ArrayList changeCoins(Integer[] coins, int len, int c) {
		
		// TODO Auto-generated method stub
		ArrayList<Integer>arr=new ArrayList<Integer>();
		
		 for(int i=0; i< len; i++) {
			 while(c >= coins[i])
	          {
	            c= c - coins[i];
	            arr.add(coins[i]);
	          } 
		 }
		 
		 return arr;
	          
	}

}
