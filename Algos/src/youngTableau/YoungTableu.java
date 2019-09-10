package youngTableau;
import java.util.Scanner;
public class YoungTableu {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		//young tableau matrix that we will be using in the code
		int Y[][]= new int[][] {
			{2,4,12,Integer.MAX_VALUE},
			{3,8,Integer.MAX_VALUE,Integer.MAX_VALUE},
			{5,9,Integer.MAX_VALUE,Integer.MAX_VALUE},
			{14,16,Integer.MAX_VALUE,Integer.MAX_VALUE}
		};
		//options for particular operations on the young tableau
		System.out.println("What is the operation?");
		System.out.println("1. Extract minimum from the tableau");
		System.out.println("2. Insert element to the tableau");
		System.out.println("3. Find whether an element is present in the tableau");		
		
		int n = reader.nextInt();
		if(n==1) {
			System.out.println("The minimum in the tabeau is: "+extract_min(Y));
		}
		else if(n==2) {
			System.out.println("Enter the new element: ");
			int newElement=reader.nextInt();
			
			int newY[][]=insertElement(Y,newElement);
			if(newY[0][0]==Integer.MAX_VALUE) {
				System.out.println("Tableu is full. New element cannot be entered");
			}
			else {
				System.out.println("New Tableau is:");
				for(int i=0;i<newY[0].length;i++) {
			    	 for(int j=0;j<newY.length;j++) {
			    		 System.out.print(newY[i][j]+"  ");
			    		 }
			    	 System.out.println();
			    	 }
			     }			
			}
		else if(n==3) {
			System.out.println("Enter the element you want to find: ");
			int findElement=reader.nextInt();
			boolean bool=find(Y,findElement);
			if(bool==true) {
				System.out.println("Element found");
			}
			else {
				System.out.println("Element not found");
			}			
		}
		else {
			System.out.println("Wrong option");
		}

		reader.close();
	}
	
	//method to find minimum in the tableau
	 public static int extract_min(int [][]youngT){
		     int x = youngT[0][0];
		     youngT[0][0] = Integer.MAX_VALUE;
		     youngify(youngT, 0, 0);
		     return x;
	 }
	 
	 //method to insert an element in the tableau
	 public static int[][] insertElement(int [][]young_t, int key){
		 		int i=young_t[0].length-1;
		 		int j=young_t.length-1;
		        int x, y, max, temp;
		        if (young_t[i][j] < key){
		        	young_t[0][0]=Integer.MAX_VALUE;
		            System.out.println("No more insertions possible, The tableau is full");
		            return young_t;
		        }
		        young_t[i][j] = key;
		        x = i;
		        y = j;
		        max = Integer.MAX_VALUE;
		        while( (i > 0 || j > 0) && (max > young_t[i][j]) ){
		            temp = young_t[x][y];
		            young_t[x][y] = young_t[i][j];
		            young_t[i][j] = temp;
		            i = x;
		            j = y;
		            if (i - 1 >= 0 && young_t[i][j] < young_t[i-1][j]){
		                x = i -1;
		                y = j;
		            }
		            if(j -1 >= 0 && young_t[x][y] < young_t[i][j-1]){
		                x = i;
		                y = j - 1;
		            }
		            max = young_t[x][y];
		        }
		        return young_t;
		    }

	 //method to retain the heap structure of the tableau
	 public static void youngify(int [][] young_t, int i, int j){
		          int x, y;

		          x = i;
		          y = j;
		          int m=young_t[0].length;
		          int n=young_t.length;
		         int temp;
		          if (i + 1 < m){
		              if (young_t[i][j] > young_t[i+1][j]){
		                  x = i + 1;
		                  y = j;
		              }
		          }
		           
		          if (j+1 < n){
		              if (young_t[x][y] > young_t[i][j+1]){
		                  x = i;
		                  y = j+1;
		              }
		          }
		           
		          if(x != i || y != j){
		              temp = young_t[x][y];
		              young_t[x][y] = young_t[i][j];
		              young_t[i][j] = temp;
		              youngify(young_t, x, y);
		          }
		      }
	 
	 //method to find a particular element in the tableau
	 public static boolean find(int [][]youngT,int key){
		 boolean ans=false;
	     for(int i=0;i<youngT.length;i++) {
	    	 for(int j=0;j<youngT[0].length;j++) {
	    		 if(youngT[i][j]==key) {
	    			 ans=true;
	    			 break;
	    		 }
	    	 }
	     }
	     return ans;
 }
}
