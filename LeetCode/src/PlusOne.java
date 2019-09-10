import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PlusOne {
	public static void main(String[] args) {
		int arr[]= {1,2,3};//{0,0,0,0,0,0,0,0,0,0}
		//arr[arr.length-1]+=1;
		int arr2[]=new int [arr.length+1];
		arr2[0]=0;
		int flag=0;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]>=9) {
				flag++;//9
				
				if(i==0 && flag==arr.length) {
					arr2[0]=1;
					arr[i]=0;
					
					break;
				}
				else {
				arr[i]=0;
				//arr[i-1]++;
				}
			}
			else {
				arr[i]++;
				break;
			}
		}
		if(arr2[0]==1) {
			int k=1;
			for(int i=0;i<arr.length;i++) {
				arr2[k]=arr[i];
				k++;
			}
		}
		if(arr2[0]==1) {
			for(int i=0;i<arr2.length;i++) {
				System.out.print(arr2[i]);
			}
		}
		else {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		}
		
	}
		
		
	}
