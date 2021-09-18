
package gameoflife;
public class Evaluate1 
{
    int[][][] generation = new int[10][10][100];
    
    public void workOnNeigbour(int[][] paddedMatrix, int row, int col)
    {
        int count = 0;
           int Current = 0 ;
           System.out.println("Next Generation set");
            for (int i = 1; i < row+1; i++)
            {
                for (int j = 1; j < col+1; j++)
                {
                    count = 0;
                    Current = paddedMatrix[i - 1][ j - 1] + paddedMatrix[i - 1][j + 1] + paddedMatrix[i + 1][j - 1] + paddedMatrix[i + 1][ j + 1] +
                        paddedMatrix[i - 1][ j] + paddedMatrix[i][ j + 1] + paddedMatrix[i ][ j - 1] + paddedMatrix[i + 1][ j]; 
                    
                    if (paddedMatrix[i][ j] == 0 && Current == 3)
                    {
                        paddedMatrix[i][ j] = 1;
                        System.out.print("| " + paddedMatrix[i][ j] + " Reincarnated");
                         
                    }
                    else if (Current == 2 || Current == 3)
                    {
                        System.out.print("| " + paddedMatrix[i][ j] + " Lives");
                        
                    }
                    else if (Current < 2 || Current > 3)
                    {
                        System.out.print("| " + paddedMatrix[i][ j] + " Dies");
                        paddedMatrix[i][ j] = 0;
                       
                    }
                    else { 
                    }
                }
                
                System.out.println();
            }
    }
}
