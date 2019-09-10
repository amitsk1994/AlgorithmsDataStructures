package CoinChange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DynamicCoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coins[] = {1,5,10,25}; 
        int len = coins.length; 
        int c = 25; 
        int ans=minCoins(coins, len, c);
        System.out.println ( "Dynamic Algorithm Optimal number of coins: "+ans);
//        for(int i=0;i<ans.length;i++) {
//        	System.out.println(ans[i]);
//        }
	}

	private static int minCoins(int[] coins, int len, int c) { 
      
        int table[] = new int[c + 1]; 
  
        table[0] = 0; 
        //ArrayList<Integer>arr=new ArrayList();
       // HashMap<Integer,Integer>map=new HashMap();
        for (int i = 1; i <= c; i++) {
        	table[i] = Integer.MAX_VALUE; 
        }
        	
        
        for (int i = 1; i <= c; i++) 
        { 
            int flag=0;
            for (int j = 0; j < len; j++) {
            	if (coins[j] <= i) 
                {   
                	
                    int temp = table[i - coins[j]]; 
                    
                    if (temp != Integer.MAX_VALUE && temp + 1 < table[i]) {
                    	
                    	table[i] = temp + 1;
                    	
                    	
                    }           
                      
                }
            }
            
            
              
        } 
		  
        //System.out.println(arr);
//        for(int i:table) {
//        	System.out.println(i);
//        }
        return table[c]; 
          
    } 

}
