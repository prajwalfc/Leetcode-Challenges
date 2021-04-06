package mergeintervals;

import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {

    static int [][]  merge(int [][] arr){
        int col = 2;
        int row = arr.length;

        Arrays.sort(arr, (a,b)->Integer.compare(a[0],b[0]));

        int result[][] = new int[row][col];
        int j=0;
        int i =1;
        int [] curr = arr[0];
        while(i<row){
            int [] next = arr[i];

            int x1 = curr[0];
            int y1 = curr[1];
            int x2 = next [0];
            int y2 = next [1];
            if (y1 >= x2){
                curr[0] = x1;
                curr[1] = (y1>y2)? y1:y2;

            }
            else{
                result[j][0]= curr[0];
                result[j][1]= curr[1];
                curr = next;
                j++;
            }
            i++;
        }
        result[j][0]= curr[0];
        result[j][1]= curr[1];
        return Arrays.copyOf(result,j+1);
    }
}
