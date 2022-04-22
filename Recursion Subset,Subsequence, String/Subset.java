
public class Subset{
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};

            int found = 0;
        
            for ( int i = 0; i < nums.length;i++) {
                found ^= nums[i];  // this is XOR. when we have 2 similar objects it becomes 0 otherwise 1 
            }
            System.out.println(found);
        
    }
}
