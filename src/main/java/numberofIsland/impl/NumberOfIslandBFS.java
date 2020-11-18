package numberofIsland.impl;

import numberofIsland.NumberOfIsland;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslandBFS implements NumberOfIsland
{

    public int numIslands(char[][] grid) {
        int nr = grid.length;
        int nc = grid[0].length;
        int noi = 0;
        for(int r = 0;r<nr;r++){
            for(int c=0;c<nc;c++){
                if(grid[r][c]=='1'){
                    noi++;
                    grid[r][c]='0';
                    Queue<Integer> q = new LinkedList<>();
                    q.add(r*nc+c);
                    while(!(q.isEmpty())){
                        int num = q.remove();
                        int i = num/nc;
                        int j = num%nc;
                        grid[i][j]='0';
                        if(i-1>=00 && grid[i-1][j]=='1'){
                            grid[i-1][j] = '0';
                            q.add((i-1)*nc+j);
                        }
                        if(i+1<nr && grid[i+1][j]=='1'){
                            grid[i+1][j] = '0';
                            q.add((i+1)*nc+j);
                        }
                        if(j-1>=0 && grid[i][j-1]=='1'){
                            grid[i][j-1] = '0';
                            q.add((i)*nc+j-1);
                        }
                        if(j+1<nc && grid[i][j+1]=='1'){
                            grid[i][j+1] = '0';
                            q.add((i)*nc+j+1);
                        }
                    }
                }
            }
        }
        return noi;
    }
}
