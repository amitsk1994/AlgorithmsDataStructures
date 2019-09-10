
public class PrisonOccupied {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cells= {0,1,0,1,1,0,0,1};
		int nCell[]=new int[cells.length];
		for(int k=0;k<nCell.length;k++) {
			nCell[k]=0;
		}
		int N=2;
		
		for(int i=0;i<N;i++) {
			for(int j=1;j<cells.length-1;j++) {
				if((cells[j-1]==0 && cells[j+1]==0)||(cells[j-1]==1 && cells[j+1]==1)) {
					nCell[j]=1;
				}
				else nCell[j]=0;
			}
			cells=nCell;
		}
		for(int i=0;i<cells.length;i++) {
			System.out.print(cells[i]+" ");
		}
	}

}
