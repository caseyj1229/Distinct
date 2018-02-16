import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistinctTest {
    @Test
    void solution() {
        int[] A = {1,2,3,1,3,2,2};
        assertEquals(3,Distinct.solution(A));

        int[] B = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        assertEquals(1,Distinct.solution(B));

        int[] C = {1,2,3,4,5,6,7};
        assertEquals(7,Distinct.solution(C));

        int[] D = {1,-1,2,-2,3,-3};
        assertEquals(6,Distinct.solution(D));
    }
}