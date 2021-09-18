
package gameoflife;
import java.util.Scanner;

public class GameOfLife 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Row");
        int row=sc.nextInt();
        System.out.println("Enter Number of Column");
        int col=sc.nextInt();
        int[][] arr = new int[row][col];
        
        System.out.println("Enter Element");
        for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < col; j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
       
          Grid1 g1=new Grid1();
        g1.dispGrid(arr,row,col);
        
        int[][] paddedMat = g1.padMatrix(arr,row,col);
        
        Evaluate1 e1 = new Evaluate1();
        e1.workOnNeigbour(paddedMat,row,col);   
   
    }
    
}
