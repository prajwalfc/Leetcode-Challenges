package numberofIsland.impl;

import numberofIsland.NumberOfIsland;

import java.util.Arrays;
import java.util.List;

public class NumberOfIslandUnionFind implements NumberOfIsland {

    public int numIslands(char[][] grid) {

        int nr = grid.length;
        int nc = grid[0].length;
        UnionFind uf = new UnionFind(grid);
        System.out.println(uf.getCount());

        for (int r = 0; r < nr; r++) {
            for (int c = 0; c < nc; c++) {

                System.out.println("[" + r + "][" + c + "]");
                if (grid[r][c] == '1') {
                    grid[r][c] = '0';

                    if (c - 1 >= 0 && grid[r][c - 1] == '1') {
                        uf.union(r * nc + c, r * nc + c - 1);
                        //grid[r][c-1]='0';

                    }
                    if (c + 1 < nc && grid[r][c + 1] == '1') {
                        uf.union(r * nc + c, r * nc + c + 1);
                        // grid[r][c+1]='0';
                    }
                    if (r - 1 >= 0 && grid[r - 1][c] == '1') {
                        uf.union(r * nc + c, (r - 1) * nc + c);
                        //grid[r-1][c]='0';
                    }
                    if (r + 1 < nr && grid[r + 1][c] == '1') {
                        uf.union(r * nc + c, (r + 1) * nc + c);
                        //grid[r+1][c]='0';
                    }
                }
            }
        }
        List<Integer> d = Arrays.asList(uf.parent);

        System.out.println(Arrays.asList(uf.parent));
        return uf.getCount();
    }

    class UnionFind {
        int n;
        int count;
        Integer[] parent;
        int[] treeSize;

        public UnionFind(char[][] grid) {
            int nr = grid.length;
            int nc = grid[0].length;
            n = nr * nc;
            parent = new Integer[n];
            treeSize = new int[n];
            Arrays.fill(treeSize, 1);
            for (int r = 0; r < nr; r++) {
                for (int c = 0; c < nc; c++) {
                    if (grid[r][c] == '1') {
                        parent[r * nc + c] = r * nc + c;
                        count++;
                    }
                }
            }
        }

        public int getCount() {
            return count;
        }

        public int find(int p) {
            while (p != parent[p]) {
                parent[p] = parent[parent[p]];
                p = parent[p];
            }
            return p;
        }

        public void union(int a, int b) {
            find(a);
            find(b);
            int parentA = find(a);
            int parentB = find(b);

            if (parentA == parentB) return;

            if (treeSize[parentA] >= treeSize[parentB]) {
                parent[parentB] = parentA;
                treeSize[parentA] += treeSize[parentB];
            } else {
                parent[parentA] = parentB;
                treeSize[parentB] += treeSize[parentA];

            }
            count--;
        }

        public boolean connected(int a, int b) {
            return parent[a] == parent[b];
        }
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '1', '1', '1'},
                {'0', '0', '0', '0', '0', '0', '1'},
                {'1', '1', '1', '1', '1', '0', '1'},
                {'1', '0', '0', '0', '1', '0', '1'},
                {'1', '0', '1', '0', '1', '0', '1'},
                {'1', '0', '1', '1', '1', '0', '1'},
                {'1', '1', '1', '1', '1', '1', '1'}
        };

        NumberOfIslandUnionFind uf = new NumberOfIslandUnionFind();
        System.out.println(uf.numIslands(grid));
    }
}