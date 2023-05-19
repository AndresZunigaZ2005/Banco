package leetcode;

public class TwoSum {

	public static void main(String[] args) {
		int [] nums = {3,2,4};
		int resp[] = twoSum(nums, 6);
		for (int i : resp) {
			System.out.println(i);
		}
	}
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if((nums[i]+nums[j])==target){
                    int answer [] = {i,j};
                    return answer;
                }
            }
        }
        return null;
    }
}
