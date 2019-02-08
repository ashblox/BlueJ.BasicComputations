 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int max = 0;
        if (integers[0] >= integers[1] && integers[0] >= integers[2]){
            max = integers[0];
        }
        if (integers[1] >= integers[2] && integers[1] >= integers[0]){
            max = integers[1];
        }
        if (integers[2] >= integers[1] && integers[2] >= integers[0]){
            max = integers[2];
        }
        return max;
        
    }
    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int max1 = Math.max(integers[0], integers[1]);
        int max2 = Math.max(integers[1], integers[2]);
        return Math.max(max1, max2);
    }
}
