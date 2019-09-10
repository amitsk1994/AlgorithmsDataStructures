
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution1 {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
    	int cnt=0;
    	for(int i=0;i<q.length;i++) {
    		if(q[i]!=i+1) {
    			for(int j=i;j<2;j++) {
    				int temp=q[j];
    				q[j]=q[j+1];
    				q[j+1]=temp;
    				cnt++;
    				if(q[j]==j+1) {
    					break;
    				}
    			}
    		}
    	}
    	System.out.println(cnt);
        for(int i=0;i<q.length;i++) {
        	System.out.println(q[i]);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}

