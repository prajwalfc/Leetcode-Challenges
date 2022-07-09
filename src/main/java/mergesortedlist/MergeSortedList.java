package mergesortedlist;

public class MergeSortedList {

    static int[] sortedMergedList(int[][] list) {

        int mergeSize = 0;

        for (int[] arr : list) {
            mergeSize += arr.length;
        }
        int[] mergedArray = new int[mergeSize];
        int[] rowToColumnVisitedMap = new int[list.length];

        int index = 0;

        while (true) {
            int smallest = Integer.MAX_VALUE;

            int chosenI = 0;
            for (int row = 0; row < rowToColumnVisitedMap.length; row++) {

                if (rowToColumnVisitedMap[row] >= list[row].length) {
                    continue;
                }
                if (smallest > list[row][rowToColumnVisitedMap[row]]) {

                    smallest = list[row][rowToColumnVisitedMap[row]];
                    chosenI = row;

                }

            }

            rowToColumnVisitedMap[chosenI]++;
            mergedArray[index] = smallest;
            if (index == mergeSize - 1) {
                break;
            }
            index++;
        }

        return mergedArray;

    }
}
