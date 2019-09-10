package Tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Pair1{
    int x,y;
    public Pair1(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class ConstructBinTree {
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        //boolean visited=new boolean[image.length*image.length];
        int row[]={-1,1,0,0};
        int col[]={0,0,-1,1};
        Queue<Pair1> q=new LinkedList();
        q.add(new Pair1(sr,sc));
        int target=image[sr][sc];
        while(!q.isEmpty()){

            Pair1 p=q.poll();
            int x=p.x;
            int y=p.y;
            image[x][y]=newColor;

            for(int i=0;i<4;i++){
                if(isSafe(x+row[i],y+col[i],image,target)){
                    //q.add(image[x+row[i]][y+col[i]]);
                    q.add(new Pair1(x+row[i],y+col[i]));
                }
            }
        }
        return image;
    }

    static boolean isSafe(int x,int y,int[][]image,int init){

        if(x<0)return false;
        if(y<0)return false;
        if(x>image.length-1)return false;
        if(y>image.length-1)return false;
        if(image[x][y]!=init)return false;
        return true;
    }

    public static void main(String[] args)
    {
        // matrix showing portion of the screen having different colors
        int M[][]={{1,1,1},{1,1,0},{1,0,1}};

        // start node
        int x = 1, y = 1;   // target color = "X"

        // replacement color
        int replacement = 2;

        // replace target color with replacement color
        int arr[][]=floodFill(M, x, y, replacement);

        // print the colors after replacement
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}