// cyclic sort problem

public class missingnumber {
    public static void main(String[] args) {
        int i = 0;
        while( i< nums.length) {
            
            // starting from 0 to N 
            int correct = nums[i];
            if( nums[i] < nums.length && nums[i] != nums[correct] ) {
                swap(nums,i,correct);
            } else {
                i++;
            }
        }
        // search for missiing element
        for (int index = 0; index < nums.length ; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        
        return nums.length;
    }
    
    static void swap(int[] nums, int i, int correct) {
        int temp =nums[i];
        nums[i] = nums[correct];
        nums[correct] =temp;
    }
}
