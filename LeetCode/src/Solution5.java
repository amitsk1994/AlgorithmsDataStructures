import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'ada' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER year as parameter.
     */

    public static int ada(int year) {
    	year=1943;
    	Calendar c = Calendar.getInstance();
    	c.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
    	c.set(Calendar.DAY_OF_WEEK_IN_MONTH, 2);
    	c.set(Calendar.MONTH,(Integer) Calendar.OCTOBER);
    	c.set(Calendar.YEAR, (Integer)year);
		int a= c.get(Calendar.DATE);
		System.out.println(a);
		
		return a;
				
    }

}

public class Solution5 {
    public static void main(String[] args) throws IOException {
    	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());
        
        int result = Result.ada(year);

       // bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
