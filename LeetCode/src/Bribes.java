import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Bribes {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
    	int cnt=0;
    	for(int i=0;i<q.length;i++) {
    		if(q[i]-1==i) {
    			continue;
    		}
    		else {
    			if(q[i]-1-i >2) {
    				cnt=Integer.MAX_VALUE;
    				break;
    			}
    			else {
    				int cnt2=q[i]-i;
    				cnt+=cnt2;
    				int temp=q[i];
    				q[i]=q[cnt2];
    				q[cnt2]=temp;
    				
    			}
    		}
    	}
    	System.out.println(cnt);

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
                System.out.println(q[i]);
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
