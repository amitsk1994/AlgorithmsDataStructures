import java.util.HashMap;
import java.util.Map;

/*
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 *  Add the two numbers and return it as a linked list.
 */
class Solution {
    public int romanToInt(String s) {
        Map<String,Integer>roman=new HashMap<String,Integer>();
        roman.put("I",1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L",50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);
        
                
        for(int i=0;i<s.length();i++){
            
        }
        return 1;
    }
}