package mergeintervals;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MergeIntervalsTest {


    @Test
    public void test(){

        assertArrayEquals(new int [][]{{1,5}}, MergeIntervals.merge(new int [][]{{1,4},{2,3},{4,5}}));
    }

}