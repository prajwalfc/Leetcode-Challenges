package numberofIsland.impl;

import numberofIsland.NumberOfIsland;

public class NumberOfIslandDFS implements NumberOfIsland {

        public int numIslands(char[][] grid) {
            int nr = grid.length;
            int nc = grid[0].length;
            int noi = 0;
            for(int r = 0;r<nr;r++){
                for(int c=0;c<nc;c++){
                    if(grid[r][c]=='1'){
                        noi++;
                        dfs(r,c,grid);
                    }
                }
            }
            return noi;
        }
        private void dfs(int r, int c, char [][]grid){
            int nr = grid.length;
            int nc = grid[0].length;
            if(r < 0 || r>=nr || c<0 || c>=nc || grid [r][c] == '0'){
                return;
            }
            grid[r][c] = '0';
            dfs(r-1,c,grid);
            dfs(r+1,c,grid);
            dfs(r,c-1,grid);
            dfs(r,c+1,grid);
        }
    }
