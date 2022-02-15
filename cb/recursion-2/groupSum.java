/*
Red Apples: Gloria Lee and Anjini Katari (with duckies Flounder and Watson)
APCS
HW64: Revisitation
2022-02-15
time spent: 1.5h
*/
public class groupSum{
    public boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length && target == 0){
            return true; 
        }
        else if (start >= 0 && nums.length > 1){ //if first val is included
            return groupSum(start + 1, nums, target - nums[start]);
        }
        else if (start >= 0 && nums.length > 1) {
           return groupSum(start + 1, nums, target);
        }
        else {
            return false;
        }

    }
    // (0, [2, 4, 8], 10) → true

}
