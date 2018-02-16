import java.util.HashSet;

public class Distinct {
    public static int solution(int[] A){
        HashSet<Integer> distinct = new HashSet<Integer>();
        for(int i = 0; i < A.length; i++){
            if(distinct.contains(A[i])){
                continue;
            }
            else{
                distinct.add(A[i]);
            }
        }
        return distinct.size();
    }
}
